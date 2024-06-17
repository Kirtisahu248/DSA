import java.util.*;
public class ValueEqualtoIndex{
    public static ArrayList<Integer> valEqToIndxValue(int arr[],int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] == i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(valEqToIndxValue(arr,n));
    }
}