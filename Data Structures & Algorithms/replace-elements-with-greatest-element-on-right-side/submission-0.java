class Solution {
    public int[] replaceElements(int[] a) {
        int max=-1;
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            int curr=a[i];
            a[i]=max;
            if(curr>max){
                max=curr;
            }
        }
        return a;
    }
}