import scala.collection.immutable._

object BuiltList {
  def main(args: Array[String]): Unit = {
    val names = List("Jack","Hina","Lovely","Riya")
    // Reversing the List
    
    println("The reversed List is :" + names.reverse)
    
    //Using uniform list 
    
    val stringrep = List.fill(10)("Yummy")  
    println( "Uniform List : " + stringrep) 
    
  }
}