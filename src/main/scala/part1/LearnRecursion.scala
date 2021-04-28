package main.scala.part1

object LearnRecursion extends App{

  def factorial(n: Int): Int = {
    if ( n <=1) 1
    else {
      println("Computing factorial of " + n + "I first need factorial of "  +  (n-1)  )
      val result =  n*factorial(n-1)
      println("Computed factorial of "+ n)
      result
    }
  }

 // print(" Factorial is " + factorial(6))
  /** Output is  */
  // Computing factorial of 5I first need factorial of 4
  // Computing factorial of 4I first need factorial of 3
  // Computing factorial of 3I first need factorial of 2
  // Computing factorial of 2I first need factorial of 1
  // Computed factorial of 2
  // Computed factorial of 3
  // Computed factorial of 4
  // Computed factorial of 5

  // Solve using accumulator

  def anotherFacrtorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if(x <=1) accumulator
      else factHelper(x-1, x*accumulator)
    }
    factHelper(n,1)
  }

  print(anotherFacrtorial(5))



}
