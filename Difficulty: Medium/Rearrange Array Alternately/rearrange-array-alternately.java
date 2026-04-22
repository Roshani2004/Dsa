class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int ans[]=new int[n];
        int small=0,large=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=arr[large--];
            }else{
                ans[i]=arr[small++];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }
}
