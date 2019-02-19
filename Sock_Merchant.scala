
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

//Sample input
//9
//10 20 20 10 10 30 50 10 20

object Sock_Merchant {

    // Complete the sockMerchant function below.
    def sockMerchant(n: Int, ar: Array[Int]): Int = {
        var quantity:Map[Int,Int] = Map()
        for(i <- 0 until ar.length){            
            if( quantity.contains(ar(i))) {
            println(ar(i) + " exists with value :"  + quantity(ar(i)))
                quantity(ar(i)) = quantity(ar(i))+1
            } else {
            println(ar(i) + " does not exist")
                quantity += (ar(i) -> 1)
            }
        }
        val result = quantity.foldLeft(0)(_+_._2/2)
        // It not necessary to explicitly define the word return
        result
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn



        val n = stdin.readLine.trim.toInt

        val ar = stdin.readLine.split(" ").map(_.trim.toInt)
        val result = sockMerchant(n, ar)

        println(result)

    }
}
