package x.crazyjvm

import java.io.{File, PrintWriter}

object Demo43 {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test.txt" ))

    writer.write("Hello Scala")
    writer.close()
  }
}