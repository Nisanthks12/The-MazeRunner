package M.model.game_objects

import M.model.engine.EngineVec

class Runner(inputLocation: EngineVec,
             inputVelocity: EngineVec) extends PhysicalObject(inputLocation, inputVelocity) {

  val speed: Double = 4.0

  def move(direction: EngineVec){
    val normalDirection = direction.normal2d()
    this.velocity = new EngineVec(normalDirection.x * speed, normalDirection.y * speed)
  }

  def stop(): Unit ={
    this.velocity = new EngineVec(0, 0)
  }

}
