package algorithms.inversions;



class InversionCount 
{
	public int inversionCount;
	

	
	public void inversionCount(int arr[], int left, int right) {
		inversionCount = 0;
		sort(arr,left,right);
	}
	private void merge(int arr[], int l, int m, int r)
    {
		//System.out.println("Merge");
        // Find sizes of two subarrays to be merged
        int left_size = m - l + 1;
        int right_size = r - m;
 
        /* Create temp arrays */
        int L[] = new int[left_size];
        int R[] = new int[right_size];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < left_size; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < right_size; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second sub-arrays
        int i = 0, j = 0;
 
        // Initial index of merged sub-array array
        int k = l;
        while (i < left_size && j < right_size) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                System.out.println("R[j] " + R[j]);
                j++;
                int leftInL = left_size -i ;
                
                System.out.println("left inversions: " + leftInL);
                System.out.print("L: ");
                printArray(L);
                
                inversionCount = inversionCount + leftInL;
                }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < left_size) {
            arr[k] = L[i];
            i++;
            k++;            
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < right_size) {
            arr[k] = R[j];
            j++;
            k++;
           
        }
        
        //printArray(arr);
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    private void sort(int arr[], int left, int right)
    {
        if (left < right) {
            // Find the middle point
            int middle = left + (right-left)/2;
 
            // Sort first and second halves
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
 
            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
         System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
    	//int[] arr = {14, 13, 12, 11, 10, 9, 8,7,6,5, 4,3,2,1 };
     
    	 
        int[] arr = { 0, 1, 3, 5, 2, 4, 8,6};
        System.out.println("Given Array");
        
    	InversionCount.printArray(arr);
 
    	InversionCount ob = new InversionCount();
        ob.inversionCount(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        InversionCount.printArray(arr);
        
        System.out.println("Inversion Count: " + ob.inversionCount);
    }
}
