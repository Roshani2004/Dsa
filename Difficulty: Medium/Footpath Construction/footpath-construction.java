class Solution {
    public int[] createFootpath(int n, int m, int a[][], int q, int queries[][]) {

        int[][] topLeft = new int[n][m];
        int[][] topRight = new int[n][m];
        int[][] bottomLeft = new int[n][m];
        int[][] bottomRight = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                topLeft[i][j] = a[i][j];
                if (i > 0) topLeft[i][j] = Math.min(topLeft[i][j], topLeft[i-1][j]);
                if (j > 0) topLeft[i][j] = Math.min(topLeft[i][j], topLeft[i][j-1]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                topRight[i][j] = a[i][j];
                if (i > 0) topRight[i][j] = Math.min(topRight[i][j], topRight[i-1][j]);
                if (j < m - 1) topRight[i][j] = Math.min(topRight[i][j], topRight[i][j+1]);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                bottomLeft[i][j] = a[i][j];
                if (i < n - 1) bottomLeft[i][j] = Math.min(bottomLeft[i][j], bottomLeft[i+1][j]);
                if (j > 0) bottomLeft[i][j] = Math.min(bottomLeft[i][j], bottomLeft[i][j-1]);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                bottomRight[i][j] = a[i][j];
                if (i < n - 1) bottomRight[i][j] = Math.min(bottomRight[i][j], bottomRight[i+1][j]);
                if (j < m - 1) bottomRight[i][j] = Math.min(bottomRight[i][j], bottomRight[i][j+1]);
            }
        }

        int[] result = new int[q];

        for (int x = 0; x < q; x++) {
            int R = queries[x][0];
            int C = queries[x][1];

            int cost = 0;

            if (R - 2 >= 0 && C - 2 >= 0)
                cost += topLeft[R-2][C-2];

            if (R - 2 >= 0 && C < m)
                cost += topRight[R-2][C];
                
            if (R < n && C - 2 >= 0)
                cost += bottomLeft[R][C-2];

            if (R < n && C < m)
                cost += bottomRight[R][C];

            result[x] = cost;
        }

        return result;
    }
}