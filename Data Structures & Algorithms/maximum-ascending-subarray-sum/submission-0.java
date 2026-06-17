class Solution {
    public int maxAscendingSum(int[] a) {
        int n=a.length;
        int curr=a[0];
        int max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                curr+=a[i];
            }
            else{
                curr=a[i];
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}