package algorithms.math;

public class MathUtils {
  public static boolean isPrime(int n) {
	  for (int x = 2; x * x <=n; x++) {
		  if (n % x == 0) {
			  return false;
		  }
	  }
	  return true;
  }
  public  long left_digit(long v, int length) {
	  if(length(v) == 1) {
			return v;
		}
		int h = length/2;
		long left = v;
		for(int i = 0; i < h; i++) {
			left/=10;			
		}
		return left;
	}
	
	public  long right_digit(long v, int length, long left) {
		
		if(length(v) == 1) {
			return v;
		}
		int h = length/2;
		long minus = left;
		for(int i = 0; i < h; i++) {
			minus*=10;
		}
		long right = v - minus;
		return right;
	}
	
	public  int length(double num) {
		return  (int)(Math.log10(num)+1);	
	
	}
  public static void main(String args[]) {
	  System.out.println(MathUtils.isPrime(217));
  }
}
