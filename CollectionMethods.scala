//https://alvinalexander.com/scala/how-to-choose-scala-collection-method-solve-problem-cookbook/
//import scala.collection.Map
object CollectionMethods {

  def diff(ite1: Seq[Int], ite2: Seq[Int]) = {
    print(ite1.diff(ite2))
 }
  
//METHODS FOR SEQ:        http://alvinalexander.com/scala/seq-class-methods-examples-syntax/
//METHODS FOR INDEXEDSEQ: https://alvinalexander.com/scala/indexedseq-class-methods-examples-syntax/
//METHODS FOR VECTOR:     https://alvinalexander.com/scala/vector-class-methods-syntax-examples/
//METHODS FOR LIST:       https://alvinalexander.com/scala/list-class-methods-examples-syntax/
//METHODS FOR MAPS:       https://alvinalexander.com/scala/scala-immutable-map-class-methods-examples-syntax/
 
  def main(args: Array[String]) {
    //diff(mySeq, smallSeq)
    val myIter: Iterable[Int] = Iterable(1, 2, 3, 4, 5, 6, 6, 2)
    
    val mySet: Set[Int] = Set(1, 2, 3, 4, 5, 6, 6, 2)
    val smallSet: Set[Int] = Set(1, 2, 7)
    println("------Set------")
    println(mySet)
    println(smallSet)
    
    val mySeq: Seq[Int] = Seq(1, 2, 3, 4, 5, 6, 6, 2)
    val smallSeq: Seq[Int] = Seq(1, 2, 7)
    println("------Seq------")
    println(mySeq)
    println(smallSeq)

    val myMap: Map[Int, Int] = Map((1, 2),(3, 4), (5, 6))
    val smallMap: Map[Int, Int] = Map((1, 2), (7, 8))
    println("------Map------")
    println(myMap)
    println(smallMap)
    
    //diff
    //It deletes the elements of the right from the elements of that. In the case of Seq it deletes for value and repetitions.
    //That is why only one of the "2" are deleted
    println("------diff method------")
    println("diff in Seq")
    println(mySeq.diff(smallSeq))
    
    println("diff in Set")
    println(mySet.diff(smallSet))
    
    println("diff is not in Map")

    //distinct
    println("------distinct method------")
    println("diff in Seq")
    println(mySeq.distinct)
    
    println("diff is not in Set")

    println("diff is not in Map")

    //drop
    //Selects all elements except first n ones. This is exactly the contrary of "take" (Selects first n elements.)
    //dropRight also exists
    println("------drop method------")
    println("drop in Seq")
    println(mySeq.drop(2))
    
    println("drop in Set")
    println(mySet.drop(2))
    
    println("drop in Map")
    println(myMap.drop(2))

    //dropWhile
    //It drops from the beggining until the last element that fulfills the predicate.
    println("------dropWhile method------")
    println("dropWhile in Seq")
    println(mySeq.dropWhile(x => x - 1 < 3))
    
    println("dropWhile in Set")
    println(mySet.dropWhile(x => x - 1 < 3))
    
    println("dropWhile in Map")
    println(myMap.dropWhile(x => x._1 - 1 < 3))


    //filter
    //This is exactly the contrary of filterNot
    println("------filter method------")
    println("filter in Seq")
    println(mySeq.filter(x => x - 1 < 3))
    
    println("filter in Set")
    println(mySet.filter(x => x - 1 < 3))
    
    println("filter in Map")
    println(myMap.filter(x => x._1 - 1 < 3))

    //filterNot
    println("------filterNot method------")
    println("filterNot in Seq")
    println(mySeq.filterNot(x => x - 1 < 3))
    
    println("filterNot in Set")
    println(mySet.filterNot(x => x - 1 < 3))
    
    println("filterNot in Map")
    println(myMap.filterNot(x => x._1 - 1 < 3))

    //find
    println("------find method------")
    println("find in Seq")
    println(mySeq.find(x => x - 1 < 3))
    
    println("find in Set")
    println(mySet.find(x => x - 1 < 3))
    
    println("find in Map")
    println(myMap.find(x => x._1 - 1 < 3))

    //foldLeft
    //((100 - 1) - 3) - 8 == 88
    //This is the same as /:
    println("------foldLeft method------")
    println("foldLeft in Seq")
    println(Seq(1, 3, 8).foldLeft(100)(_ - _))
    
    println("foldLeft in Set")
    println(Set(1, 3, 8).foldLeft(100)(_ - _))
    
    println("foldLeft in Map")
    println(Map((1,1), (3,3), (8,8)).foldLeft(100)((a, t) => a - t._1))
    println(Map((1,1), (3,3), (8,8)).foldLeft(100){case (a, t) => a - t._1})
    println(Map((1,1), (3,3), (8,8)).foldLeft(100){case (a:Int, t:(Int, Int)) => a - t._1})
    println(Map((1,1), (3,3), (8,8)).foldLeft(100){case (a, (k, v)) => a - k})

    //foldRight
    //1 - (3 - (8 - 100)) == -94
    println("------foldRight method------")
    println("foldRight in Seq")
    println(Seq(1, 3, 8).foldRight(100)(_ - _))
    
    println("foldRight in Set")
    println(Set(1, 3, 8).foldRight(100)(_ - _))
    
    println("foldLeft in Map")
    println(Map((1,1), (3,3), (8,8)).foldRight(100)((t, a) => t._1 - a))
    println(Map((1,1), (3,3), (8,8)).foldRight(100){case (t, a) => t._1 - a})
    println(Map((1,1), (3,3), (8,8)).foldRight(100){case ((k, v), a) => k - a})

    //head
    //This and tail form the entire structure
    println("------head method------")
    println("head in Seq")
    println(mySeq.head)
    //println(Map().head)  //Exception for being an empty data structure
    
    println("head in Set")
    println(mySet.head)
    
    println("head in Map")
    println(myMap.head)

    //headOption
    println("------headOption method------")
    println("headOption in Seq")
    println(Seq().headOption)
    
    println("headOption in Set")
    println(Set().headOption)
    
    println("headOption in Map")
    println(Map().headOption)

    //init
    //Selects all elements except the last. This is exactly the contrary to tail
    //This and last form the complete structure
    println("------init method------")
    println("init in Seq")
    println(mySeq.init)
    
    println("init in Set")
    println(mySet.init)
    
    println("init in Map")
    println(myMap.init)

    //intersect
    //The elements in common.
    println("------intersect method------")
    println("intersect in Seq")
    println(mySeq.intersect(smallSeq))
    
    println("intersect in Set")
    println(mySet.intersect(smallSet))
    
    println("intersect is not in Map")

    //last/lastOption
    //Selects the last element. This and init form the whole structure
    println("------last method------")
    println("last in Seq")
    println(mySeq.last)
    println(Seq().lastOption)
    
    println("last in Set")
    println(mySet.last)
    
    println("last in Map")
    println(myMap.last)

    //reduceLeft
    //((1 - 2) - 3) == -4
    println("------reduceLeft method------")
    println("reduceLeft in Seq")
    println(Seq(1,2,3).reduceLeft(_ - _))
    //reduceLeft is tail recursive, while reduceRight is not
    //println("------reduceLeft method for a big Int------")
    //println((0 to 1000000000).reduceLeft(_ - _))
    
    println("reduceLeft in Set")
    println(Set(1, 3, 8).reduceLeft(_ - _))
    
    println("reduceLeft in Map")
    println(Map((1,1), (3,3), (8,8)).reduceLeft((a, t) => (t._1 - a._1, t._1 - a._1)))
    //You have to return a supertype of the type of elements of the data structure. The next expression return a Int, so it is not valid because it is not true that Int >: (Int, Int)
    //println(Map((1,1), (3,3), (8,8)).reduceLeft((a, t) => t._1 - a._1))
    //In foldLeft you do not have this restriction

    //reduceRight
    //(1 - (2 - 3)) == 2
    println("------reduceRight method------")
    println("reduceRight in Seq")
    println(Seq(1,2,3).reduceRight(_ - _))
    //reduceRight no es tail recursive as reduceLeft, so given a collection of large enough size, it will produce a stack overflow
    //(0 to 1000000000).reduceRight(_ - _)
    
    println("reduceRight in Set")
    println(Set(1, 3, 8).reduceRight(_ - _))
    
    println("reduceRight in Map")
    println(Map((1,1), (3,3), (8,8)).reduceRight((a, t) => (t._1 - a._1, t._1 - a._1)))

    //remove
    println("------remove method does not apply for immutables------")
    println("remove not in Seq")
    
    println("remove not in Set")
    
    println("remove not in Map")
    
    //slice
    println("------slice method------")
    println("slice in Seq")
    println(mySeq.slice(2, 5))
    
    println("slice in Set")
    println(mySet.slice(2, 5))
    
    println("slice in Map")
    println(myMap.slice(2, 5))

    //tail.
    //there is not tailOption, but it can be handle with other options
    //https://alvinalexander.com/scala/how-to-choose-scala-collection-method-solve-problem-cookbook/
    //This and head form the structure
    println("------tail method------")
    println("tail in Seq")
    println(mySeq.tail)
    
    println("tail in Set")
    println(mySet.tail)
    
    println("tail in Map")
    println(myMap.tail)

    //take
    println("------take method------")
    println("take in Seq")
    println(mySeq.take(2))
    
    println("take in Set")
    println(mySet.take(2))
    
    println("take in Map")
    println(myMap.take(2))

    //union
    //This is an union all of SQL, that means it includes all the elements of both structures.
    println("------union method------")
    println("union in Seq")
    println(mySeq.union(smallSeq))
    
    println("union in Set")
    println(mySet.union(smallSet))
    
    println("union is not in Map")

    //+
    //This works with elements
    println("------------------Transformer methods------------------")
    println("------'+' method------")
    println("+ in Seq")
    println(0 +: mySeq)
    println(mySeq :+ 0)
    
    println("+ in Set")
    println(mySet + 0)
    println(mySet + (0, 12))
    println(mySet + 0 + 12)
    println(mySet + 0, 12)
    
    println("+ in Map")
    println(myMap + (10->11))

    //++
    //This works with data structures
    println("------'++' method------")
    println("++ in Seq")
    println(mySeq ++ Seq(0))
    
    println("++ in Set")
    println(mySet ++ Set(0))
    
    println("++ in Map")
    println(myMap ++ Map(10->11))

    //'/:'
    //This is an alternate syntax for foldLeft; z /: xs is the same as xs foldLeft z.
    //((100 - 1) - 3) - 8 == 88
    println("------------------Transformer methods------------------")
    println("------'/:' method------")
    println("/: in Seq")
    println((100 /: Seq(1, 3, 8))(_ - _))
    
    println("/: in Set")
    println((100 /: Set(1, 3, 8))(_ - _))
    
    println("/: in Map")
    println((100 /: Map((1,1), (3,3), (8,8)))((a, t) => a - t._1))
    println((100 /: Map((1,1), (3,3), (8,8))){case (a, t) => a - t._1})
    println((100 /: Map((1,1), (3,3), (8,8))){case (a:Int, t:(Int, Int)) => a - t._1})
    println((100 /: Map((1,1), (3,3), (8,8))){case (a, (k, v)) => a - k})

    //':\'
    //This is an alternate syntax for foldLeft; z /: xs is the same as xs foldLeft z.
    //((100 - 1) - 3) - 8 == 88
    println("------------------Transformer methods------------------")
    println("------'/:' method------")
    println("/: in Seq")
    println((100 /: Seq(1, 3, 8))(_ - _))
    
    println("/: in Set")
    println((100 /: Set(1, 3, 8))(_ - _))
    
    println("/: in Map")
    println((100 /: Map((1,1), (3,3), (8,8)))((a, t) => a - t._1))
    println((100 /: Map((1,1), (3,3), (8,8))){case (a, t) => a - t._1})
    println((100 /: Map((1,1), (3,3), (8,8))){case (a:Int, t:(Int, Int)) => a - t._1})
    println((100 /: Map((1,1), (3,3), (8,8))){case (a, (k, v)) => a - k})

    //-
    //This works with elements
    println("------------------Transformer methods------------------")
    println("------'-' method------")
    println("- is not in Seq")
    
    println("- in Set")
    println(mySet - 0)
    println(mySet - (0, 12))
    println(mySet - 0 - 12)
    println(mySet - 0, 12)
    
    println("- in Map")
    println(myMap - (3, 5))

    //--
    //This works with data structures
    println("------'--' method------")
    println("-- is not in Seq")
    
    println("-- in Set")
    println(mySet -- Set(0))
    
    println("-- in Map")
    println(myMap -- Seq(3, 5))

    //collect
    //https://medium.com/@sergigp/using-scala-collect-3a9880f71e23
    println("------collect method------")
    println("collect in Seq")
    val myList = Seq(1, "a", "b", Some(2)) 
    println(myList collect {
     case a: String    => a
     case i: Int       => i.toString
     case Some(i: Int) => i.toString
    }
    )
    
    println("collect in Set")
    val myList1 = Set(1, "a", "b", Some(2)) 
    println(myList1 collect {
     case a: String    => a
     case i: Int       => i.toString
     case Some(i: Int) => i.toString
    }
    )
    
    //It works as a filter
    println("collect in Map")
    println(Seq(1, 2, 3) collect myMap)
    println(Seq(1, 2, 3).collect(myMap))
    
    case class Person(name: String, age: Int)
    case class UserId(id: Int)
    val friends = Map(
      UserId(1) -> Person("John", 21),
      UserId(2) -> Person("Jack", 23),
      UserId(3) -> Person("Mary", 25)
    )
    
    friends collect { case (id, p) if (p.age > 22) => p}
    // List(Person(Jack,23), Person(Mary,25))
    friends collect { case (id, p) if (p.name.startsWith("J")) => id }
    // List(UserId(1), UserId(2))
    
    //It works also as a filter + map/foreach
    
    def remove(userId: UserId) = {
      println("I do not undestand")
    }
    friends collect { case (id, p) if (p.age < 24) => remove(id) }
    // this applies remove to Jack and John user ids.

    //map
    println("------map method------")
    println("map in Seq")
    println(Seq("Hello", "World").map(x => x.toLowerCase()))
    println(Seq(2, 3, 4).map(x => Seq(x-1, x, x+1)))
    
    println("map in Set")
    println(Set("Hello", "World").map(x => x.toLowerCase()))
    println(Set(2, 3, 4).map(x => Seq(x-1, x, x+1)))
    
    println("map in Map")
    println(Map((1,1), (3,3), (8,8)).map(x => Seq(Map(x._1-1->(x._1+1)))))

    //flatten
    println("------flatten method------")
    println("map in Seq")
    println(Seq("Hello", "World").map(x => x.toLowerCase()).flatten)
    println(Seq(2, 3, 4).map(x => Seq(x-1, x, x+1)).flatten)
    
    println("flatten in Set")
    println(Set("Hello", "World").map(x => x.toLowerCase()).flatten)
    println(Set(2, 3, 4).map(x => Seq(x-1, x, x+1)).flatten)
    
    println("flatten in Map")
    println(Map((1,1), (3,3), (8,8)).map(x => Seq(Map(x._1-1->(x._1+1)))).flatten)

    //flatMap
    println("------flatMap method------")
    println("flatMap in Seq")
    println(Seq("Hello", "World").flatMap(x => x.toLowerCase()))
    println(Seq(2, 3, 4).flatMap(x => Seq(x-1, x, x+1)))
    
    println("flatMap in Set")
    println(Set("Hello", "World").flatMap(x => x.toLowerCase()))
    println(Set(2, 3, 4).flatMap(x => Seq(x-1, x, x+1)))
    
    println("flatMap in Map")
    println(Map((1,1), (3,3), (8,8)).flatMap(x => Seq(Map(x._1-1->(x._1+1)))))
    
    //reverse
    println("------reverse method------")
    println("reverse in Seq")
    println(mySeq.reverse)
    
    println("reverse is not in Set")
    
    println("reverse is not in Map")

    //sortWith
    //https://blog.knoldus.com/sorting-in-scala-using-sortedsortby-and-sortwith-function/
    //https://stackoverflow.com/questions/23588615/scala-collection-sorted-sortwith-and-sortby-performance
    println("------sortWith method------")
    println("sortWith in Seq")
    println(mySeq.sortWith(_<_))
    println(mySeq.sorted)
    println(mySeq.sortBy(x=>x))
    
    println("sortWith is not in Set")
    
    println("sortWith is not in Map")

    //zip
    println("------zip method------")
    println("zip in Seq")
    println(mySeq zip smallSeq)
    println(mySeq.zip(smallSeq).toMap)
    
    println("zip in Set")
    println(mySet zip smallSet)
    
    println("zip in Map")
    println(myMap zip smallMap)

    //zipWithIndex
    println("------zipWithIndex method------")
    println("zipWithIndex in Seq")
    println(mySeq zipWithIndex)
    
    println("zipWithIndex in Set")
    println(mySet zipWithIndex)
    
    println("zipWithIndex in Map")
    println(myMap zipWithIndex)

    println("------------------Grouping methods------------------")
    //https://alvinalexander.com/scala/how-to-split-sequences-subsets-groupby-partition-scala-cookbook/
    //groupBy
    println("------groupBy method------")
    println("groupBy in Seq")
    println(mySeq.groupBy(_ > 3))
    
    println("groupBy in Set")
    println(mySet.groupBy(x => x > 3))
    
    println("groupBy in Map")
    println(myMap groupBy (_._1 > 3))

    //partition
    println("------partition method------")
    println("partition in Seq")
    println(mySeq.partition(_ > 3))
    
    println("partition in Set")
    println(mySet.partition(x => x > 3))
    
    println("partition in Map")
    println(myMap partition (_._1 > 3))

    //span
    //This is equivalent to (but possibly more efficient than) (c takeWhile p, c dropWhile p), 
    println("------span method------")
    println("span in Seq")
    println(mySeq.span(_ < 3))
    
    println("span in Set")
    println(mySet.span(x => x < 3))
    
    println("span in Map")
    println(myMap span (_._1 < 3))

    //splitAt
    //This is equivalent to (but possibly more efficient than) (c take n, c drop n)
    println("------splitAt method------")
    println("splitAt in Seq")
    println(mySeq.splitAt(3))
    
    println("splitAt in Set")
    println(mySet.splitAt(3))
    
    println("splitAt in Map")
    println(myMap splitAt (3))

    //sliding
    println("------sliding method------")
    println("sliding in Seq")
    println(mySeq.sliding(2,3).toList)
    
    println("sliding in Set")
    println(mySet.sliding(2,3).toList)
    
    println("sliding in Map")
    println(myMap.sliding(2,3).toList)

    //unzip
    println("------unzip method------")
    println("unzip in Seq")
    println(Seq(("Kim", "Al"), ("Julia", "Terry")).unzip)
    
    println("unzip in Set")
    println(Set(("Kim", "Al"), ("Julia", "Terry")).unzip)
    
    println("unzip in Map")
    println(myMap.unzip)

    println("------------------Informational and mathematical methods------------------")

    //canEqual
    println("------canEqual method------")
    println("canEqual in Seq")
    println(mySeq.canEqual(smallSeq))
    
    println("canEqual in Set")
    println(mySet.canEqual(smallSet))
    
    println("canEqual in Map")
    println(myMap.canEqual(smallMap))

    //contains
    println("------contains method------")
    println("contains in Seq")
    println(mySeq.contains(smallSeq))
    
    println("contains in Set")
    println(mySet.contains(5))
    
    println("contains in Map")
    println(myMap.contains(1))

    //containsSlice
    println("------containsSlice method------")
    println("containsSlice in Seq")
    println(mySeq.containsSlice(smallSeq))
    
    println("containsSlice is not in Set")
    
    println("containsSlice is not in Map")

    //endsWith
    println("------endsWith method------")
    println("endsWith in Seq")
    println(mySeq.endsWith(smallSeq))
    
    println("endsWith is not in Set")
    
    println("endsWith is not in Map")

    //forall
    println("------forall method------")
    println("forall in Seq")
    println(mySeq.forall(x=> x>0))
    
    println("forall in Set")
    println(mySet.forall(x=> x>0))
    
    println("forall in Map")
    println(myMap.forall(x=> x._1>0))

    //product
    println("------product method------")
    println("product in Seq")
    println(mySeq.product)
    
    println("product in Set")
    println(mySet.product)
    
    println("product in Map?")

    //segmentLength
    println("------segmentLength method------")
    println("segmentLength in Seq")
    println(mySeq.segmentLength(_ < 2, 0))
    
    println("segmentLength is not in Set")
    
    println("segmentLength is not in Map")

    //view
    //The view method creates an iterator where its elements are applied to the subsequent transformations as they are demanded.
    println("------view method------")
    println("view in Seq")
    //Without view it would first construct the list of the 1000000000 elements, and later it would sum the elements. So it needs the intermediate results
    //println((0 to 1000000000).filter(n => n % 3 == 0 || n % 5 == 0).sum)
    //View allows the elements to be transformed without construct the intermediate list of 1000000000 elements. It just evaluate one by one.
    println((0 to 1000000).view.filter(n => n % 3 == 0 || n % 5 == 0).sum)
    println(mySeq.view)
    
    println("view in Set")
    println(mySet.view)
    
    println("view in Map")
    println(myMap.view)

    //foreach
    println("------foreach method------")
    println("foreach in Seq")
    println(mySeq.foreach(print))
    
    println("foreach in Set")
    println(mySet.foreach(print))
    
    println("forall in Map")
    println(myMap.foreach(print))


  }

}
