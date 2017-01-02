package edu.faq

object Demo {
  def main(args: Array[String]) {
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    for ( x <- myList ) {
      println( x )
    }

    // Summing all elements
    var total = 0.0;

    for ( i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);

    // Finding the largest element
    var min = myList(0);

    for ( i <- 0 to (myList.length - 1) ) {
      if (myList(i) < min) min = myList(i);
    }

    println("Max is " + min);
  }
}