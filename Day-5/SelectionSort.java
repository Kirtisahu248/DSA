import java.util.*;
public class SelectionSort{
    public static void selectionSort(int arr[],int n){
      for(int i=0;i<n-1;i++){
        int min = i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min = j;
            }
        }
         // Swap the found minimum element with the first element
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
      }

      // Print the sorted array
      System.out.println("After selection sort:");
      for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;

         // Print the array before sorting
        System.out.println("Before selection sort:");
        for(int i=0;i<n;i++){
          System.out.print(arr[i] + " ");
        }
        System.out.println();

         // Perform selection sort
        selectionSort(arr, n);
    }
}