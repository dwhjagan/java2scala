package edu.edu7.Scala.Function

object Fun_Variable_Arguments {

//------------------------------------------------
   def main(args: Array[String]) {
      printStrings("Hello", "src/main/scala/Scala", "Python");
   }
//------------------------------------------------   
   def printStrings( args:String* ) = {
      var i : Int = 0;
      
      for( arg <- args ){
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
      }
   }
//------------------------------------------------

}