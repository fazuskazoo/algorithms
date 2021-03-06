package algorithms.sort;


class MergeSort 
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
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
                j++;
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
    void sort(int arr[], int left, int right)
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
    	int[] arr = {14, 13, 12, 11, 10, 9, 8,7,6,5, 4,3,2,1 };
 
        //System.out.println("Given Array");
        //printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);
 
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
