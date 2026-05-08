class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        int ans[]=new int[n];
        int index=0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])==2){
                ans[index++]=arr[i];
                if(index==2) break;
                
            }
        }
        return ans;
    }
}