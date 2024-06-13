import java.util.*;
public class SecondLargest{
    public static int print2largest(int arr[],int n){
        int large = arr[0];
        int slarge = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                slarge = large;
                large = arr[i];
            }
            else if(arr[i]!=large && arr[i]>slarge){
                slarge = arr[i];
            }
        }
        return slarge;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(print2largest(arr, n));
    }
}