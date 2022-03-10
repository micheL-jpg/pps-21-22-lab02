package u02

import org.junit.jupiter.api.{BeforeEach, Test}
import org.junit.jupiter.api.Assertions.*
import Optionals.Option.*

class OptionalsTest {

  @BeforeEach def setUp(): Unit =
    val optInt = Some(5)
    val optNone = None()

  @Test def testFilter(): Unit =
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
    filter(None[Int]())(_ > 2)
}
