

object Average_Functional_Programming {

  def main(args: Array[String]) {
    def average(list: List[Double]): Double = list match {
      case head :: tail => tail.foldLeft((head, 1.0)) { (avg, cur) =>
        ((avg._1 * avg._2 + cur) / (avg._2 + 1.0), avg._2 + 1.0)
      }._1
      case Nil => Double.NaN
    }
    val inputList: List[Double] = List(1, 3, 5)
    val result: Double = average(inputList)
    println(result)
  }

}