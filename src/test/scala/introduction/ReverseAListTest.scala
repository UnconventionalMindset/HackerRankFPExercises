package introduction

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ReverseAListTest
  extends AnyFunSuite
    with Matchers {
  test("Testcase 0") {
    val input = List(19, 22, 3, 28, 26, 17, 18, 4, 28, 0)
    val expectedOutput = List(0, 28, 4, 18, 17, 26, 28, 3, 22, 19)

    ReverseAList.f(input) should contain theSameElementsAs expectedOutput
  }
  test("Testcase 1") {
    val input = List(29, 21, 11, 2, 25, 11, 9, 28, 29, 19, 0, 29, 25, 24)
    val expectedOutput = List(24, 25, 29, 0, 19, 29, 28, 9, 11, 25, 2, 11, 21, 29)

    ReverseAList.f(input) should contain theSameElementsAs expectedOutput
  }
  test("Testcase 2") {
    val input = List(3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99, 1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34, 37, 40, 43, 46, 49, 52, 55, 58, 61, 64, 67, 70, 73, 76, 79, 82, 85, 88, 91, 94, 97, 100, 2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 89, 92, 95, 98)
    val expectedOutput = List(98, 95, 92, 89, 86, 83, 80, 77, 74, 71, 68, 65, 62, 59, 56, 53, 50, 47, 44, 41, 38, 35, 32, 29, 26, 23, 20, 17, 14, 11, 8, 5, 2, 100, 97, 94, 91, 88, 85, 82, 79, 76, 73, 70, 67, 64, 61, 58, 55, 52, 49, 46, 43, 40, 37, 34, 31, 28, 25, 22, 19, 16, 13, 10, 7, 4, 1, 99, 96, 93, 90, 87, 84, 81, 78, 75, 72, 69, 66, 63, 60, 57, 54, 51, 48, 45, 42, 39, 36, 33, 30, 27, 24, 21, 18, 15, 12, 9, 6, 3)

    val a = ReverseAList.f(input)

    ReverseAList.f(input) should contain theSameElementsAs expectedOutput
  }
}
