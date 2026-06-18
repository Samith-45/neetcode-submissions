class Solution {
    public String kthDistinct(String[] a, int k) {
        Map<String,Integer> m=new HashMap<>();
        for(String s : a){
            m.put(s,m.getOrDefault(s,0)+1);
        }
        for(String s : a){
            if(m.get(s)==1){
                k--;
                if(k==0) return s;
            }
        }
        return "";
    }
}