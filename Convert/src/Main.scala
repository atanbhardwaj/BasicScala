

object Main {
  def main(args: Array[String]): Unit = {
    var k = new F2C
    var l = new InchesToMeters
    var m = new YearToNumber
    k.convert()
    l.convertIM()
    m.convertYN()
  }
}