package algorithms.math.matrix;

import java.util.ArrayList;
import java.util.List;

public class MatrixDC extends MatrixMath{

	int x[][];
	int y[][];
	int z[][];
	int size;
	int range = 10;
/***	
	public MatrixDC(int size) {
		this.size = size;
		x = new int[size][size];
		y = new int[size][size];
		z = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				x[i][j] = randomInt();
				y[i][j] = randomInt();
			}
		}
		
	}
***/
	
	public int [][] matrixMultiply(int x[][], int y[][] ) {
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
	
	
	public int[][] strassen(int[][]x, int[][]y) {
		
		
		if (x[0].length == 1) {
			return matrixMultiply(x,y);
		}
		
		List<int[][]> list1 = submatrix(x);
		int[][] a = list1.get(0);
		int[][] b = list1.get(1);
		int[][] c = list1.get(2);
		int[][] d = list1.get(3);
		List<int[][]> list2 = submatrix(y);
		int[][] e = list2.get(0);
		int[][] f = list2.get(1);
		int[][] g = list2.get(2);
		int[][] h = list2.get(3);
		
		int[][] p1 = multiply(a,subtract(f,h));
		int[][] p2 = multiply(add(a,b),h);
		int[][] p3 = multiply(add(c,d),e);
		int[][] p4 = multiply(d,subtract(g,e));
		int[][] p5 = multiply(add(a,d), add(e,h));
		int[][] p6 = multiply(subtract(b,d),add(g,h));
		int[][] p7 = multiply(subtract(a,c),add(e,f));
		
		/***
		 *       
		 *   II    |  I 
		 * --------|-----
		 *   III   |  IV
		 * 
		 */
		
		int[][] II = subtract(add(p5,p4),add(p2,p6));
		int[][] I = add(p1,p2);
		int[][] III  = add(p3,p4);
		int[][] IV = subtract(add(p1,p5),subtract(p3,p7));
		
		
		int[][] matrix = this.buildMatrix(I, II, III, IV);
		  					
		return matrix;
	}
	
	private int randomInt() {
		return (int) (Math.random() * range);
	}
	
	void printArrays() {
		printArray(x);
		printArray(y);
	}
	
	int [][] getX() {
		return x;
	}
	
	int [][] getY() {
		return y;
	}
	
	int [][] getZ() {
		return z;
	}
	
	
	public static void main(String[] args) {
		int dimension = 3;
		
		MatrixMath mm = new MatrixMath();
		int[][]x = mm.matrix(dimension, 1);
		int[][]y = mm.matrix(dimension, 1);
		
		
		MatrixDC dc =  new MatrixDC();
		
		int z2[][] = mm.multiply(x,y);
		mm.printArray(z2);
		if(dimension % 2 ==1) {
			x = mm.pad(x,1);
			y = mm.pad(y,1);
		}
		int z1[][] = dc.strassen(x, y);
		mm.printArray(z1);
		
	}
}
