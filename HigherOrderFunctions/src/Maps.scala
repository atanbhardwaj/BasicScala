object Maps {
   def main(args: Array[String]): Unit = {
    var list1 = List(1,2,3,4,5)
    var words = List("The","Quick","Brown","Fox")
    list1=list1.map(_ + 1)
    println(list1)
    println(words.map(_.length()))    
    println(words.map(_.toList.reverse.mkString(" ")))
    println(words.map(_.toList))
    println(words.flatMap(_.toList))
    var sum = 0 
    list1.foreach(sum+=_)
    println(sum)
    println(list1.filter(_%2==0))
    println(words.filter(_.length==3))
    println(list1.partition(_%2==0))
    println(list1.find(_%2==0))
    println(list1.find(_<=0))
    val list2 = List(1,2,3,-4,5)
    println(list2.takeWhile(_>0))
    println(words.dropWhile(_.startsWith("T")))
    println(list2.span(_>0))
    println(list2.forall(_%2==0)) //returns true if the condition is true for all the elements of the list else returns false.
    println(list2.exists(_%3==0)) //It returns true if the stated predicate holds true for some elements of the list else it returns false.
    println(list2.foldLeft(0)(_+_))
    println(list2.foldRight(1)(_*_))
    println(list2.sorted)
    println(list2.sorted(Ordering.Int.reverse)) 
    }
}