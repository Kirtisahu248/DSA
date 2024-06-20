import java.util.*;
public class ArrayLeaders{
    static ArrayList<Integer> leaders(int n, int arr[]) {
      
        ArrayList<Integer> leaders = new ArrayList<Integer>();
       leaders.add(arr[n-1]);
       for(int i=n-2;i>=0;i--){
           if(arr[i]>=leaders.get(leaders.size()-1)){
               leaders.add(arr[i]);
           }
       }
        Collections.reverse(leaders);
        return leaders;  


    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        // Calling the leaders function
        ArrayList<Integer> result = leaders(n, arr);

        // Printing the result
        System.out.println("Leaders in the array are: " + result);
    }
}