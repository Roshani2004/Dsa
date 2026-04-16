class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> l = new ArrayList<>();

        int left = 0, right = mat[0].length - 1;
        int top = 0, bottom = mat.length - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                l.add(mat[top][i]);
            }
            top++;
            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    l.add(mat[i][right]);
                }
                right--;
            }
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    l.add(mat[bottom][i]);
                }
                bottom--;
            }
            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    l.add(mat[i][left]);
                }
                left++;
            }
        }

        return l;
    }
}