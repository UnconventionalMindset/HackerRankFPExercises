package introduction

import org.scalatest.{FunSuite, Matchers}

class ArrayOfNElementsTest extends FunSuite with Matchers {
  test("Testcase 0") {
    val size = 10
    ArrayOfNElements.f(size).size shouldBe size
    ArrayOfNElements.g(size).size shouldBe size
  }
  test("Testcase 1") {
    val size = 90
    ArrayOfNElements.f(size).size shouldBe size
    ArrayOfNElements.g(size).size shouldBe size
  }
  test("Testcase 2") {
    val size = 100
    ArrayOfNElements.f(size).size shouldBe size
    ArrayOfNElements.g(size).size shouldBe size
  }
  test("Testcase 3") {
    val size = 15
    ArrayOfNElements.f(size).size shouldBe size
    ArrayOfNElements.g(size).size shouldBe size
  }
  test("Testcase 4") {
    val size = 3
    ArrayOfNElements.f(size).size shouldBe size
    ArrayOfNElements.g(size).size shouldBe size
  }
}
