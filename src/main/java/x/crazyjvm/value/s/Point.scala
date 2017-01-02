package x.crazyjvm.value.s

object Point extends App{

  type Point = (Int, Int) // Tuple2[Int, Int]
  val point: Point = (1, 2)
  println(point)

//  case class Point(x: Int, y: Int)
//  val point = Point(1, 2)

}