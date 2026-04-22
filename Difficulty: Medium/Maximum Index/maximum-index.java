class Solution {
    int maxIndexDiff(int[] arr) {
        int maxDiff = 0;
        int n=arr.length;
        int leftmin[]=new int[n];
        int rightmax[]=new int[n];
        leftmin[0]=arr[0];
        rightmax[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            leftmin[i]=Math.min(arr[i],leftmin[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(arr[i],rightmax[i+1]);
        }
        int i=0,j=0;
        while(i<n&&j<n){
            if(leftmin[i]<=rightmax[j]){
                maxDiff=Math.max(maxDiff,j-i);
                j++;
            }else{
                i++;
            }
        }
        return maxDiff;
    }
}