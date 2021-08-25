package algorithms.math.karatsuba;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigKaratsuba {

	private final static BigInteger ZERO = new BigInteger("0");

    public static BigInteger karatsuba(BigInteger x, BigInteger y) {

        // cutoff to brute force
        int N = Math.max(x.bitLength(), y.bitLength());
        if (N <= 1) return x.multiply(y);                // optimize this parameter

        // number of bits divided by 2, rounded up
        N = (N / 2) + (N % 2);

        // x = a + 2^N b,   y = c + 2^N d
        BigInteger b = x.shiftRight(N);              // x divided    by 2 N times  
        BigInteger a = x.subtract(b.shiftLeft(N));   // b divided    by 2 N times.
        BigInteger d = y.shiftRight(N);              // y multiplied by 2 N times
        BigInteger c = y.subtract(d.shiftLeft(N));   // d divided    by 2 N times

        // compute sub-expressions
        BigInteger ac    = karatsuba(a, c);
        BigInteger bd    = karatsuba(b, d);
        BigInteger abcd  = karatsuba(a.add(b), c.add(d));

        return ac.add(abcd.subtract(ac).subtract(bd).shiftLeft(N)).add(bd.shiftLeft(2*N));
    }
	


	
	
	public static void main(String args[]) {		
	
		BigKaratsuba k = new BigKaratsuba();
		
		//BigInteger x = new BigInteger("12356748");
		//BigInteger y = new BigInteger("12312344");
		
		//BigInteger result = k.karatsuba(x,y);
		BigInteger ten = new BigInteger("2");
		System.out.println(ten.bitLength());
		
		
		
	   BigInteger x = new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");		
	   BigInteger y = new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
	   BigInteger result = k.karatsuba(x, y);
	   
		System.out.println(x + " x " + y + " = " + result );
		BigInteger r = x.multiply(y);
		System.out.println(r);
		if(result.equals(r)) {
			System.out.println("Right!");
		} else {
			System.out.println("Wrong");
		}
		

	}
}
