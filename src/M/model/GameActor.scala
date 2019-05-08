package M.model

import akka.actor.{Actor, ActorRef}
import M.model.engine.EngineVec

case object UpdateGame
case class AddRunner(username: String)
case class RemoveRunner(username: String)
case class MoveRunner(username: String, x: Double, y:Double)
case class StopRunner(username: String)
case class LoadMaze(levelNumber: Int)

case object SendGameState
case class GameState(gameState: String)


class GameActor extends Actor {

  var runners: Map[String, ActorRef] = Map()

  val game: Game = new Game()
  var mazeNumber = 0
  loadMaze(mazeNumber)

  def loadMaze(mazeNumber: Int): Unit ={
    val maze = Maze(mazeNumber)
    game.loadMaze(maze)
  }

  override def receive: Receive = {
    case message: AddRunner => game.addRunner(message.username)
    case message: RemoveRunner => game.removeRunner(message.username)
    case message: MoveRunner => game.runners(message.username).move(new EngineVec(message.x, message.y))
    case message: StopRunner => game.runners(message.username).stop()

    case UpdateGame => game.update()

    case SendGameState => sender() ! GameState(game.gameState())
  }
}
