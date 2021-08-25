package algorithms.sort;

public class BubbleSort extends ArrayUtils {
	
	public void sort(int[] arr) {
		
		boolean didASwitch;
		int loop = 1;
		do {
			didASwitch = false;
			
			for(int i = 0; i < arr.length -1; i++) {
				
				int x = arr[i];
				int y = arr[i+1];
				
				if ( x > y) {
					arr[i] = y;
					arr[i+1] = x;
					didASwitch = true;
				}				
			}	
		System.out.println("Loop " + loop++);
		} while (didASwitch == true);
	}

	public static void main(String[] args) {
		
     //int[] arr = ArrayUtils.reversedList(100000);
		
	 int[] arr = { 4, 3, 2, 1 }; 
			 	 
     BubbleSort i = new BubbleSort();
     i.printArray(arr);
     i.sort(arr);
     i.printArray(arr);
     
	}
}
