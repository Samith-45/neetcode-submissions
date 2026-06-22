class Solution {
    public boolean canConstruct(String r, String m) {
        if(r.length()>m.length()){
            return false;
        }
        int[] f=new int[26];
        for(char ch : m.toCharArray()){
            f[ch-'a']++;
        }
        for(char ch : r.toCharArray()){
            f[ch-'a']--;
            if(f[ch-'a']<0){
                return false;
            }
        }
        return true;
    }
}