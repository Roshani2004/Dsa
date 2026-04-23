class Solution {
    public int countPartitions(int[] arr, int diff) {
        // code here
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        if((sum+diff)%2!=0){
            return 0;
        }
        int target=(sum+diff)/2;
        int dp[]=new int[target+1];
        dp[0]=1;
        for(int x:arr){
            for(int j=target;j>=x;j--){
                dp[j]+=dp[j-x];
            }
        }
        return dp[target];
    }
}
