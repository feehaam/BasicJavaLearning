import java.util.Random;
public class AlgoProject {
      
      //Required variables
            static int unsortedArray[] = new int[10]; //The unsortedArray we will use
            static int sorted[]; //The array we use to store sorted values
            static int arr[]; //We will this array as a temporary copy of unsortedArray
            static Random r = new Random();
            
      public static void main(String args[]){
            //TESTING ALL SORTING CODES IF THESE WORKS FINE
            Test();
            
            //SORTING TIME COMPARISON
            Compare(10000);
            Compare(20000);
            
            Compare(100000);
            Compare(200000);
            
            Compare(1000000);
            Compare(2000000);
            
            Compare(10000000);
            Compare(20000000);
            
            Compare(100000000);
      }
      
      static void Test(){
            //Taking random values in unsortedArray
            for(int i=0; i<unsortedArray.length; i++)
                  unsortedArray[i] = r.nextInt(100);
            
            arr = new int[unsortedArray.length];
            System.out.println("TESTING\n");
            System.out.print("The original array: ");
            arr = copyUnsortedArray(arr, unsortedArray);
            print(arr); //Printing the unsortedArray
            
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.print("      1. After bubble sort: ");
            sorted = bubbleSort(arr); //Sorting with bubble sort
            print(sorted); //Printing the sorted array after bubble sort
            
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.print("      2. After selection sort: ");
            sorted = selectionSort(arr); //Sorting with selection sort
            print(sorted); //Printing the sorted array after selection sort
            
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.print("      3. After insertion sort: ");
            sorted = insertionSort(arr); //Sorting with insertion sort
            print(sorted); //Printing the sorted array after insertion sort
            
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.print("      4. After merge sort: ");
            sorted = mergeSort(arr, 0, arr.length-1); //Sorting with merge sort
            print(sorted); //Printing the sorted array after merge sort
            
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.print("      5. After heap sort: ");
            sorted = heapSort(arr); //Sorting with heap sort
            print(sorted); //Printing the sorted array after heap sort
            
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.print("      6. After shell sort: ");
            sorted = shellSort(arr); //Sorting with shell sort
            print(sorted); //Printing the sorted array after shell sort
            
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.print("      7. After quick sort: ");
            sorted = quickSort(arr, 0, arr.length-1); //Sorting with quick sort
            print(sorted); //Printing the sorted array after quick sort
      }
      
      static void Compare(int N){
            System.out.println("\n\nSORTING TIME COMPARISON: "+N+" ITEMS.\n");
            Long Time;
            unsortedArray = new int[N];
            for(int i=0; i<unsortedArray.length; i++)
                  unsortedArray[i] = r.nextInt(N);
            //Buble sort time
            if(N<=200000){
                  arr = copyUnsortedArray(arr, unsortedArray);
                  System.out.println("      Bubble sort: "+N+" items.");
                  Time = getTime();
                  sorted = bubbleSort(arr); 
                  printTime(Time);
            }
            //Selection sort time
            if(N<=200000){
                  arr = copyUnsortedArray(arr, unsortedArray);
                  System.out.println("      Selection: "+N+" items.");
                  Time = getTime();
                  sorted = selectionSort(arr); 
                  printTime(Time);
            }
            //Insertion sort time
            if(N<=200000){
                  arr = copyUnsortedArray(arr, unsortedArray);
                  System.out.println("      Insertion sort: "+N+" items.");
                  Time = getTime();
                  sorted = insertionSort(arr); 
                  printTime(Time);
            }
            //Merge sort time
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.println("      Merge sort: "+N+" items.");
            Time = getTime();
            sorted = mergeSort(arr, 0, arr.length-1); 
            printTime(Time);
            //Heap sort time
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.println("      Heap sort:"+N+" items.");
            Time = getTime();
            sorted = heapSort(arr); 
            printTime(Time);
            //Shell sort time
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.println("      Shell sort: "+N+" items.");
            Time = getTime();
            sorted = shellSort(arr); 
            printTime(Time);
            //Quick sort time
            arr = copyUnsortedArray(arr, unsortedArray);
            System.out.println("      Quick sort: "+N+" items.");
            Time = getTime();
            sorted = quickSort(arr, 0, arr.length-1); 
            printTime(Time);
      }
      
      
      //////////////TIME FUNCTOINS//////////////
      static Long getTime(){
            return System.currentTimeMillis();
      }
      static void printTime(Long T){
            System.out.println("      Total time taken: "+(System.currentTimeMillis()-T)+" ms.\n");
      }
      
      //////////////GET UNSORTED ARRAY//////////////
      static int[] copyUnsortedArray(int arr[], int us[]){
            arr = new int[us.length];
            for(int i=0; i<arr.length; i++)
                  arr[i] = us[i];
            return arr;
      }
      
      //////////////TO PRINT ANY ARRAY//////////////
      static void print(int arr[]){
            for(int x: arr)
                  System.out.print(x+"  ");
            System.out.println();
      }
      
      //////////////BUBBLE SORT CODE//////////////
      static int[] bubbleSort(int arr[]){
            int n = arr.length; 
            for (int i = 0; i < n-1; i++) 
                for (int j = 0; j < n-i-1; j++) 
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j]; 
                        arr[j] = arr[j+1]; 
                        arr[j+1] = temp; 
                    }
            return arr;
      }
      
      //////////////SELECTION SORT CODE//////////////
      static int[] selectionSort(int arr[]){ 
            int n = arr.length; 
            for (int i = 0; i < n-1; i++) { 
                  int min_idx = i; 
                  for (int j = i+1; j < n; j++) 
                  if (arr[j] < arr[min_idx]) 
                        min_idx = j; 
                  int temp = arr[min_idx]; 
                  arr[min_idx] = arr[i]; 
                  arr[i] = temp; 
            } 
            return arr;
      } 
      
      //////////////INSERTION SORT CODE//////////////
       static int[] insertionSort(int arr[]){ 
            int n = arr.length; 
            for (int i = 1; i < n; ++i) { 
                  int key = arr[i]; 
                  int j = i - 1; 
                  while (j >= 0 && arr[j] > key) { 
                        arr[j + 1] = arr[j]; 
                        j = j - 1; 
                  } 
                  arr[j + 1] = key; 
            }
            return arr;
      }
       
       //////////////MERGE SORT CODE//////////////
      static int[] mergeSort(int arr[], int l, int r){
            if (l < r) {
                  // Find the middle point
                  int m = (l + r) / 2;

                  // Sort first and second halves
                  mergeSort(arr, l, m);
                  mergeSort(arr, m + 1, r);

                  // Merge the sorted halves
                  merge(arr, l, m, r);
            }
            return arr;
      }
     static void merge(int arr[], int l, int m, int r){
            int n1 = m - l + 1;
            int n2 = r - m;

            int L[] = new int[n1];
            int R[] = new int[n2];

            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];

            int i = 0, j = 0;
            int k = l;
            while (i < n1 && j < n2) {
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
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
    }
      
      
      //////////////HEAP SORT CODE//////////////
      static int[] heapSort(int arr[]){
            int n = arr.length;
            
            for (int i = n / 2 - 1; i >= 0; i--)
                  heapify(arr, n, i);
            
            for (int i = n - 1; i > 0; i--) {
                  int temp = arr[0];
                  arr[0] = arr[i];
                  arr[i] = temp;
                  heapify(arr, i, 0);
            }
            return arr;
       }
  
      static void heapify(int arr[], int n, int i){
            int largest = i; 
            int l = 2 * i + 1; 
            int r = 2 * i + 2; 

            if (l < n && arr[l] > arr[largest])
                  largest = l;

            if (r < n && arr[r] > arr[largest])
                  largest = r;

            if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
            }
      }
  
      //////////////SHELL SORT CODE//////////////
      static int[] shellSort(int arr[]){ 
            int n = arr.length; 
            for (int gap = n/2; gap > 0; gap /= 2){ 
                  for (int i = gap; i < n; i += 1){ 
                        int temp = arr[i]; 
                        int j; 
                        for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                              arr[j] = arr[j - gap]; 
                        arr[j] = temp; 
                  } 
            } 
            return arr;
      } 
      
      //////////////QUICK SORT CODE//////////////
      static int[] quickSort(int arr[], int low, int high){ 
            if (low < high) { 
                  int pi = quickSortRun(arr, low, high); 
                  quickSort(arr, low, pi-1); 
                  quickSort(arr, pi+1, high); 
            } 
            return arr;
      } 
      static int quickSortRun(int arr[], int low, int high){ 
            int pivot = arr[high];  
            int i = (low-1);
            for (int j=low; j<high; j++){  
                  if (arr[j] < pivot){ 
                        i++; 
                        int temp = arr[i]; 
                        arr[i] = arr[j]; 
                        arr[j] = temp; 
                  } 
            } 
            
            int temp = arr[i+1]; 
            arr[i+1] = arr[high]; 
            arr[high] = temp; 
            return i+1; 
      } 
}