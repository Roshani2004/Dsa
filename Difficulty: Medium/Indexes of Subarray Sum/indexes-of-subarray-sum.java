
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int start=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while(sum>target){
                sum-=arr[start];
                start++;
            }
            if(sum==target){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(start+1);
                list.add(i+1);
                return list;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-1);
        return list;
    }
}
