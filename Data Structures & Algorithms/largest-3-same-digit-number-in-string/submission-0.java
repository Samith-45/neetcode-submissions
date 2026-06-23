class Solution {
    public String largestGoodInteger(String s) {
        String ans="";
        for(int i=0;i<=s.length()-3;i++){
            char ch=s.charAt(i);
            if(ch==s.charAt(i+1) && ch==s.charAt(i+2)){
                String curr=s.substring(i,i+3);
                if(curr.compareTo(ans)>0){
                    ans=curr;
                }
            }
        }
        return ans;
    }
}