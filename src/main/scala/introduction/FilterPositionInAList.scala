package introduction

// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem

object FilterPositionInAList {
  def f(arr: List[Int]): List[Int] =
    arr.zipWithIndex.collect {
      case (el, idx) if idx % 2 != 0 => el
    }
}