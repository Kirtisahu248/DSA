import java.util.*;
public class MajorityElement{
    static int majority(int a[], int size)
    {
        Arrays.sort(a);
        int candidate = a[size / 2];
        
        int count = 0;
        for(int i = 0; i < size; i++){
            if(a[i] == candidate){
                count++;
            }
        }
        
        if(count > size / 2){
            return candidate;
        } else {
            return -1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
             
            System.out.println(majority(arr, n)); 
        }
    }
}