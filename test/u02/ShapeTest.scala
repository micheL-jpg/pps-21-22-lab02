package u02

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import exercises.Es7.Shape.*

import scala.math.{Pi, pow}

class ShapeTest {

  @Test def testPerimeterRectangle(): Unit =
    val rect = Rectangle(5,3)
    assertEquals(16, perimeter(rect))

  @Test def testPerimeterCircle(): Unit =
    val circle = Circle(5)
    assertEquals(2 * Pi * 5, perimeter(circle))

  @Test def testPerimeterSquare(): Unit =
    val square = Square(5)
    assertEquals(20, perimeter(square))

  @Test def testAreaRectangle(): Unit =
    val rect = Rectangle(5,3)
    assertEquals(15, area(rect))

  @Test def testAreaCircle(): Unit =
    val circle = Circle(5)
    assertEquals(Pi * pow(5, 2), area(circle))

  @Test def testAreaSquare(): Unit =
    val square = Square(5)
    assertEquals(25, area(square))
}
