

object PrimeC {
   def main(args: Array[String]): Unit = {
     var x = scala.io.StdIn.readInt()
     var flag = 0
     for(i <- 2 to x/2){
       if(x%i==0)
         flag = 1
     }
     if(flag==0)
       println("Prime")
     else
       println("Not Prime")
   }
}