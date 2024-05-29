import java.util.Scanner;

public class CheckPalindrome {
    public static boolean Palindrome(int n){
        int temp = n;
        int revN = 0;
        while(n>0){
            int LD = n%10;
            revN = (revN*10) + LD;
            n = n/10;
        }
        if(temp == revN){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int N = sc.nextInt();
        System.out.println( Palindrome(N));

    }
}
