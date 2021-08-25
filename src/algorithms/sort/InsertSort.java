package algorithms.sort;

public class InsertSort extends ArrayUtils{
	
	public void sort(int[] arr) {
		
		for(int j = 1; j < arr.length; j++) {
			int key = arr[j];
			int i = j - 1;
			
			while (i >= 0 && arr[i] > key) {				
				arr[i + 1] = arr[i];				
				i--;			
			}			
			arr[i + 1] = key;						
		}		
	}

	public static void main(String[] args) {
		
     //int[] arr = ArrayUtils.reversedList(100000);
		
	 int[] arr = { 4, 3, 2, 1, 0 };     
     InsertSort i = new InsertSort();
     i.sort(arr);
     i.printArray(arr);
     
	}

}
