import java.util.Scanner;

public class Armstrong {
   public static boolean ArmstrongNo(int n){
    //ArmStrong no. 153 = 1^3 + 5^3 + 3^3 is equal to 153
    int temp = n;
    int sum =0;
    while(n>0){
        int LastDig = n %10;
        sum = sum + (LastDig*LastDig*LastDig);
        n = n/10;
    }
    if(temp == sum){
        return true;
    }else{
        return false;
    }
   }    
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println(ArmstrongNo(N));
   }
}
