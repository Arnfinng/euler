package project_4

object main {
	def main(args: Array[String]) {
		val palindromes = for (a <- (100 until 1000);
				b <- (a until 1000);
				val p:Int = a*b if isPalindrome(p.toString))
			yield p
		 println(palindromes.toList.sortWith(_ > _).head);
	}
	def isPalindrome(someNumber: String): Boolean = {
			val len = someNumber.length;
			for(i <- 0 until len/2) {
				if(someNumber(i) != someNumber(len-i-1)) return false; 
			}
			return true;
	}

}