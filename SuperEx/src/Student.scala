
// Demonstration of Super

class Student extends Person {
  
  override def message(){
    
    println("This is student class")
  
  }
  
  def display(){
    
    message()
    
    super.message
  }
  
}