class Solution {
    
    public void function(int ind, List<Integer> subset, int N, int[] nums, List<List<Integer>> powerset) {
        if(ind == N) {
            powerset.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[ind]);
        function(ind+1, subset, N, nums, powerset);
        
        subset.remove(Integer.valueOf(nums[ind]));
        function(ind+1, subset, N, nums, powerset);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerset = new ArrayList<List<Integer>>();
        function(0,new ArrayList<Integer>(), nums.length, nums, powerset);
        return powerset;
    }
}