package M.model.tests
import java.awt.geom.Area

import org.scalatest._
import M.model.Game
import M.model.engine.Arena


class UnitTesting extends FunSuite {
  test("Testing update function"){
    var CurrentGame = new Game()
    CurrentGame.update()
    var currentUpdateTime = CurrentGame.lastUpdateTime
    assert(CurrentGame.lastUpdateTime == currentUpdateTime)
  }
  test("Testing arena gravity"){
    def createArena(gravity: Int): Unit = {
      val arena: Arena = new Arena(gravity)
      assert(arena.gravity == gravity)
    }
    createArena(1)
    createArena(15)
    createArena(100)
    createArena(-1)
  }

  test("Testing add players"){
    var CurrentGame = new Game()
    var playerID_1 = "Test 1"
    CurrentGame.addRunner(playerID_1)
    var actualPlayerCount = CurrentGame.runners.size
    assert(actualPlayerCount == 1)
    var CurrentGame_2 = new Game()
    var playerID_2 = "Test 2"
    CurrentGame_2.addRunner(playerID_1)
    CurrentGame_2.addRunner(playerID_2)
    var actualPlayerCount_2 = CurrentGame_2.runners.size
    assert(actualPlayerCount_2 == 2)
  }
  test("Testing remove players"){
    var CurrentGame = new Game()
    var playerID_1 = "Test 1"
    CurrentGame.addRunner(playerID_1)
    CurrentGame.removeRunner(playerID_1)
    var actualPlayerCount = CurrentGame.runners.size
    assert(actualPlayerCount == 0)
    var CurrentGame_2 = new Game()
    var playerID_2 = "Test 2"
    CurrentGame_2.addRunner(playerID_1)
    CurrentGame_2.addRunner(playerID_2)
    CurrentGame_2.removeRunner(playerID_1)
    CurrentGame_2.removeRunner(playerID_2)
    var actualPlayerCount_2 = CurrentGame_2.runners.size
    assert(actualPlayerCount_2 == 0)
  }


}
