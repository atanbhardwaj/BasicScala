

object Main {
  def main(args: Array[String]): Unit = {
    var rec = new Rectangle()
    var cir = new Circle()
    var squ = new Square()
    var para = new Parallelogram()
    println("Area of Rectangle is : "+rec.area(10, 20))
    println("Area of Circle is : "+cir.area(7,0))
    println("Area of Sqaure is : "+squ.area(3,0))
    println("Area of Parallelogram is : "+para.area(60, 40))
  }
}