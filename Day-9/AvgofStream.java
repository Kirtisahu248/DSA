import java.util.Arrays;
import java.util.Scanner;

public class AvgofStream {
    public static float[] StremAvg(int arr[],int n){
        float[] ans = new float[n];
        float sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            ans[i] = sum/(i+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        float[] avg = StremAvg(arr, n);
        System.out.println("Average of streams are:"+Arrays.toString(avg));
        
    }
}
