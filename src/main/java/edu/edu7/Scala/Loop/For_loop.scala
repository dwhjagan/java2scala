package edu.edu7.Scala.Loop

object For_loop {
   def main(args: Array[String]) {
      var a = 0;
      
      // for loop execution with a range
      for( a <- 1 to 10){
         println( "Value of a: " + a );
      }
   }
}