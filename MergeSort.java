
package mergesort;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
  
        //print(arr);
        MergeSortt ob = new MergeSortt();
        ob.sort(arr, 0, arr.length -1);
        ob.print(arr);
    }
//    
//    
//    public static void mergesort(int dizi[],int l,int r){
//        if (l < r) {
//            int m =l+ (r-l)/2;         
//            mergesort(dizi, l, m);
//            mergesort(dizi, m + 1, r);
//            merge(dizi, l, m, r);
//        }
//    }
//    
//    public static void merge(int dizi[],int l,int m,int r){
//        // Find sizes of two subarrays to be merged
//        int n1 = m - l + 1;
//        int n2 = r - m ;
//  
//        /* Create temp arrays */
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//  
//        /*Copy data to temp arrays*/
//        for (int i = 0; i < n1; i++)
//            L[i] = dizi[l+ i];
//        for (int j = 0; j < n2; j++)//j m+1den başlasın
//            R[j] = dizi[m + 1 + j];
//  
//        /* Merge the temp arrays */
//        
//        // Initial indexes of first and second subarrays
//        int i = 0, j = 0;
//  
//        // Initial index of merged subarray array
//        int k = l;
//        while (i < n1 && j < n2) {
//            if (L[i] <= R[j]) {
//                dizi[k] = L[i];
//                //System.out.println("burası solun ilk elemanı" + L[i]);
//                i++;
//            }
//            else {
//                dizi[k] = R[j];
//                //System.out.println("burası sağın ilk elemanı" + R[j]);
//                j++;
//            }
//            k++;
//        }
//  
//        /* Copy remaining elements of L[] if any */
//        while (i < n1) {
//            dizi[k] = L[i];
//            i++;
//            k++;
//        }
//  
//        /* Copy remaining elements of R[] if any */
//        while (j < n2) {
//            dizi[k] = R[j];
//            j++;
//            k++;
//        }
//        
//    }
//    public static void print (int ar[]){
//        for(int j = 0 ; j<ar.length ; j++){
//            System.out.print(ar[j]+ " ");
//        }
//        System.out.println();
//    }
}
