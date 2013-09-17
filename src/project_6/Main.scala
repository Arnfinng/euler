package project_6

object main {
	def main(args: Array[String]) {
		def square(x: Int): Int = x * x;
		def id(x: Int): Int = x
		
		def sum(f: Int => Int, a: Int, b: Int): Int =
			if (a > b) 0;
			else f(a) + sum(f, a + 1, b);
		
		def sumSquares(a: Int, b: Int): Int = sum(square, a, b);
		def sumInts(a: Int, b: Int): Int = sum(id, a, b)
		
		println(square(sumInts(0, 100))-sumSquares(0, 100) );
		
	}

}