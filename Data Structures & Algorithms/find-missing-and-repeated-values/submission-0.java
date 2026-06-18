class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long N = (long) n * n;

        long sumActual = 0, sumSqActual = 0;
        for (int[] row : grid)
            for (int val : row) {
                sumActual += val;
                sumSqActual += (long) val * val;
            }

        long sumExpected   = N * (N + 1) / 2;
        long sumSqExpected = N * (N + 1) * (2 * N + 1) / 6;

        long diff    = sumActual - sumExpected;       
        long diffSq  = sumSqActual - sumSqExpected;   

        long sumAB   = diffSq / diff;                 

        int a = (int) ((diff + sumAB) / 2);
        int b = (int) ((sumAB - diff) / 2);

        return new int[]{a, b};
    }
}