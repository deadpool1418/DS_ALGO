class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int len = 0;
        int l = 0;
        int r = 0;
        while(r < s.length()) {
            if(map.containsKey(s.charAt(r))) l = Math.max(map.get(s.charAt(r)) + 1, l);
            map.put(s.charAt(r), r);
            len = Math.max(r - l + 1, len);
            r += 1;
        }
        return len;
    }
}