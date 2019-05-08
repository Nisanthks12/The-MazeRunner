package M.model.engine

class EngineVec(var x: Double, var y: Double, var z: Double = 0.0) {

  def distance2d(other: EngineVec): Double = {
    Math.sqrt(Math.pow(x - other.x, 2.0) + Math.pow(y - other.y, 2.0))
  }

  def normal2d(): EngineVec = {
    if (x == 0 && y == 0) {
      new EngineVec(0, 0)
    } else {
      val magnitude = Math.sqrt(Math.pow(x, 2.0) + Math.pow(y, 2.0))
      new EngineVec(x / magnitude, y / magnitude, z)
    }
  }

  override def toString: String = {
    "(" + x + ", " + y + ", " + z + ")"
  }

}
