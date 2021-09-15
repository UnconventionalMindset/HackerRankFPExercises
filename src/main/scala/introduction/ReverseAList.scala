package introduction

object ReverseAList {
  def f(arr:List[Int]):List[Int] =
    (arr.length-1 to 0 by -1).map(arr(_)).toList
}
