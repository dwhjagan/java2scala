package edu.edu7.Scala.Error_Handling

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

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