

object MaIn  {
  def main(args: Array[String]): Unit = {
    var obj  = new Display()
    
    obj.disp(10)
    obj.disp(52,12.6,"Korea",true)
    obj.disp(200,100.5)
    obj.disp(97, 3.1, "USA")
    
  }
}