

object Control {
  def main(args: Array[String]): Unit = {
  
    var a = 0
    val numList = List(1,2,3,4,5,6,7,8,9,10)
    
     // For with yield 
    
    var retvar = for { a <- numList if a!=3; if a < 8
    } yield a 
   
       
    for(a <- retvar){
      println("Value of a :" + a)
    }
    
    
    
  }
  
}