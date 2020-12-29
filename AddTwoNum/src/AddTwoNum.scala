
// Demonstration of return 

object AddTwoNum {
  def main(args: Array[String]) {
    
 println("Sum is: " + functionToAdd(500,600));
 
 }
  
 def functionToAdd(a:Int, b:Int) : Int =
 {

 var sum:Int = 0
 sum = a + b


 return sum

}
}