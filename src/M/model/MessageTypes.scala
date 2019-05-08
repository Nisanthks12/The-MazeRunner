package M.model

// Received by Multiple Types
case object SendGameState
case class GameState(gameState: String)


// Received by GameActor
case object UpdateGame
case class AddRunner(username: String)
case class RemoveRunner(username: String)
case class MoveRunner(username: String, x: Double, y:Double)
case class StopRunner(username: String)
case class LoadMaze(levelNumber: Int)


