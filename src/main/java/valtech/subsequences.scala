package valtech

/**
  * Created by janaidu on 03/01/2017.
  */
class subsequences {
  def kSub(k: Int, nums: Array[Int]): Long = {
    val count = for {
      i <- 0 to nums.size
      j <- i to nums.size
      slice = nums.slice(i, j)
      sum = slice.sum
    } yield if (sum != 0 && (sum % k) == 0) 1 else 0
    count.sum
  }
}