// Java program for implementation of QuickSort
class QuickSort
{
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is 
              now at right place */
            int pi = partition(arr, low, high);
 
            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    
    public static int median(int[] arr, int low, int high) {
        int m = 0;
    	
    	 if (low < high) {
             /* pi is partitioning index, arr[pi] is 
               now at right place */
             int pi = partition(arr, low, high);
             if (arr.length / 2 != 0) {
            	 if (pi == (arr.length)/2) {
            		 return arr[pi];
            	 } else if (pi > (arr.length)/2){
            		 m = median(arr, low, pi-1);
            	 } else {
            		 m = median(arr, pi+1, high);
            	 }
             } else {
            	 if (pi == (arr.length)/2) {
            		 int n1 = arr[pi];
            		 int n2 = arr[0];
            		 for (int i = 0; i < pi; i++) {
            			 if (arr[i] > n2) {
            				 n2 = i;
            			 }
            		 }
            		 m = (n1+n2)/2;
            	 }
             }
  
             // Recursively sort elements before
             // partition and after partition
//             sort(arr, low, pi-1);
             
         }
		
		return m;
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
 
    // Driver program
    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
 
        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);
        
 
        System.out.println("sorted array");
        printArray(arr);
        System.out.println(ob.median(arr, 0, n-1));
    }
}
/*This code is contributed by Rajat Mishra */
/* https://www.geeksforgeeks.org/quick-sort */

