package lectures.part1

object LearnDS extends App {

  val players = ("sachin", "ricky", "kapil", "jonty") // tuple
  println(players._1) // sachin
  println(players._2) //ricky

  val aBunchOfStuff = ("sachin", 1, true, null ) // Mix of data types in a tuple
  println(aBunchOfStuff._1)
  println(aBunchOfStuff._4)

  val myKeyValue = "animal"->"dog" // Key Value Pair
  println(myKeyValue._1)
  println(myKeyValue._2)

  val numberList = List(1,2,3,4)
  val sum = numberList.reduce((x: Int, y: Int) => x+y)
  println(sum)

  val shipList = List("voyage", "enterprise", "defiant")
  val backwardShips = shipList.map((ship: String) => {ship.reverse})
  for(ship <- backwardShips) {
    println(ship)
  }


}
