import java.util.Scanner;

public class PrimeNo {
    //Prime no.: no. having 2 factors i.e 1 and itself
    public static boolean isPrime(int n){
      int cnt = 0;
      for(int i=1;i*i<=n;i++){
        if(n%i == 0){
            cnt++;
            if((n/i)!=i){
                cnt++;
            }
        }
      }
      if(cnt == 2){
        return true;
      }else{
        return false;
      }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       System.out.println("The no. is prime or not : "+isPrime(N)); 
    }
}
