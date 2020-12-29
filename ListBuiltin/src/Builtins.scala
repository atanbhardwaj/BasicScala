
import scala.collection.JavaConversions._

object Builtins {
  def main(args: Array[String]): Unit = {
        
       /* // New List from existing without duplicates 
    val furniture = List("bed","chair","chair", "bed", "table", "table", "couch")
    val result = furniture.distinct
    println(result)*/
    
    // Displays index of first occurrence after some start index   
    /*val result = "NidhiSingh".indexOf('h', 4)  
    println(result)*/
    
    
    // Displays the length of the List
    
     /*val m1 = List(3, 4, 5, 7, 8) 
     val result = m1.length 
     println("Length of the list is : "+result) */
    
    // Sorting List according to an ordering 
    
    /*val mylist  =  List(10, 5, 8, 1, 7)
    println("Sorted List is : " + mylist.sortWith(_ < _))
    */
    
    //Summing Up the elements of the list 
    /*
    val mylist = List(1,2,3,4,5,6,7,8,9,10)
    println("The sum of elements of the List is : " + mylist.sum)
    */
    
    //Finding smallest and largest in a List
    
    /*
    val mylist = List(1,2,3,4,-1,-5,5,7,9)
    println("Smallest is : "+ mylist.min)
    println("Largest is : "+ mylist.max)
    */
    
    
    
    //Converting List to String 
    //using import scala.collection.JavaConversions._
    
    /*
    val list = new java.util.ArrayList[Int]() 
    
    list.add(5) 
    list.add(4) 
    list.add(6) 
    
    println("List to String : " + list.toString())*/
    
    
    // Displaying index of last occurrence of value after given index
    
    /* val result = "HandSanitizer".lastIndexOf('a',8 ) 
    println("The Index from given index is : "+result) 
    
    */
    
    
    // Converting List to Map
 
    val m1 = List(2, 3, 5,2,2,2, 7, 8) 
    print(m1.indexOf(2, 3))
    //val result = m1.map(x => x*3) 
          
    //println(result) 
    
  }
}



















































