class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n=arr.length;
        int prev2=arr[0];
        int prev1=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            int curr=Math.max(prev1,arr[i]+prev2);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}