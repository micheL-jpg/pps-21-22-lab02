package exercises

import scala.annotation.tailrec

object Es6:

  def fib(n: Int): Int = n match
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1) + fib(n-2)


  def fib2(num:Int): Int =
    @tailrec
    def _fib(n: Int, acc1: Int, acc2: Int): Int = n match
      case 0 => acc1
      case 1 => acc2
      case _ => _fib(n-1,acc2,acc1 + acc2)

    _fib(num, 0, 1)