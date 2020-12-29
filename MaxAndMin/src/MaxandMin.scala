

object MaxandMin {
  def main(args: Array[String]): Unit = {
    maxandmin(10,20)
  }
  def maxandmin(a:Int, b:Int)={
    
    def max()={
      
      if(a>b)
          println("Max is "+a)
      else 
        println("Max is "+b)
    }
    
    def min()={
      
      if(a<b)
         println("Min is "+a)
      else 
        println("Min is "+b)
      
    }
    
    max()
    min()
  }
}