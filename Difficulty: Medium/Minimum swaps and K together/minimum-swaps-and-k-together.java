// User function Template for Java

class Solution {
    // Function for finding maximum and value pair
    int minSwap(int[] arr, int k) {
        // Complete the function
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                count++;
            }
        }
        int bad=0;
        for(int i=0;i<count;i++){
            if(arr[i]>k){
                bad++;
            }
        }
        int ans=bad;
        int left=0;
        for(int right=count;right<arr.length;right++){
            if(arr[left]>k){
                bad--;
            }
            if(arr[right]>k){
                bad++;
            }
            ans=Math.min(ans,bad);
            left++;
        }
        return ans;
    }
}
