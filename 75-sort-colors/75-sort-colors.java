class Solution {
    public void sortColors(int[] nums) {
       int low = 0, mid = 0, high = nums.length-1;
       while(mid <= high) {
           if(nums[mid] == 0) {
               swap(nums, mid, low);
               mid++;
               low++;
           }
           else if(nums[mid] == 1) 
               mid++;
           else {
               swap(nums, mid, high);
               high--;
           }
       } 
    }
    
    public void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}