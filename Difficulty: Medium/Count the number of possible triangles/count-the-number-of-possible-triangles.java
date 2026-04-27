// class Solution {
//     public int countTriangles(int arr[]) {
//         // code here
//         int count=0;
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length-2;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 for(int k=j+1;k<arr.length;k++){
//                   if((arr[i]+arr[j])>arr[k]){
//                         count++;
//                     }   
//                 }
//             }
//         }
//         return count;
//     }
// }
// ---time complexity :O(n^2)------by reducing time complexity----
class Solution{
    public int countTriangles(int arr[]){
        int count=0;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=2;i--){
            int left=0;
            int right=i-1;
            while(left<right){
                if((arr[left]+arr[right])>arr[i]){
                    count+=(right-left);
                    right--;
                }else{
                    left++;
                }
            }
        }
        return count;
    }
}