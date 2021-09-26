package algorithms.sort;

public class QuickSort extends ArrayUtils {

   private void swap(int arr[], int i, int j) {
	   int temp = arr[i];
	   arr[i] = arr[j];
	   arr[j] = temp;
   }
   public int partition(int arr[], int begin, int end) {
	   
	   int pivot = arr[begin];
	   int i = begin + 1;
	  	   
	   for(int j = begin + 1 ; j < end; j++) {
		   if (arr[j] <= pivot) {		  
			   swap(arr,i,j);	
			   i++;
		   }
	   }
	  
	   swap(arr,i-1,begin);
	   return i;
   }
  
   public void quicksort(int arr[], int begin, int end) {
	   
	   if (begin < end) {
		 int pivotIndex = partition(arr,begin,end);  
		 quicksort(arr,begin,pivotIndex-1);
		 quicksort(arr,pivotIndex+1,end);
	   }	  	  
   }
   
   public static void main(String [] args) {
	   int arr[] = { 2,4,5,6 , 9, 3,4,5,65,6,-1,7 };
	   
	   QuickSort q = new QuickSort();
	   q.quicksort(arr, 0, arr.length);  
	   System.out.println();
	   ArrayUtils.printArray(arr);
   }
}
