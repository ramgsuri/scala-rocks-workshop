package lectures.part1

object LearnExpressions extends App{

  // Instructions  Vs Expressions
  // In Imperative Languages like Java you tell the Computer to do something via Instructions
  // Whereas in Declarative Language you pass the expression / Value
  val condition: Boolean = true
  val answer = if(condition) 5 else 0
  print(answer)  // 5
}
