import java.util.Scanner;

public class Reverse {
    public static int ReverseNo(int n){
        int rev=0;
        while(n>0){
            int lastdigit = n%10;
            rev = (rev *10) + lastdigit;
            n = n/10;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Reverse of given no. is :" + ReverseNo(N));
    }
}
