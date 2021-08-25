package algorithms.inversions;

import algorithms.sort.ArrayUtils;

public class SimpleIC {

	public int countInversions(int[]arr) {
		
		int count = 0;
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					count++;
				}
			}
		}
		
		return count;
	}
	// Driver code
    public static void main(String args[])
    {
    	//int[] arr = {14, 13, 12, 11, 10, 9, 8,7,6,5, 4,3,2,1 };
     
    	 
        int[] arr = { 1, 3, 5, 2, 4, 6 };
        System.out.println("Given Array");
        
        ArrayUtils.printArray(arr);
 
        SimpleIC ob = new SimpleIC();
        int count = ob.countInversions(arr);
 
        System.out.println("Inversions: " + count);
       
    }
}
