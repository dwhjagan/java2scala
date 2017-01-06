package edu.edu7.Scala.Error_Handling

import java.io.{FileNotFoundException, FileReader, IOException}

object Exception_Handling_s1 {
   def main(args: Array[String]) {
      try {
         val f = new FileReader("input.txt")
      } catch {
         case ex: FileNotFoundException =>{
            println("Missing file exception")
         }
         
         case ex: IOException => {
            println("IO Exception")
         }
      }
   }
}