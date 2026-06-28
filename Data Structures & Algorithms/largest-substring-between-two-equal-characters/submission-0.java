class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] a=new int[26];
        Arrays.fill(a,-1);
        int res=-1;
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            if(a[c]==-1){
                a[c]=i;
            }
            else{
                res=Math.max(res,i-a[c]-1);
            }
        }
        return res;
    }
}