import java.util.*;
public class SearchElement{

    public static int SearchNo(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Array Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //element to search
        System.out.print("Element to search:");
        int x = sc.nextInt(n);
        System.out.println(SearchNo(arr, n, x));
    }

}