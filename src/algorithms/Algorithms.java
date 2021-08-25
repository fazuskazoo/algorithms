package algorithms;
import java.math.BigInteger;

import algorithms.math.MathUtils;
import algorithms.math.karatsuba.BigKaratsuba;
import algorithms.math.karatsuba.Karatsuba;
import algorithms.math.matrix.MatrixMult;


public class Algorithms {

	public static void main(String[] args) {
		
		
		new MatrixMult().mult();
		
		/***
		new Algorithms().test();
		
		
		long x = 12345;
		long y = 67890;
							
		Karatsuba gk = new Karatsuba();
		long actualProduct = gk.karatsuba(x,y);
		
		BigInteger bigX = new BigInteger("12345");
		BigInteger bigY = new BigInteger("67890");
		BigKaratsuba bigk = new BigKaratsuba();
		
	    BigInteger bigProduct = bigk.karatsuba(bigX, bigY);
	
		long expectedProduct = x * y;
       
 
        // Printing the expected and corresponding actual product
        System.out.println("Expected 1 : " + expectedProduct);
        System.out.println("Actual 1 : " + actualProduct + "\n\n");
        
        if(actualProduct == expectedProduct)
            System.out.println("Correct");
        else
        	System.out.println("Incorrect");
        
        ***/
              		
	}
	
	public void test() {

		long num = 200;
				        	
        long a = num >> 1;
        System.out.println(a);
        long b = num >> 2;
        System.out.println(b);
        		   			
	}

}
