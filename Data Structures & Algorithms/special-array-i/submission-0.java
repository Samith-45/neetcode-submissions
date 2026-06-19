class Solution {
    public boolean isArraySpecial(int[] a) {
        int n=a.length;
        for(int i=0;i<n-1;i++){
            if(a[i]%2==a[i+1]%2){
                return false;
            }
        }
        return true;
    }
}