import java.util.*;
public class IndxofExtraele{
    public static int findExtra(int n,int arr1[],int arr2[]){
        //use binary search
        int low = 0, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr1[mid] == arr2[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n-1];

        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        for(int j=0;j<n-1;j++){
            arr2[j] = sc.nextInt();
        }
        System.out.println(findExtra(n, arr1, arr2));
    }
}