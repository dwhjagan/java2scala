package edu.edu7.Scala.Error_Handling

object Exception_Handling_s2 {
   def main(args: Array[String]) {
       
      try {
         val f = new FileReader("input.txt")
      } catch {
         case ex: FileNotFoundException => {
            println("Missing file exception")
         }
         
         case ex: IOException => {
            println("IO Exception")
         }
      } finally {
         println("Exiting finally...")
      }
   }
}