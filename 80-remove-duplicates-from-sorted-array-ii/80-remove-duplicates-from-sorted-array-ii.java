class Solution {
    public int removeDuplicates(int[] nums) {
        
        int last = nums[nums.length-1];
        if(nums[0] == last) return 2;
        int no=nums[0],c=0,count=0, len = nums.length;
        for(int i=0; i<nums.length;i++) {
            if(no == nums[i]) {
                c++;
                if(c > 2) {
                    count ++;
                    swap(nums,i);
                    if(no == nums[len-count-1]) return i;
                    i--;
                }
                
                
            }
            else {
                no = nums[i];
                c = 1;
            }
            if(i < nums.length-1 && nums[i] > nums[i+1]) break;
            
        }
        return nums.length-count;
    }
    
    public void swap(int[] nums, int i) {
        for(;i<nums.length-1;i++) {
            int t = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = t;
        }
    }
}