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
//https://examples.javacodegeeks.com/jvm-languages/scala/functional-programming-scala/
object FunctionVsMethod {

  def sayHello_method(name: String) = {
    "Hello " + name
  }

  val sayHello_function = (name: String) => {
    "Hello " + name
  }

  def refTransparencyStrBuffer() = {
    val x = new StringBuffer("Hello")
    val r1 = x.append(", World").toString
    println(s"StrBuffer appended direct value - r1 : $r1")
    val r2 = x.append(", World").toString
    println(s"StrBuffer appended direct value - r2 : $r2")
  }

  def main(args: Array[String]) {
    println(sayHello_method("Hernan"))
    println(sayHello_function("Alonso"))
    //we cannot say that the append method is referentially transparent
    println(refTransparencyStrBuffer)
  }

}
