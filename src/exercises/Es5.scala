package exercises

class Es5 {
  def compose(f: Int => Int, g: Int => Int): Int => Int = i => f(g(i))

  def genericCompose[X](f: X => X, g: X => X): X => X = i => f(g(i))
}
