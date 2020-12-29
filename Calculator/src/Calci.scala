

object Calci {
  def main(args: Array[String]): Unit = {
    
    println("1.DIVIDE \n2.MULTIPLICATION \n3.SUBTRACTION \n4.ADDITION\n")
    var choice = scala.io.StdIn.readInt()
    
    if(choice==1){
      var divide = (x:Int , y:Int)=> x/y
      var x = scala.io.StdIn.readInt()
      var y = scala.io.StdIn.readInt()
      if(y!=0)
      println("Division : = "+divide(x,y))
      else 
        println("Undefined")
    }
    
    else if(choice==2){
      
       var multi = (p:Int, q:Int) => p*q
       var p = scala.io.StdIn.readInt()
       var q = scala.io.StdIn.readInt()
       println("Multiplication : = "+multi(p,q))
    }
    
    else if(choice==3){
      
      var subtract = (x:Int , y:Int)=> x-y
      var x = scala.io.StdIn.readInt()
      var y = scala.io.StdIn.readInt()
      println("Subtraction : = "+subtract(x,y))
      
    }
    else if(choice==4){
      var add = (x:Int , y:Int)=> x+y
      var x = scala.io.StdIn.readInt()
      var y = scala.io.StdIn.readInt()
      println("Addition : = "+add(x,y))
    }
    else 
      println("Wrong Input")
}
}