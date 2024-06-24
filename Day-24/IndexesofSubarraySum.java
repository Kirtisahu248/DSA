import java.util.*;
class IndexesofSubarraySum{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
            ArrayList<Integer> ans= new ArrayList<>();
        
        int i=0,j=0;
        int sum=0;
        
        while(j<n){
            sum=sum+arr[j];
            
                while(sum>s && i<j){
                    sum=sum-arr[i];
                    i++;
                }
                
                if(sum==s ){
                    ans.add(i+1);
                    ans.add(j+1);
                    return ans;
                }
                j++;
            }
            
        if(ans.size() == 0){
        ans.add(-1);
        return ans;
    }
    return ans;
    }
    public static void main(String[] args) {
        // Initialize Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Taking array size and sum input
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the sum to find:");
        int s = sc.nextInt();

        // Taking array elements input
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call the subarraySum function
        ArrayList<Integer> result = IndexesofSubarraySum.subarraySum(arr, n, s);

        // Print the result
        if (result.size() == 1 && result.get(0) == -1) {
            System.out.println("No subarray with given sum found");
        } else {
            System.out.println("Subarray with given sum is found between indexes: " + result.get(0) + " and " + result.get(1));
        }

        // Close the scanner
        sc.close();
    }
}
