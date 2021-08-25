package algorithms.math.karatsuba;

public class Karatsuba {

	public long karatsuba(long x, long y) {
	int N = Math.max(
            String.valueOf(x).length(),
            String.valueOf(y).length()
    );

    if (N == 1)
        return x * y;

    N = (N / 2) + (N % 2); // half the max_width, plus 1 max_width is odd

    long b = x >> N;         // x divided    by 2 N times  
    long a = x - (b << N);   // b divided    by 2 N times.
    long d = y >> N;         // y multiplied by 2 N times
    long c = y - (d << N);   // d divided    by 2 N times

    long ac = karatsuba(a, c);
    long bd = karatsuba(b, d);
    long abcd = karatsuba(a + b, c + d);

    return ac + (abcd - ac - bd << N) + (bd << 2 * N);
	}
}
