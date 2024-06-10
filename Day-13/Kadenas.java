import java.util.*;
public class Kadenas {
    public static long MaxSubarraySum(int arr[],int n){
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            maxi = Math.max(maxi,sum);
            if(sum<0){
                sum =0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(MaxSubarraySum(arr, n));
    }
}
