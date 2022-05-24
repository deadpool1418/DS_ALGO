class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<Integer>();
        for(int n: nums) {
            map.add(n);
        }
        int len = 0;
        for(int n: nums) {
            if(!map.contains(n-1)) {
                int t = n;
                int count = 0;
                while(map.contains(t)) {
                    count += 1;
                    t += 1;
                }
                if(len < count) len = count;
            }
        }
        return len;
    }
}