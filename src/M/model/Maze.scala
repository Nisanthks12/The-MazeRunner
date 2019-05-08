package M.model

object Maze {

  def apply(number: Int): Maze ={

      new Maze{
        wallLocations = List(

          new GridLocation(1,1),
          new GridLocation(2,1),
          new GridLocation(3,1),
          new GridLocation(4,1),
          new GridLocation(5,1),
        new GridLocation(6,1),
        new GridLocation(7,1),
        new GridLocation(8,1),
        new GridLocation(9,1),
        new GridLocation(10,1),
        new GridLocation(11,1),
        new GridLocation(12,1),

          new GridLocation(14,1),
          new GridLocation(15,1),
          new GridLocation(16,1),
          new GridLocation(17,1),
          new GridLocation(18,1),
          new GridLocation(19,1),
          new GridLocation(20,1),
          new GridLocation(21,1),
          new GridLocation(22,1),
        new GridLocation(23,1),
        new GridLocation(24,1),

          new GridLocation(24,2),
        new GridLocation(1,3),
        new GridLocation(3,3),
        new GridLocation(4,3),
        new GridLocation(5,3),
        new GridLocation(6,3),
        new GridLocation(7,3),
        new GridLocation(8,3),
        new GridLocation(9,3),
        new GridLocation(10,3),
        new GridLocation(11,3),
        new GridLocation(12,3),
        new GridLocation(13,3),

        new GridLocation(14,3),
          new GridLocation(15,3),
          new GridLocation(16,3),
        new GridLocation(17,3),
        new GridLocation(18,3),
        new GridLocation(19,3),
        new GridLocation(20,3),
        new GridLocation(21,3),
          new GridLocation(22,3),


          new GridLocation(1,4),
          new GridLocation(3,4),
          new GridLocation(11,4),
          new GridLocation(21,4),
          new GridLocation(23,4),

          new GridLocation(1,5),
          new GridLocation(3,5),
          new GridLocation(5,5),
          new GridLocation(6,5),
          new GridLocation(7,5),
          new GridLocation(8,5),
          new GridLocation(9,5),
          new GridLocation(10,5),
          new GridLocation(11,5),
          new GridLocation(12,5),
          new GridLocation(13,5),
          new GridLocation(14,5),

          new GridLocation(16,5),
          new GridLocation(17,5),
          new GridLocation(18,5),
          new GridLocation(19,5),
          new GridLocation(21,5),
          new GridLocation(23,5),

          new GridLocation(1,6),
          new GridLocation(3,6),
          new GridLocation(11,6),
          new GridLocation(19,6),
          new GridLocation(21,6),
          new GridLocation(23,6),

          new GridLocation(1,7),
          new GridLocation(3,7),
          new GridLocation(5,7),
          new GridLocation(7,7),
          new GridLocation(8,7),
          new GridLocation(9,7),
          new GridLocation(11,7),
          new GridLocation(13,7),
          new GridLocation(14,7),
          new GridLocation(15,7),
          new GridLocation(16,7),
          new GridLocation(17,7),
          new GridLocation(19,7),
          new GridLocation(21,7),
          new GridLocation(23,7),

          new GridLocation(1,8),

          new GridLocation(3,8),
          new GridLocation(5,8),
          new GridLocation(7,8),
          new GridLocation(19,8),
          new GridLocation(21,8),
          new GridLocation(23,8),

          new GridLocation(1,9),
          new GridLocation(3,9),
          new GridLocation(5,9),

          new GridLocation(7,9),
          new GridLocation(9,9),
          new GridLocation(10,9),
          new GridLocation(11,9),
          new GridLocation(12,9),
          new GridLocation(13,9),
          new GridLocation(14,9),
          new GridLocation(15,9),
          new GridLocation(17,9),
          new GridLocation(19,9),
          new GridLocation(21,9),
          new GridLocation(23,9),

          new GridLocation(1,10),

          new GridLocation(3,10),
          new GridLocation(5,10),
          new GridLocation(15,10),
          new GridLocation(17,10),
          new GridLocation(19,10),
          new GridLocation(21,10),
          new GridLocation(23,10),
          new GridLocation(1,11),
          new GridLocation(3,11),


          new GridLocation(5,11),
          new GridLocation(7,11),
          new GridLocation(9,11),
          new GridLocation(11,11),
          new GridLocation(12,11),

          new GridLocation(13,11),
          new GridLocation(15,11),
          new GridLocation(17,11),
          new GridLocation(19,11),
          new GridLocation(21,11),
          new GridLocation(23,11),

          new GridLocation(1,12),
          new GridLocation(3,12),
          new GridLocation(5,12),
          new GridLocation(7,12),
          new GridLocation(9,12),
          new GridLocation(11,12),

          new GridLocation(15,12),
          new GridLocation(17,12),

          new GridLocation(21,12),
          new GridLocation(23,12),

          new GridLocation(1,13),
          new GridLocation(3,13),
          new GridLocation(5,13),
          new GridLocation(7,13),
          new GridLocation(9,13),
          new GridLocation(11,13),

          new GridLocation(12,13),
          new GridLocation(13,13),

          new GridLocation(15,13),
          new GridLocation(17,13),
          new GridLocation(19,13),
          new GridLocation(21,13),
          new GridLocation(23,13),

          new GridLocation(1,14),
          new GridLocation(3,14),
          new GridLocation(5,14),
          new GridLocation(7,14),
          new GridLocation(17,14),
          new GridLocation(19,14),

          new GridLocation(21,14),
          new GridLocation(23,14),

          new GridLocation(1,15),
          new GridLocation(3,15),
          //new GridLocation(5,13),
          new GridLocation(7,15),
          new GridLocation(10,15),
          new GridLocation(11,15),

          new GridLocation(14,15),
          new GridLocation(13,15),

          new GridLocation(15,15),
          new GridLocation(16,15),
          new GridLocation(17,15),

          new GridLocation(19,15),
          new GridLocation(21,15),
          new GridLocation(23,15),

          new GridLocation(1,16),
          new GridLocation(3,16),
          new GridLocation(5,16),
          new GridLocation(7,16),
          new GridLocation(19,16),
          new GridLocation(21,16),

          new GridLocation(23,16),

          new GridLocation(1,17),
          new GridLocation(3,17),
          new GridLocation(5,17),
          new GridLocation(7,17),
          new GridLocation(8,17),
          new GridLocation(9,17),

          new GridLocation(10,17),
          new GridLocation(11,17),

          new GridLocation(12,17),
          new GridLocation(13,17),
          new GridLocation(14,17),
          new GridLocation(15,17),
          new GridLocation(16,17),

          new GridLocation(18,17),

          new GridLocation(19,17),

          new GridLocation(21,17),

          new GridLocation(1,18),
          new GridLocation(3,18),
          new GridLocation(5,18),
          new GridLocation(21,18),
          new GridLocation(23,18),

          new GridLocation(3,19),

          new GridLocation(5,19),
          new GridLocation(6,19),

          new GridLocation(7,19),
          new GridLocation(8,19),
          new GridLocation(9,19),
          new GridLocation(10,19),
          new GridLocation(11,19),

          new GridLocation(12,19),

          new GridLocation(13,19),

          new GridLocation(14,19),

          new GridLocation(15,19),
          new GridLocation(16,19),
          new GridLocation(17,19),
          new GridLocation(18,19),
          new GridLocation(19,19),

          new GridLocation(20,19),

          new GridLocation(21,19),

          new GridLocation(23,19),

          new GridLocation(0,20),

          new GridLocation(1,20),
          new GridLocation(2,20),

          new GridLocation(3,20),
          new GridLocation(23,20),

          new GridLocation(1,21),
          new GridLocation(3,21),
          new GridLocation(4,21),

          new GridLocation(5,21),

          new GridLocation(6,21),

          new GridLocation(7,21),

          new GridLocation(8,21),
          new GridLocation(10,21),
          new GridLocation(11,21),
          new GridLocation(12,21),
          new GridLocation(13,21),

          new GridLocation(14,21),

          new GridLocation(15,21),
          new GridLocation(16,21),
          new GridLocation(17,21),
          new GridLocation(18,21),
          new GridLocation(19,21),
          new GridLocation(20,21),
          new GridLocation(21,21),
          new GridLocation(22,21),
          new GridLocation(23,21),


          new GridLocation(1,22),

          new GridLocation(1,23),
          new GridLocation(2,23),
          new GridLocation(3,23),
          new GridLocation(4,23),
          new GridLocation(5,23),
          new GridLocation(6,23),
          new GridLocation(7,23),
          new GridLocation(8,23),
          new GridLocation(9,23),
          new GridLocation(10,23),
          new GridLocation(11,23),
          new GridLocation(12,23),
          new GridLocation(13,23),

          new GridLocation(14,23),

          new GridLocation(15,23),
          new GridLocation(16,23),
          new GridLocation(17,23),

          new GridLocation(19,23),
          new GridLocation(20,23),
          new GridLocation(21,23),
          new GridLocation(22,23),
          new GridLocation(23,23),
          new GridLocation(24,23)
        )

        startingLocation = new GridLocation(0, 4)

      }
  }

}

class Maze {
  var wallLocations:List[GridLocation] = List()
  var gridWidth: Int = 25
  var gridHeight: Int = 25
  var startingLocation = new GridLocation(0, 3)
  var home = new GridLocation(12, 12)


}
