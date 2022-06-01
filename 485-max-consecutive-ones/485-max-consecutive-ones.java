class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int j=0; j<nums.length; j++) {
            if(nums[j] == 1) {
                count += 1;
            }
            else{
                count = 0;
            }
            
            max = Math.max(count, max);
        }
        return max;
    }
}