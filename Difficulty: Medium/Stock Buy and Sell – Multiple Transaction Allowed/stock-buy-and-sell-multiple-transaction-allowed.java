class Solution {
    public int maxProfit(int prices[]) {
        // code here
        int res=0;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-prices[i-1];
            if(profit>0){
                res+=profit;
            }
        }
        return res;
    }
}