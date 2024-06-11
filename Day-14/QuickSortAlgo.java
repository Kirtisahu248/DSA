import java.util.*;
public class QuickSortAlgo{

     //Function to sort an array using quick sort algorithm.
     static void quickSort(int arr[], int low, int high)
     {
         
         if(low < high){
            int pIndex = partition(arr,low,high);
             quickSort(arr,low,pIndex-1); //left half i.e elements smaller than pivot
             quickSort(arr,pIndex+1,high); //right half i.e elements greater than pivot
             
         }
         
     }
     static int partition(int arr[], int low, int high)
     {
         
         int pivot = low;
         int i = low;
         int j = high;
         while(i<j){
             //first take the element greater than pivot
             while(arr[i]<=arr[pivot] && i<=high-1){
                 i++;
             }
             
             //element smaller than pivot find
             while(arr[j]>arr[pivot] && j>=low+1){
                 j--;
             }
             if(i<j){
              //swap
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
             }
         }
         //placing the pivot in correct place
         int t = arr[low];
         arr[low] = arr[j];
         arr[j] = t;
         return j;
     } 
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = N-1;
        quickSort(arr, low, high);
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     }
}