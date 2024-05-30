import java.util.*;

public class PrintAllDivisor{
    public static ArrayList<Integer> findDivisor(int n){
        //initialize an empty arraylist to store the divisors
        ArrayList<Integer> divisors = new ArrayList<>();

        //iterating up to the square ,finding the square root of n
        int sqrtN = (int)Math.sqrt(n); //type cast to integer
        for(int i=1;i<=sqrtN;i++){
            //check if i  divides n(i.e remainder is 0)
            if(n%i == 0){
                //add divisors of i to the list
                divisors.add(i);

                // Check if its different from i (i.e the vale of sqrt no. should not be repeated)
                if(i!= n/i){
                    //add the counterpart
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer>divisors = findDivisor(N);
        // Sort the list of divisors
        Collections.sort(divisors);
        System.out.println("Divisors of "+N + "are:");
          for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
    }
}