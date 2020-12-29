

class F2C {
  def convert(){
     println("Enter the value in fahrenheit")
     var far = scala.io.StdIn.readInt()
     println("Equivalent in Degree is : "+(far-32)* 5/9) 
  }
}