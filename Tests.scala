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

object Tests {

    def main(args: Array[String]) {
        //val stdin = scala.io.StdIn

        //val n = stdin.readLine.trim.toInt

        //val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        val m = Map("one"->4,"two"->2,"three"->3)
        val result = m.foldLeft(0)(_+_._2/2)


        println(result)

    }
}
