package main.scala.part1

object LearnDS extends App {

  val players = ("sachin", "ricky", "kapil", "jonty") // tuple
  println(players._1) // sachin
  println(players._2) //ricky

  // Mix of data types in a tuple
  val aBunchOfStuff = ("sachin", 1, true, null )
  println(aBunchOfStuff._1)
  println(aBunchOfStuff._4)

  // Sample usage of Key Value Pair
  val myKeyValue = "animal"->"dog"
  println(myKeyValue._1)
  println(myKeyValue._2)

  // Sample usage of map.
  // It applies an operation to each element in the collection and return the final collection
  val shipList = List("voyage", "enterprise", "defiant")
  val backwardShips = shipList.map((ship: String) => {ship.reverse})
  for(ship <- backwardShips) {
    println(ship)
  }

  // Sample usage of reduce
  val numberList = List(1,2,3,4)
  val sum = numberList.reduce((x: Int, y: Int) => x+y)
  println(sum)

}
