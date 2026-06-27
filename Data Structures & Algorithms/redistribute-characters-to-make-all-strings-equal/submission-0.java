class Solution {
    public boolean makeEqual(String[] s) {
        int n=s.length;
        int[] count=new int[26];
        for(String w : s){
            for(int i=0;i<w.length();i++){
                count[w.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(count[i]%n!=0){
                return false;
            }
        }
        return true;
    }
}