class Solution {
    public int removeElement(int[] a, int val) {
        int i=0,n=a.length;
        while(i<n){
            if(a[i]==val){
                a[i]=a[n-1];
                n--;
            }
            else i++;
        }
        return n;
    }
}