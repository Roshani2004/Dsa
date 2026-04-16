class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int sum=0;
            int left=i+1;
            int right=arr.length-1;
            while(left<right){
                sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    return true;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return false;
    }
}