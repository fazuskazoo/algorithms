package algorithms.sort;

import java.util.Random;

public class ArrayUtils {
	
	 public static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr[i] + " ");
	        System.out.println();
	    }
	 
	public static int list[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

	public static int[] reversedList(int length) {
		int [] array = new int[length];
		int j = 0;
		for ( int i = length-1; i >= 0; i--) {
		   array[i] = j++;
		}
		return array;
	}
	public static int[] randomList(int length) {
		Random rand = new Random();
		int size = rand.nextInt(length);
		int [] array = new int[length];
		for ( int i = 0; i < length; i++) {
			array[i] = rand.nextInt(length);
		}
		
		return array;
	}
}
