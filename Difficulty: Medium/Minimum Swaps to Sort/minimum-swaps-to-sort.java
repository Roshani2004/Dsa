class Solution {
    // Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[]) {
        // Code here
        int swaps=0;
        int sorted[]=arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=sorted[i]){
                swaps++;
                int current=arr[i];
                int correct=sorted[i];
                int index=map.get(correct);
                arr[i]=correct;
                arr[index]=current;
                map.put(current,index);
                map.put(correct,i);
            }
        }
        return swaps;
    }
}