class Solution {
    public int minJumps(int[] arr) {
        // code here
        int n=arr.length;
        if(arr[0]==0){
            return -1;
        }
        if(n<=1){
            return 0;
        }
        int jumps=1;
        int steps=arr[0];
        int max=arr[0];
        
        for(int i=1;i<n;i++){
            if(i==n-1){
                return jumps;
            }
            max=Math.max(max,i+arr[i]);
            steps--;
            if(steps==0){
                jumps++;
                if(i>=max){
                    return -1;
                }
                steps = max - i;
            }
        }
        return -1;
        }
}