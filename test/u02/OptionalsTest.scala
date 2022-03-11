package u02

import org.junit.jupiter.api.{BeforeEach, Test}
import org.junit.jupiter.api.Assertions.*
import Optionals.Option.*

class OptionalsTest {

//  @BeforeEach def setUp(): Unit =
//    val optInt = Some(5)
//    val optNone = None()

  @Test def testFilter(): Unit =
    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))
    filter(None[Int]())(_ > 2)

  @Test def testMap(): Unit =
    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(Some(false), map(Some(5))(_ > 8))
    assertEquals(None(), map(None[Int]())(_ > 2))

  @Test def testMap2(): Unit =
    assertEquals(Some(Tuple2(5, true)), map2(Some(5))(Some(true)))
    assertEquals(None(), map2(Some(5))(None()))
    assertEquals(None(), map2(None[Int]())(Some(5)))
    assertEquals(None(), map2(None())(None()))

}
