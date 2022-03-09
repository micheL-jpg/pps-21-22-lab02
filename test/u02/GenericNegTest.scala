package u02

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class GenericNegTest {

  def neg[X](f: X => Boolean): X => Boolean = i => !f(i)

  @Test def testString(): Unit = {
    val empty: String => Boolean = _ == ""
    val notEmpty = neg(empty)
    assertEquals(true, notEmpty("notEmpty"))
    assertEquals(false, notEmpty(""))
  }

  @Test def testInt(): Unit = {
    val positive: Int => Boolean = _ >= 0
    val notPositive = neg(positive)
    assertEquals(true, notPositive(-1))
    assertEquals(false, notPositive(0))
  }
}
