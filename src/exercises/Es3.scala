package exercises

class Es3 {

  // punto A

  val parity: Int => String = _ % 2 match
    case 0 => "even"
    case _ => "odd"

  def par(x: Int): String = x % 2 match
    case 0 => "even"
    case _ => "odd"

  // punto B
  val neg: (String => Boolean) => (String => Boolean) = f => (i => !f(i))

  def neg(f: String => Boolean): String => Boolean = i => !f(i)

  // punto C 
  def genericNeg[X](f: X => Boolean): X => Boolean = i => !f(i)

}
