import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqual{

     public static boolean check(long A[],long B[],int n)
    {
        //Your code here
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<n;i++){
            if(A[i]!=B[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long A[] = new long[n];
        long B[] = new long[n];

        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++){
            B[j] = sc.nextInt();
        }
        System.out.println(check(A, B, n));
    }
}