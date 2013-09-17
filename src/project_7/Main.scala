package project_7

object main {
	def main(args: Array[String]) {

		def prime(num: Int, factors: List[Int]): Boolean = factors.forall(num % _ != 0)
				//finds all primes under a number
				def primes(n: Double): List[Int] = {
			require(n >= 2)

			def rec(i: Int, primes: List[Int]): List[Int] = {
				if (primes.length == n) primes
				else if (prime(i, primes)) rec(i + 1, i :: primes)
				else rec(i + 1, primes)
			}

			rec(2, List())
		}
		println(primes(10001)(0));

	}

}