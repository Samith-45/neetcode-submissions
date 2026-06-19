class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] f=new int[501];
        for(int i : nums){
            f[i]++;
        }
        int res=0;
        for(int i : f){
            res+=i*(i-1)/2;
        }
        return res;
    }
}