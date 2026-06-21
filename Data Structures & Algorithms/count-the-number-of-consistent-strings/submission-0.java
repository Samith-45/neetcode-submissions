class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] a=new boolean[26];
        for(char ch : allowed.toCharArray()){
            a[ch-'a']=true;
        }
        int count=0;
        for(String word : words){
            boolean c=true;
            for(char ch : word.toCharArray()){
                if(!a[ch-'a']){
                    c=false;
                    break;
                }
            }
            if(c) count++;
        }
        return count;
    }
}