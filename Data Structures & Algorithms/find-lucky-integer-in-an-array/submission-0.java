class Solution {
    public int findLucky(int[] arr) {
        int[] f=new int[501];
        for(int i : arr){
            f[i]++;
        }
        int res=-1;
        for(int v=1;v<=500;v++){
            if(f[v]==v) res=v;
        }
        return res;
    }
}