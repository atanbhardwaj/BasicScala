
object CheckAge {
  def main(args: Array[String]): Unit = {
    
    println("Enter your name : ")
    var name = scala.io.StdIn.readLine()
    println("Enter your Age : ")
    var age = scala.io.StdIn.readInt()
    if(age>=18){
      val print_output = (name: String) => println(s"The person $name is eligible to vote." + s"The Age is: $age")
      print_output(name)
    }
    else
      println("The Person is not above 18yrs of Age. So, is not eligible to vote")      
    
  }
}