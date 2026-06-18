class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> res=new ArrayList<>();
        long val=1;
        res.add(1);
        for(int k=1;k<=n;k++){
            val=val*(n-k+1)/k;
            res.add((int) val);
        }
        return res;
    }
}