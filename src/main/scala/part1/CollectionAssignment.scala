package collections

object CollectionAssignment {
  //  Do not use for/while loops while solving these problem

  def lengthOfNames(names: List[String]): List[Int] = names.map(name => name.size)

  def getOdds(numbers: List[Int]): List[Int] = numbers.filter(number => number % 2 != 0)

  def getEvens(numbers: List[Int]): List[Int] = numbers.filter(number => number %2 ==0)

  def getTotal(numbers: Array[Int]): Int = numbers.reduce((n1, n2 ) => n1+n2)

  def findHighest(numbers: Array[Int]): Int = numbers.reduce((n1,n2) => n1 max n2 )

  def countOdds(numbers: Seq[Int]): Int = numbers.filter(number => number % 2 != 0).size

  def countEvens(numbers: Seq[Int]): Int = numbers.filter(number => number % 2 == 0).size

  def countOfNumbersAbove(numbers: List[Int], threshold: Int): Int = numbers.filter(number => number > threshold ).size

  //  Do not use any formula to calculate
  def sumOfN(n: Int): Int = (1 to n).reduce((n1,n2) => n1+n2)

  //  Try to do it in one line
  def lengthOfSentence(sentence: List[String]): Int = sentence.reduce((s1,s2) => s1+s2).size

  //  Try to do it in one line
  def calculateRunningTotal(numbers: List[Int]): List[Int] = numbers.scan(0)((a,b) => a+b).tail


}
