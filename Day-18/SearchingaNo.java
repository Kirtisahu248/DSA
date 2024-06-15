import java.util.*;
public class SearchingaNo{
    static int search(int n,int k,int arr[]){
        for(int i=0;i<n;i++){
            if(arr[i] == k){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 7;
        int k = 98;
        int arr[] = {1,22,57,47,34,18,66};
        System.out.println(search(n, k, arr));
    }
}