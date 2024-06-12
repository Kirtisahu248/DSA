/*Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
Note: If the array is increasing then just print the last element will be the maximum value. */

import java.util.*;
public class Biotonic {
    public static int findMaximum(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaximum(arr, n));
    }
}
