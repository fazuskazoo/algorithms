package algorithms;
import algorithms.basic.Karatsuba;
/***
 *
 * TES
 *
 */

public class Algorithms {

	public static void main(String[] args) {
		Karatsuba k = new Karatsuba();
		
		int x = 5678;
		int y = 1234;
		long result = k.mult(x, y);
		System.out.println(x + " x " + y + " = " + result );
		
		assert(result == x*y);
		

	}

}
