

object Power {
  def main(args: Array[String]): Unit = {
    println("Enter the number")
    var num = scala.io.StdIn.readInt()
    
    println("Result Without Using Inbuit Function")
    println("The square of number is : "+(num*num))
    println("The cube of number is : "+(num*num*num))
    println("The fourth power of number is : "+(num*num*num*num))
    
    println("USING INBUILT FUNCTION")
    
    for(i <- 2 to 4){
      println(scala.math.pow(num,i))
    }
  }
}