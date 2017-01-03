package valtech

/**
  * Created by janaidu on 03/01/2017.
  */


object Array_Range {                             //Objects
def main(args: Array[String]): Unit = {

}
  def ksubsequences(k: Int, s: Array[Int]) = {
    var p = Array.fill(k)(0)
    p(0) = 1
    var t = 0
    for (n <- s) {
      t += n
      t %= k
      p(t) += 1
    }
    p.map(x => x * (x - 1) / 2).sum
  }
}