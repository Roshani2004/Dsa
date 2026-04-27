// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Integer temp[]=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp,(a,b) -> {
            if(map.get(a).equals(map.get(b))){
                return a-b;
            }else{
                return map.get(b)-map.get(a);
            }
        });
        ArrayList<Integer> l=new ArrayList<>();
        for(int x:temp){
            l.add(x);
        }
        return l;
    }
}