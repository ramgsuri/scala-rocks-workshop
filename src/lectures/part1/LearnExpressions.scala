package lectures.part1

object LearnExpressions extends App{

  // Instructions  Vs Expressions
  // In Imperative Languages like Java you tell the Computer to do something via Instructions
  // Whereas in Scala you pass expressions & expressions are evaluated
  val condition: Boolean = true
  val answer = if(condition) 5 else 0
  print(answer)  // 5

  // Example of Code Block
  val aCodeBlock = {
    val firstVariable: Int = 10
    val condition: Boolean = true
    val result = if(condition) "hello" else "bye"
  }

  // Difference between "hello world" and print("hello world")
  //Data Type of First one is String and second one is Unit and it has side effects

}
