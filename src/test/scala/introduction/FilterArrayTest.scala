package introduction

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FilterArrayTest
  extends AnyFunSuite
    with Matchers {
  test("Testcase 0") {
    val input = List(-41, 46, -28, 21, 52, 83, -29, 84, 27, 40)
    val delimiter = 25
    val expectedOutput = List(-41, -28, 21, -29)
    FilterArray.f(delimiter, input) should contain theSameElementsAs expectedOutput
  }
  test("Testcase 1") {
    val input = List(-6, -52, -92, 45, -15, -38, 75, -53, -41, 52, -78, -56, 54, 53, -78, 63, 69, -64, -72, 65, -12, 56, -45, -18, -67, 89, -75, 30, 39, -48)
    val delimiter = -14
    val expectedOutput = List(-52, -92, -15, -38, -53, -41, -78, -56, -78, -64, -72, -45, -18, -67, -75, -48)

    FilterArray.f(delimiter, input) should contain theSameElementsAs expectedOutput
  }
  test("Testcase 2") {
    val input = List(10, 9, 8, 2, 7, 5, 1, 3, 0)
    val delimiter = 3
    val expectedOutput = List(2, 1, 0)

    FilterArray.f(delimiter, input) should contain theSameElementsAs expectedOutput
  }
}

