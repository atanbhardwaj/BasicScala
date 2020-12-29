
// Demonstration of Yield

object DemoYield {
  def main(args: Array[String])  
    {  
        var print = for( i <- 1 to 10) yield i  
        for(j<-print) 
        {  
            println(j)  
        }  
    } 
}