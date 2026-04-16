class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            l.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            l.add(b[i]);
        }
        Collections.sort(l);
        for(int i=0;i<a.length;i++){
            a[i]=l.get(i);
        }
        for(int i=0;i<b.length;i++){
            b[i]=l.get(i+a.length);
        }
    }
}
