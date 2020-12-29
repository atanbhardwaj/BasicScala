

object Recursion {
      def fact(n:Int): Int=
      {
          if(n == 1) 1
          else n * fact(n - 1)
      }
      def gcd(n:Int, m:Int): Int={
        if (m != 0)
            return gcd(m, n % m);
        else
            return n
      }
      def main(args: Array[String]): Unit = {
         println("The factorial of Number 10 is : "+fact(10))
         printf("GCD of 12 and 18 is : "+ gcd(12,18))
      }
}