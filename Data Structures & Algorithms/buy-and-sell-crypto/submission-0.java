class Solution {
    public int maxProfit(int[] a) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i : a){
            if(i<min){
                min=i;
            }
            else if(i-min>max){
                max=i-min;
            }
        }
        return max;
    }
}
