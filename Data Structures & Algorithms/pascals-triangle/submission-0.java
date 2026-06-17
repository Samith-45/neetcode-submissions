class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                List<Integer> prev=res.get(i-1);
                row.add(prev.get(j-1)+prev.get(j));
            }
            if(i>0) row.add(1);
            res.add(row);
        }
        return res;
    }
}