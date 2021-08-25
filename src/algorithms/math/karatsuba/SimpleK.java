package algorithms.math.karatsuba;

import algorithms.math.MathUtils;

public class SimpleK extends MathUtils {

	public void print(int o) {
		System.out.println(o);
	}
	
	public void print(Long l) {
		System.out.println(l);
	}
	public long karatsuba(long x, long y) {
		
		 if (length(x) == 1 & length(y) == 1) {
			 return x * y;
		 }
		 
		 
		 int x_len = length(x);		 
		 long a = left_digit(x,x_len);		 
		 long b = right_digit(x,x_len,a);
			    	    	
	     int y_len = length(y);	    
	     long c = left_digit(y,y_len);	     
	     long d = right_digit(y,y_len,c);
	     		    
	     long n = Math.max(x_len, y_len);
	     long step_one = a * c;	    
	     long step_two = b * d;	     
	     long step_three = (a + b) * ( c + d); 	     
	     long step_four = step_three - step_one - step_two;
	    
	     long top = (long)Math.pow(10, n) * step_one;
	     long bottom = (long)Math.pow(10, (n/2)) * step_four;
	    
	     long middle = step_two;
	     
	     long step_five = top + middle + bottom;
	     	    	    
	     return step_five;	
	}
	
	



	public static void main(String args[]) {		
	
		SimpleK k = new SimpleK();
		
		int x = 5678;
		int y = 1234;
		long result = k.karatsuba(x, y);
		System.out.println(x + " x " + y + " = " + result );
		
		if(result == x*y) {
			System.out.println("Right!");
		} else {
			System.out.println("Wrong");
		}
		

	}
}
