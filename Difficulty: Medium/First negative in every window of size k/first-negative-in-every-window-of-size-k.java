class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> q =new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                q.add(i);
            }
            if(i>=k-1){
                while(!q.isEmpty() && q.peek()<=i-k){
                    q.poll();
                }
                if(q.isEmpty()){
                    res.add(0);
                }else{
                    res.add(arr[q.peek()]);
                }
            }
        }
        return res;
    }
}