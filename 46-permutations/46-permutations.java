class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums, ans);
        return ans;
    }
    
    public void recurPermute(int ind, int nums[], List<List<Integer>> ans) {
        if(ind == nums.length) {
            ArrayList<Integer> ds = new ArrayList<>();
            for(int i: nums) ds.add(i);
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind; i<nums.length; i++) {
            swap(i, ind, nums);
            recurPermute(ind+1, nums, ans);
            swap(i, ind, nums);
        }
        
    }
    
    public void swap(int i, int j, int nums[]) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}