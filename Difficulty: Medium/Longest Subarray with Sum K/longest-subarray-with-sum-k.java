// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int l=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                l=i+1;
            }
            if(map.containsKey(sum-k)){
                l=Math.max(l,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return l;
    }
}
