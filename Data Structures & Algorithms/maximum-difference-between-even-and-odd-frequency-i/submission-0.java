class Solution {
    public int maxDifference(String s) {
        int[] f=new int[26];
        for(char ch : s.toCharArray()){
            f[ch-'a']++;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i : f){
            if(i==0) continue;
            if(i%2==1) max=Math.max(max,i);
            else min=Math.min(min,i);
        }
        return max-min;
    }
}