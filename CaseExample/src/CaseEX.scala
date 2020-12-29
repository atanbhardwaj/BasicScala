
// Demonstration of Case

object CaseEX {
 def main(args:Array[String]) {
println(studAgematch(7))
println(studAgematch(5))
println(studAgematch(12))
}



def studAgematch(age:Int) : String = age match {

case 5 => "Student Age is 5 "
case 7 => "Student Age is 7"
case 8 => "Student Age is 8"
case 10 => "Student Age is 10"
case _ => "Student age is greater than 10"
}
}
