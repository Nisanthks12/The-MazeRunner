package M.model

import play.api.libs.json.{JsValue, Json}
import M.model.game_objects._
import M.model.engine.{Engine, EngineVec, Arena}


class Game {

  val arena: Arena = new Arena(10)
  var walls: List[Wall] = List()
  var maze: Maze = new Maze()
  var runners: Map[String, Runner] = Map()
  val runnerSize: Double = 0.3
  var lastUpdateTime: Long = System.nanoTime()

  def loadMaze(newMaze: Maze): Unit = {
    arena.boundaries = List()
    maze = newMaze
    walls = List()
    blockTile(0, 0, maze.gridWidth, maze.gridHeight)
    maze.wallLocations.foreach(wall => placeWall(wall.x, wall.y))
    runners.values.foreach(runner => runner.location = startingVector())

  }

  def addRunner(id: String): Unit = {
    val runner = new Runner(startingVector(), new EngineVec(0, 0))
    runners += (id -> runner)
    arena.objects = runner :: arena.objects
  }

  def removeRunner(id: String): Unit = {
    runners(id).destroy()
    runners -= id
  }

  def blockTile(x: Int, y: Int, width: Int = 1, height: Int = 1): Unit = {
    val ul = new EngineVec(x, y)
    val ur = new EngineVec(x + width, y)
    val lr = new EngineVec(x + width, y + height)
    val ll = new EngineVec(x, y + height)

    arena.boundaries ::= new Boundary(ul, ur)
    arena.boundaries ::= new Boundary(ur, lr)
    arena.boundaries ::= new Boundary(lr, ll)
    arena.boundaries ::= new Boundary(ll, ul)
  }

  def placeWall(x: Int, y: Int): Unit = {
    blockTile(x, y)
    walls = new Wall(x, y) :: walls
  }

  def startingVector(): EngineVec = {
    new EngineVec(maze.startingLocation.x + 0.5, maze.startingLocation.y + 0.5)
  }

  def update(): Unit = {
    val time: Long = System.nanoTime()
    val dt = (time - this.lastUpdateTime) / 1000000000.0
    Engine.updateWorld(this.arena, dt)
    checkHome()
    this.lastUpdateTime = time
  }

  def gameState(): String = {
    val gameState: Map[String, JsValue] = Map(
      "gridSize" -> Json.toJson(Map("x" -> maze.gridWidth, "y" -> maze.gridHeight)),
      "start" -> Json.toJson(Map("x" -> maze.startingLocation.x, "y" -> maze.startingLocation.y)),
      "home" -> Json.toJson(Map("x" -> maze.home.x, "y" -> maze.home.y)),
      "walls" -> Json.toJson(this.walls.map({ w => Json.toJson(Map("x" -> w.x, "y" -> w.y)) })),
      "runners" -> Json.toJson(this.runners.map({ case (k, v) => Json.toJson(Map(
        "x" -> Json.toJson(v.location.x),
        "y" -> Json.toJson(v.location.y),
        "v_x" -> Json.toJson(v.velocity.x),
        "v_y" -> Json.toJson(v.velocity.y),
        "id" -> Json.toJson(k))) })),
    )

    Json.stringify(Json.toJson(gameState))
  }

  def checkHome(): Unit = {
    // TODO: Objective 1

    for ((k,v)<- runners){
      val dis = Math.sqrt(Math.pow(maze.home.x+0.5 - v.location.x, 2.0) + Math.pow(maze.home.y+0.5 - v.location.y, 2.0))
      if(dis < runnerSize){
        v.location = startingVector()
      }
    }
  }
}
