// User function Template for Java

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        int start=0,ans_end=-1,ans_start=-1,max=0,cur=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                cur+=arr[i];
                if(cur>max || cur==max && (i-start>ans_end-ans_start)){
                    max=cur;
                    ans_start=start;
                    ans_end=i;
                }
            }else{
                    start=i+1;
                    cur=0;
            }
        }
        if(ans_start==-1){
                res.add(-1);
                return res;
            }
            for(int i=ans_start;i<=ans_end;i++){
                res.add(arr[i]);
            }
        return res;
    }
}