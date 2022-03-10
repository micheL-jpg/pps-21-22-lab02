package exercises

import scala.math.{Pi, pow}

object Es7 {

  enum Shape:
    case Rectangle(base: Double, height: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  object Shape:
    def perimeter(shape: Shape): Double = shape match
      case Rectangle(base, height) => (base + height) * 2
      case Circle(radius) => 2 * radius * Pi
      case Square(side) => side * 4

    def area(shape: Shape): Double = shape match
      case Rectangle(base, height) => base * height
      case Circle(radius) => Pi * pow(radius, 2)
      case Square(side) => pow(side, 2)
}
