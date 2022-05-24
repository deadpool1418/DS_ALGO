class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        if(nums == null || nums.length == 0) return res;
        
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i=0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                int target_2 = target - nums[i] - nums[j];
                int front = j + 1;
                int back = n - 1;
                
                while(front < back) {
                    int two_sum = nums[front] + nums[back];
                    if(two_sum > target_2) back -= 1;
                    else if(two_sum < target_2) front += 1;
                    else{
                        List<Integer> quad = new ArrayList<Integer>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        res.add(quad);
                        while(front < back && nums[front] == quad.get(2)) front += 1;
                        while(front < back && nums[back] == quad.get(3)) back -= 1;
                    }
                }
                
                while(j + 1 < n && nums[j + 1] == nums[j]) ++j;
            }
            while(i + 1 < n && nums[i + 1] == nums[i]) ++i;
        }
        
        return res;
    }
}