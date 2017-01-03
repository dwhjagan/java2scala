package valtech

object Concatenate_Array {
   def main(args: Array[String]) {
      val numbers = Array(1, 2, 3, 4, 5)
    //  var sum = numbers.reduceLeft((a: Int, b: Int) => a + b)
      val prod = numbers.reduceLeft(_+_)
      println("The sum of the numbers one through five is " +   " " + prod)

   }
}

/*

  def main(args: Array[String]) {
        val fw = new PrintWriter(sys.env("OUTPUT_PATH"));

        val _numbers_size = scala.io.StdIn.readInt
        val _numbers = Array.ofDim[Int](_numbers_size)

        for (_numbers_i <- 0 until _numbers_size)
        	_numbers(_numbers_i) = scala.io.StdIn.readInt


        val res = summation(_numbers)
        fw.println(res)

        fw.close();
    }
}



numbers.reduceLeft(_+_)


 */


