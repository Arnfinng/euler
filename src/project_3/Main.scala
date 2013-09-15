package project_3

import scala.collection.mutable.ListBuffer

object Main {
	def main(args: Array[String]) {
		val input = 600851475143l;
		val primesList = primesUnder(math.sqrt(input));
		for (num <- primesList) {
			if(isFactor(input, num)){
			  println(num);
			}
		}
	}

	//Checks to see if they are actually factors
	def isFactor(a:Long, n:Int): Boolean = a % n == 0;

	//finds all primes under the number
	def primesUnder(n: Double): List[Int] = {
			require(n >= 2)

			def rec(i: Int, primes: List[Int]): List[Int] = {
				if (i >= n) primes
				else if (prime(i, primes)) rec(i + 1, i :: primes)
				else rec(i + 1, primes)
			}

			rec(2, List())
	}

	def prime(num: Int, factors: List[Int]): Boolean = factors.forall(num % _ != 0)
}