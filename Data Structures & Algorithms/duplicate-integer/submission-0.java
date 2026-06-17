class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int num : nums){
            if(!s.add(num)){
                return true;
            }
        }
        return false;
    }
}