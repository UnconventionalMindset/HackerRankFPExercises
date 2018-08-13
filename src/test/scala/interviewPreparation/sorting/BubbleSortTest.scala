package interviewPreparation.sorting

import java.io.{ByteArrayOutputStream, PrintStream}

import org.scalatest.{BeforeAndAfterEach, FunSuite, Matchers}

class BubbleSortTest extends FunSuite with Matchers with BeforeAndAfterEach {

  val outContent = new ByteArrayOutputStream()
  val originalOut: PrintStream = System.out

  override def beforeEach(): Unit = {
    outContent.reset()
    System.setOut(new PrintStream(outContent))
  }

  override def afterEach(): Unit = {
    System.setOut(originalOut)
  }

  def generateOutputString(
    numSwaps: Int,
    firstElement: Int,
    lastElement: Int
  ): String =
    s"""Array is sorted in $numSwaps swaps.
        |First Element: $firstElement
        |Last Element: $lastElement""".stripMargin

  test("Testcase 0") {
    BubbleSort.countSwaps(Array(1, 2, 3))

    outContent.toString.trim shouldBe generateOutputString(0, 1, 3)
  }

  test("Testcase 1") {
    BubbleSort.countSwaps(Array(3, 2, 1))

    outContent.toString.trim shouldBe generateOutputString(3, 1, 3)
  }

  test("Testcase 2") {
    BubbleSort.countSwaps(Array(4, 2, 3, 1))

    outContent.toString.trim shouldBe generateOutputString(5, 1, 4)
  }
}
