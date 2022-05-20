class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = 0;
        for(int num: nums) {
            if(count == 0) ans = num;
            if(ans == num) count += 1;
            else count -= 1;
        }
        return ans;
    }
}