package M.model

import akka.actor.{Actor, ActorRef, PoisonPill, Props}
import M.model.engine.EngineVec


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

    case UpdateGame =>
      game.update()
      if (game.homeHealth <= 0) {
        game.homeHealth = 2
        mazeNumber = (mazeNumber + 1) % 3
        loadMaze(mazeNumber)
      }
    case SendGameState => sender() ! GameState(game.gameState())
  }
}
