import java.util.Scanner;

public class SumofStr {

    public static long findSum(String str)
    {
        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            int sum=0;
            if(str.charAt(i) >='0' && str.charAt(i)<='9')
            {
                sum=sum*10+(str.charAt(i)-'0');
                while(i!= str.length()-1 && (str.charAt(i+1) >='0' && str.charAt(i+1)<='9'))
                {
                    sum = sum*10 +(str.charAt(i+1)-'0');
                    i++;
                }
            }
            ans+=sum;
        }
        
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(findSum(s));
    }
}
