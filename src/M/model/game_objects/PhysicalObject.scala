package M.model.game_objects

import M.model.engine.EngineVec

class PhysicalObject(var location: EngineVec, var velocity: EngineVec) extends GameObject {

  def onGround(): Unit = {}
  def collide(): Unit = {}


  override def toString = s"PhysicalObject($location, $velocity)"
}
