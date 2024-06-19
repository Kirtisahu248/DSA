public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int arr[], int n) {
        // code here
        long[] ans = new long[n];
        long[] left = new long[n];
        long[] right = new long[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }
        right[n - 1] = 1;
        for (int i = n - 2; i > -1; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        int n = arr.length;
        
        long[] result = productExceptSelf(arr, n);
        
        // Print the result
        for (long value : result) {
            System.out.print(value + " ");
        }
    }
}