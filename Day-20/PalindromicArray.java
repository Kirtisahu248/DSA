
import java.util.*;
public class PalindromicArray {
   static int palinArray(int arr[],int n){
    int count =0;
    for(int i=0;i<n;i++){
        int temp = arr[i];
        int ans = 0;
        while(temp>0){
            int digit = temp%10;
            ans = ans*10 + digit;
            temp = temp/10;
        }
        if(arr[i]== ans){
            count++;
        }
    }
    if(n == count){
        return 1;
    }
    return 0;
   }
   
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(palinArray(arr, n));
   }
}
