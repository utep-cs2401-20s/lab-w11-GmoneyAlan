public class newSorting {

    newSorting(){}

    public void sort(int[] A, int size){
        if(A.length <= size)
            quickSort(A);
        else{
            int mid = A.length / 2;  //mid point of the array
            int[] LH = new int[mid];    //Left Array
            int[] RH = new int[A.length-mid];   //Right Array
            for(int i = 0; i < LH.length; i++){  //Store values from 0 - mid on the Left Array
                LH[i] = A[i];
            }
            for(int i = 0; i < RH.length; i++){  //Store values from mid - end value of Array
                RH[i] = A[i + mid];
            }
            sort(LH,size);  //Call same method with left array
            sort(RH,size);  //Call same method with right array
            mergeSortedHalves(A,LH,RH);  //Start merging the arrays
        }
    }

    public void quickSort(int[] A){
        quickMain( A, 0, A.length - 1);
    }
    void quickMain(int arr[], int low, int high) {
        if (low < high) {

            int p = quickSort(arr, low, high);

            quickMain(arr, low, p-1);
            quickMain(arr, p+1, high);
        }
    }
    public int quickSort(int[] A, int start, int end){
        int pivot = A[end];
        int low = start - 1; // index of smaller element
        //loop to sort numbers whether bigger or smaller than the pivot
        for (int j = start; j < end; j++) {
            if (A[j] < pivot) {
                low++;
                int temp = A[low];
                A[low] = A[j];
                A[j] = temp;
            }
        }
        //Sorts pivot in number into the array
        int temp = A[low + 1];
        A[low + 1] = A[end];
        A[end] = temp;

        return low + 1;
    }
    public void mergeSortedHalves(int[] A, int[] L, int[] R){

        int k,n,x;
        k = 0;// A index
        n = 0;// L index
        x = 0;// R index
        //Sorts both L & R Arrays into one array
        while(n < L.length && x < R.length){
            if(L[n] < R[x]){
                A[k] = L[n];
                k++;
                n++;
            } else{
                A[k] = R[x];
                k++;
                x++;
            }
        }
        //Incase one of the arrays is bigger the next two while loops add the rest into A
        while(n < L.length){
            A[k] = L[n];
            k++;
            n++;
        }
        while(x < R.length){
            A[k] = R[x];
            k++;
            x++;
        }
    }
}

