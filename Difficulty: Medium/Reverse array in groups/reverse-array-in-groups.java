class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        for(int i=0;i<arr.length;i+=k){
            int j=i;
            int end=Math.min(i+k-1,arr.length-1);
            while(j<end){
                int temp=arr[j];
                arr[j]=arr[end];
                arr[end]=temp;
                j++;
                end--;
            }
        }
    }
}