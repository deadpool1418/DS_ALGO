class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n:nums) {
            if(map.get(n) != null) return true;
            else map.put(n,1);
        }
        return false;
    }
}