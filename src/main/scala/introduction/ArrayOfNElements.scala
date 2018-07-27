package introduction

// https://www.hackerrank.com/challenges/fp-array-of-n-elements/problem

object ArrayOfNElements {
  def f(num: Int): List[Int] =
    1.to(num).toList

  def g(num: Int): List[Int] =
    List.tabulate(num)(_ + 1)
}
