package algorithms.math.matrix;

public class MatrixMult {

	public void mult() {
		
		final int size = 3;
		int x[][] = new int[size][size];
		int y[][] = new int[size][size];
		int z[][] = new int[size][size];
		
	
		x[0][0] = 2;
		x[0][1] = 1;
		x[0][2] = 0;
		x[1][0] = 3;
		x[1][1] = 2;
		x[1][2] = 0;
		x[2][0] = 1;
		x[2][1] = 0;
		x[2][2] = 1;
				
				
		y[0][0] = 1;
		y[0][1] = 1;
		y[0][2] = 1;
		y[1][0] = 2;
		y[1][1] = 1;
		y[1][2] = 1;
		y[2][0] = 2;
		y[2][1] = 3;
		
		y[2][2] = 1;
				
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {				
				for(int k = 0; k < size; k++) {
					z[i][j]+= x[i][k] * y[k][j]; 
							   		
				}				
			}			
		}	
		
		printArray(z);
	}
	
	

		
	
	void printArray(int arr[][]) {
		for(int i = 0; i < arr[0].length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}			
			System.out.println();
		}
	}
}
