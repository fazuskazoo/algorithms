package algorithms.math.matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixMath {

	// create a matrix with random numbers 0-9
	public int[][] randomMatrix(int dimension) {
		int x[][] = new int[dimension][dimension];
		
		for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {
				
				x[i][j] = randomInt(10);
			}
		}
		return x;
	}
	
	// fill a matrix with a single value
	public  int[][] matrix(int dimension, int value) {
		int x[][] = new int[dimension][dimension];
		
		for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {
				
				x[i][j] = value;
			}
		}
		return x;
	}
	private int randomInt(int range) {
		return (int) (Math.random() * range);
	}
	
	public int [][] multiply(int x[][], int y[][] ) {
		int dimension = x[0].length;
    	int z[][] = new int[dimension][dimension];
    	for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {				
				for(int k = 0; k < dimension; k++) {
					z[i][j]+= x[i][k] * y[k][j]; 
							   		
				}				
			}			
		}	
    	
    	return z;
    }
	/***
	 *       
	 *   II    |  I 
	 * --------|-----
	 *   III   |  IV
	 * 
	 */
	public int[][] buildMatrix(int[][]I, int[][]II, int[][]III, int[][]IV) {
		int dimension = I[0].length * 2;
		int diff = I[0].length;
		int[][] matrix = new int[dimension][dimension];
		for(int i=0; i < diff; i++) {
			for(int j=0; j < diff; j++) {
				
				matrix[i][j] = II[i][j] = 
				matrix[i + diff ][j] = I[i][j];
				matrix[i][j + diff ] = III[i][j];
				matrix[i + diff ][j + diff ] = IV[i][j]; 
			}	
		}
		return matrix;
	}
	
	
	public int [][] pad(int[][]x, int padd) {
		
		int dimension = x[0].length;
		int [][] xPad = new int[dimension+1][dimension + 1];
		for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {				
				xPad[i][j] = x[i][j]; 							
			}
		}
		return xPad;
		
	}
	public List<int[][]> submatrix(int[][] matrix) {

		int subdimension = matrix[0].length/2;
		int[][]a = new int[subdimension][subdimension];
		int[][]b = new int[subdimension][subdimension];
		int[][]c = new int[subdimension][subdimension];
		int[][]d = new int[subdimension][subdimension];
		
		for(int i = 0; i < subdimension; i++) {
			for(int j = 0; j < subdimension; j++) {
				a[i][j] = matrix[i][j];
				b[i][j] = matrix[i + subdimension][j];
				c[i][j] = matrix[i][j + subdimension];
				d[i][j] = matrix[i + subdimension][j + subdimension];
			}
		}
		
		List<int[][]> l = new ArrayList<int[][]>();
		l.add(a);
		l.add(b);
		l.add(c);
		l.add(d);
		
		return l;
		
	}
	public  void printArray(int arr[][]) {
		System.out.println();
		for(int i = 0; i < arr[0].length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}			
			System.out.println();
		}
		
		
	}
	public int [][] add(int x[][], int y[][] ) {
		int dimension = x[0].length;
    	int z[][] = new int[dimension][dimension];
    	for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {								
				z[i][j] = x[i][j] + y[i][j]; 
							   								
			}			
		}	
    	
    	return z;
    }
	
	
	public int [][] subtract(int x[][], int y[][] ) {
		int dimension = x[0].length;
    	int z[][] = new int[dimension][dimension];
    	for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {								
				z[i][j] = x[i][j] - y[i][j]; 						   					
			}			
		}	
    	
    	return z;
    }
	
	public static void main(String args[]) {
		MatrixMath mm = new MatrixMath();
		int x[][] = mm.matrix(3, 1);
		
		int y[][] = mm.matrix(3, 1);
		int z[][]  = mm.add(x, y);
		mm.printArray(z);
		z  = mm.subtract(x, y);
		mm.printArray(z);
		
		z = mm.multiply(x,y);
		mm.printArray(z);
		
		
		int xPad[][] = mm.pad(x,1);
		mm.printArray(xPad);
		
	}
}
