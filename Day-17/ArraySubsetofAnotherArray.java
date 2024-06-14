import java.util.HashMap;

public class ArraySubsetofAnotherArray {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> map = new HashMap<>();

        // Fill the hashmap with elements of a1 and their counts
        for (int i = 0; i < n; i++) {
            map.put(a1[i], map.getOrDefault(a1[i], 0) + 1);
        }

        // Check if all elements of a2 are in the hashmap with sufficient count
        for (int i = 0; i < m; i++) {
            if (!map.containsKey(a2[i]) || map.get(a2[i]) == 0) {
                return "No";
            }
            map.put(a2[i], map.get(a2[i]) - 1);
        }
        return "Yes"; 
    }
    public static void main(String[] args) {
        ArraySubsetofAnotherArray arraySubset = new ArraySubsetofAnotherArray();

        long[] a1 = {11, 1, 13, 21, 3, 7};
        long[] a2 = {11, 3, 7, 1};

        long n = a1.length;
        long m = a2.length;

        String result = arraySubset.isSubset(a1, a2, n, m);
        System.out.println("Is a2 a subset of a1? " + result);

    }
}
