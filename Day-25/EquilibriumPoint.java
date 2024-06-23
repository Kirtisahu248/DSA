public class EquilibriumPoint{
    public static int equilibriumPoint(long arr[], int n) {
        // Your code here
        if (n == 1) {
            return 1; // If there's only one element, it's the equilibrium point.
        }

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        long leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i]; // totalSum now represents the right sum for index i

            if (leftSum == totalSum) {
                return i + 1; // +1 for 1-based index
            }

            leftSum += arr[i];
        }

        return -1; // No equilibrium point found
    }
    public static void main(String[] args) {
        // Test case
        long[] arr = {1, 3, 5, 2, 2};
        int n = arr.length;

        // Call the equilibriumPoint method and print the result
        int equilibriumIndex = equilibriumPoint(arr, n);
        System.out.println("Equilibrium point index: " + equilibriumIndex);
    }
}