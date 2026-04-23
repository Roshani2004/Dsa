// import java.math.BigInteger;
// class Solution {
//     String minSum(int[] arr) {
//         // code here
//         StringBuilder a=new StringBuilder();
//         StringBuilder b=new StringBuilder();
//         Arrays.sort(arr);
//         for(int i=0;i<arr.length;i++){
//             if(i%2==0){
//                 a.append(arr[i]);
//             }else{
//                 b.append(arr[i]);
//             }
//         }
//         BigInteger n1=new BigInteger(a.length()==0?"0":a.toString());
//         BigInteger n2=new BigInteger(b.length()==0?"0":b.toString());
//         return n1.add(n2).toString();
//     }
// }
import java.util.*;

class Solution {
    String minSum(int[] arr) {
        Arrays.sort(arr);

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) a.append(arr[i]);
            else b.append(arr[i]);
        }

        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while(i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';

            res.append(sum % 10);
            carry = sum / 10;
        }

        while(res.length() > 1 && res.charAt(res.length()-1) == '0') {
            res.deleteCharAt(res.length()-1);
        }

        return res.reverse().toString();
    }
}