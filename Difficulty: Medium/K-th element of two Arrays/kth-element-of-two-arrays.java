class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int x:a) l.add(x);
        for(int y:b) l.add(y);
        Collections.sort(l);
        
        return l.get(k-1);
    }
}