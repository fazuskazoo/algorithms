package algorithms.basic;

public class Karatsuba {

	
	public long mult(long x, long y) {
		int x_len = length(x);
		
		long a = left_digit(x,x_len);
		long b = right_digit(x,x_len,a);
	    	    	
	     int y_len = length(y);
	     long c = left_digit(y,y_len);
	     long d = right_digit(y,y_len,c);
		    
	     long step_one = a * c;
	     long step_two = b * d;
	     long step_three = (a + b) * ( c + d); 
	     long step_four = step_three - step_one - step_two;
	    
	     long step_five = (long) ( Math.pow(10, 4) * step_one + Math.pow(10, 2) * step_four + step_two );
	     return step_five;	
	}
	
	


	long left_digit(long v, int length) {
		int h = length/2;
		long left = v;
		for(int i = 0; i < h; i++) {
			left/=10;			
		}
		return left;
	}
	
	long right_digit(long v, int length, long left) {
		
		int h = length/2;
		long minus = left;
		for(int i = 0; i < h; i++) {
			minus*=10;
		}
		long right = v - minus;
		return right;
	}
	
	public int length(double num) {
		return  (int)(Math.log10(num)+1);	
	
	}
	
	public static void main(String args[]) {
		new Karatsuba().mult(5678, 1234);
	}
}
