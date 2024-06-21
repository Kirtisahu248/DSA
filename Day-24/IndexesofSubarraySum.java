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
}