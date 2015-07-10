object Practices {
  println("Welcome to the Scala worksheet")
  
   	def isSorted[A] (as: Array[A], ordered: (A,A) => Boolean) : Boolean = {
 		def loop(n: Int): Boolean = {
 			if (n + 1 >= as.length) true
 			else if ( ordered( as(n), as(n+1) ) ) loop(n+1)
 			else false
 		}
 		loop(0)
 	}
 	
 	isSorted(Array(1,2,3,4), (x: Int, y: Int) => x >= y)
                                                  
}