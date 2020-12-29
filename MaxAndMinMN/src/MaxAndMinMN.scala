

object MaxAndMinMN {
  
  def main(args: Array[String]): Unit = {
    
    maxandmin(10,20)
    
  }
  
  def maxandmin(i:Int, j:Int)={
    
    def findmax()={
      
      def max()={
        if(i>j)
          println("Max is "+i)
        else
          println("Max is "+j)
      }
      
    }
    
    def findmin()={
      
      def min()={
        
        if(i<j)
          println("Min is "+i)
        else 
          println("Min is "+j)
      }
    }
    findmax()
    findmin()
    }

}