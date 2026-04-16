class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int smallest=1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == smallest) {
                smallest++;
            }
        }
        return smallest;
    }
}
