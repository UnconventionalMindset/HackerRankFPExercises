package introduction

object FilterArray {
  def f(delim: Int, arr: List[Int]): List[Int] =
    arr.flatMap(element => if (element < delim) Some(element) else None)
}