class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        int n = arr.length;
        HashSet<Long> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            long sq = 1L * arr[i] * arr[i];
            arr[i] = (int)sq;
            set.add(sq);
        }

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                long sum = 1L * arr[i] + arr[j];
                if(set.contains(sum)) {
                    return true;
                }
            }
        }

        return false;
    }
}