class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int num1=Integer.MIN_VALUE,num2=Integer.MIN_VALUE,c1=0,c2=0;
        //Calculate num1 and num2 which occrus majority times in array
        for(int el: nums) {
            if(el == num1) c1++;
            else if(el == num2) c2++;
            else if(c1 == 0) {
                num1 = el;
                c1 = 1;
            }
            else if(c2==0){
                num2 = el;
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }
        //count 
        c1=0;c2=0;
        for(int no: nums) {
            if(no == num1) c1++;
            if(no == num2) c2++;
        }
        if(c1 > nums.length/3) res.add(num1);
        if(c2 > nums.length/3) res.add(num2);
        return res;
    }
}