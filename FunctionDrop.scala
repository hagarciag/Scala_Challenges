import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.mutable.Map
//http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/
object FunctionDrop {
  def main(args: Array[String]) {
    println("Step 1: How to initialize a Sequence of donuts")
    val donuts: Seq[String] = Seq("Plain Donut", "Strawberry Donut", "Glazed Donut")
    println(s"Elements of donuts = $donuts")

    println("\nStep 2: How to drop the first element using drop function")
    println(s"Drop the first element in the sequence = ${donuts.drop(1)}")

    println("\nStep 3: How to drop the first two elements using the drop function")
    println(s"Drop the first and second elements in the sequence = ${donuts.drop(2)}")
  }
}
