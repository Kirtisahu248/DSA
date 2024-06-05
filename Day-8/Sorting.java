import java.util.*;
public class Sorting{
  public static void BubbleSort(int arr[],int n){
    //algorithm : push the maximum to the last by adjacent swaps

    for(int i=n-1;i>=1;i--){
        for(int j=0;j<=i-1;j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
            }
        }
    }

    System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements of array:");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        BubbleSort(arr, n);    
  }
}