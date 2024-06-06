import java.util.Scanner;

public class SumofSeries{
    public static long SumSeries(int n){
        long sum =0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     System.out.println(SumSeries(n));
    }
}