
package mergesort;

public class MergeSortt {
    
    public void sort (int arr[], int l, int r){
        if (l<r){
            int m = (r-1+l)/2;
            sort(arr, l, m);  //bölme işlemi aslına burada sürekli dizinin yarısıyla çağırılarak yapılır
            sort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }
    
    
    public void merge (int arr[], int l,int m , int r){
        int len1 = m-l+1;
        int len2 = r-m ;
        
        int left[] = new int[len1];
        int right[] = new int[len2];
        
        //parametre olarak gelen diziyi left ve right dizilerine böler her bölünen parça bir dizidir
        for (int i = 0; i < len1; i++) {
            left[i] = arr[l+i];        //en soldakinden itibaren sağa doğru elemanları left'e at
        }
        for (int j = 0; j < len2; j++) {
            right[j] = arr[m+1+j];     //burada left m+1 olur right listesine parametre listenin sağ tarafı atılır
           
        }
    //merge aşaması      
        int i = 0;
        int j = 0;
        int k = l;
        while(i<len1 && j<len2){
            if(left[i]<right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }
            else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        //eleman artma durumunda i len1'e ulaşmamıştır ya da j len2'ye ulaşmamıştır
        while(i<len1){
            arr[k]= left[i];
            i++;
            k++;
        }
        while(j<len2){
            arr[k] = right[j];
            j++;
            k++;
        }
        
        
    }
    
    
    public static void print (int ar[]){
        for(int j = 0 ; j<ar.length ; j++){
            System.out.print(ar[j]+ " ");
        }
        System.out.println();
    }
}
