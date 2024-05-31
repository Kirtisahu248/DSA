import java.util.Scanner;

public class GCD{
    public static int findGCD(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }else{
                b = b%a;
            }
        }
        if(a==0){
            return b;
        }else{
            return a;
        }
    }
    public static int findLCM(int a, int b){
        return (a*b)/findGCD(a, b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nos. a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of "+ a +"and "+b+" is:"+findGCD(a, b) );
        System.out.println("LCM of "+ a +" and "+b+" is:"+findLCM(a, b) );
    }
}