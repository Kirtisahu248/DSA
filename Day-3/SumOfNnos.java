import java.util.*;
public class SumOfNnos {
    public static int SumOfNaturalno(int n){
        if(n==0){
            return 0;
        }
        return n+SumOfNaturalno(n-1);
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      System.out.println("Sum of natural nos.:" + SumOfNaturalno(N));
    }
}
