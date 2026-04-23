class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int min=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   min=arr[j];
                   break;
                }
            }
            l.add(min);
        }
        return l;
    }
}