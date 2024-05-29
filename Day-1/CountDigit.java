import java.util.*;
public class CountDigit{

    public static int CountNum(int n){
        int count = 0;
        while(n>0){
          count= count+1;
          n = n/ 10;
        }

        //OPTIMIZE METHOD
        
     // Calculate the count of digits in 'n'
    // using logarithmic operation log10(n) + 1.
    //static int countDigits(int n) {
        // Initialize a variable 'cnt' to
        // store the count of digits.
       // int cnt = (int) (Math.log10(n) + 1);

        // The expression (int)(Math.log10(n) + 1)
        // calculates the number of digits in 'n'
        // and casts it to an integer.

        // Adding 1 to the result accounts
        // for the case when 'n' is a power of 10,
        // ensuring that the count is correct.

        // Finally, the result is cast
        // to an integer to ensure it is rounded
        // down to the nearest whole number.

        // Return the count of digits in 'n'.
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(CountNum(N));
    }
}