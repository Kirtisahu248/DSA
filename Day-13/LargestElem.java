import java.util.*;;
public class LargestElem{
    public static int largest(int arr[],int n){
        int large = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largest(arr, n));
    }
}