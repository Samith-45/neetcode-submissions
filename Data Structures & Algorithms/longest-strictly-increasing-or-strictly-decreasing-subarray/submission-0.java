class Solution {
    public int longestMonotonicSubarray(int[] a) {
        int n=a.length;
        int inc=1,dec=1,res=1;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                inc++;
                dec=1;
            }
            else if(a[i]<a[i-1]){
                dec++;
                inc=1;
            }
            else{
                inc=1;
                dec=1;
            }
            res=Math.max(res,Math.max(inc,dec));
        }
        return res;
    }
}