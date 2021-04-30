package introduction

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FilterPositionInAListTest
  extends AnyFunSuite
    with Matchers {
  test("Testcase 0") {
    val input = List(8, 15, 22, 1, 10, 6, 2, 18, 18, 1)
    val expectedOutput = List(15, 1, 6, 18, 1)

    FilterPositionInAList.f(input) should contain theSameElementsAs expectedOutput
  }
  test("Testcase 1") {
    val input = List(19, 28, 27, 3, 27, 26, 24, 25, 11, 15, 23, 11, 20, 24, 15)
    val expectedOutput = List(28, 3, 26, 25, 15, 11, 24)

    FilterPositionInAList.f(input) should contain theSameElementsAs expectedOutput
  }
}
