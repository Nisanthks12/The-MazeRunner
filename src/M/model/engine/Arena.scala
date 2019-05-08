package M.model.engine

import M.model.game_objects.{Boundary, PhysicalObject}

class Arena(var gravity: Double) {

  var objects: List[PhysicalObject] = List()
  var boundaries: List[Boundary] = List()

}
