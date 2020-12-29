

object FirstO {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4,5)
    val list2 = List(6,7,8,9,10)
    
    val xs = List(1,2,3,4,5,6,7,8,9,10)
    
    val result = list2.:::(list1)
    println("The Concatinated List is : " +result)
    println("Last element in list2 is : "+ list2.last)
    println("list1 except the last element : "+list1.init)
    println("The length of list1 is : "+ list1.length)
    
    if(xs.reverse.reverse == xs) println("Reverse.Reverse True")
    if(xs.reverse.init == xs.tail) println("init == tail True")
    if(xs.reverse.tail == xs.init) println("reverse.tail == init True")
    if(xs.reverse.head == xs.last) println("reverse.haed == last True")
    if(xs.reverse.last == xs.head) println("reverse.last == head True")
    
    
  }
}