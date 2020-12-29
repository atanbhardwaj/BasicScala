

object InlineFunc {
  
  def main(args: Array[String]): Unit = {
   
    var increase = (k:Int) => k+1
    println("The value 9 is increased by one : 9 + 1 = "+increase(9))
    
    var add = (x:Int , y:Int)=> x+y
    println("Addition : 100 + 500 = "+add(100,500))
    
    var multi = (p:Int, q:Int) => p*q
    
    println("The multiplication : 50 * 90 = "+multi(50,90))  
    
    var check = (i:Int) =>{
      if(i==0) println("zero")
      else
        println("not zero")
    }
    check(1) 
    check(0)
  }
}