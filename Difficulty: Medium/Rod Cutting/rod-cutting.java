class Solution {
    public int cutRod(int[] price) {
        // code here
        int n=price.length;
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int max=0;
            for(int j=0;j<i;j++){
                max=Math.max(max,price[j]+dp[i-j-1]);
            }
            dp[i]=max;
        }
        return dp[n];
    }
}