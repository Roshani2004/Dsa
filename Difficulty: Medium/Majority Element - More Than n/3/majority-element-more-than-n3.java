class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>arr.length/3 && !l.contains(arr[i])){
                l.add(arr[i]);
            }
        }
        Collections.sort(l);
        return l;
    }
}