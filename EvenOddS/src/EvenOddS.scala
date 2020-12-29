

object EvenOddS {
  def main(args: Array[String]): Unit = {
    
    evenandodd(7)
    evenandodd(8)
    
  }
  
  def evenandodd(i:Int)={
    
    def find()={
      
      if(i%2==0)
          println(i+" is Even")
      else 
        println(i + " is Odd")
    }
    
    find()
  }
}