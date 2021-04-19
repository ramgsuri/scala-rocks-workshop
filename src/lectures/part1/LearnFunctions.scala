package lectures.part1

object LearnFunctions extends App {


  def cube(x: Int): Int = {
    x*x*x
  }

  def transform(x: Int, f: Int => Int) : Int = {
    f(x)
  }

  val result = transform(2, cube) // Pass a function in parameters
  println(result)  // prints 8

  val resultForDivide = transform(10, x => x/2)
  println(resultForDivide)
}
