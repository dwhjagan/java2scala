package edu.edu7.Scala.PatternMatching

object Pattern_Match_ex1 {
   def main(args: Array[String]) {
       
      println(matchTest("two"))
      println(matchTest("test"))
      println(matchTest(1))
   }
   
   def matchTest(x: Any): Any = x match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case _ => "many"
   }
}