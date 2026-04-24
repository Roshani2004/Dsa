class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        ArrayList<Integer> l =new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(k>0){
                l.add(arr[i]);
                k--;
            }
        }
        return l;
    }
}
