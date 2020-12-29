
//Demonstration of this

class Addi(i:Int) {
  def this(i:Int, j:Int){
    
    this(i)
    println(i + " + " + j + " = " + { i + j} )
  }
}