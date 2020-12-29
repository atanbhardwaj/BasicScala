

class YearToNumber {
  def convertYN(){
    println("Enter the number of year")
    var n = scala.io.StdIn.readInt()
    println("The number of days are: "+(n*365))
  }
}