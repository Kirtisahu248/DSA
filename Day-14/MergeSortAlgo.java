import java.util.*;
public class MergeSortAlgo{
    public static void merge(int arr[],int low,int mid,int high){
       ArrayList<Integer> temp = new ArrayList<>();  //temporary array
       int left = low;
       int right = mid+1;

       while (left<=mid && right<=high) {
         if( arr[left] < arr[right] ){
            temp.add(arr[left]);
            left++;
         }else{
            temp.add(arr[right]);
            right++;
         }
       }

       //if right part is exhausted copy the left element
       while (left<=mid) {
        temp.add(arr[left]);
        left++;
       }

       //if left part is exhausted copy the right element
       while(right<=high){
        temp.add(arr[right]);
        right++;
       }

       //transferring all elements from temp to arr
       for(int i=low;i<=high;i++){
        arr[i] = temp.get(i-low);
       }
    }

    public static void mergeSort(int arr[],int low,int high){
        //base case
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;

        mergeSort(arr, low, mid);        //left half
        mergeSort(arr, mid+1, high);     //right half
        merge(arr, low, mid, high);     //merge the halves
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array:");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Elements of array:");

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = N-1;
       merge(arr, low, low, high);
       for(int i=0;i<N;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }
}