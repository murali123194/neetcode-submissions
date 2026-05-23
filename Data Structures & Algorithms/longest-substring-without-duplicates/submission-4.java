class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        Set<Character> set=new HashSet<>();
        int len=0;
        while(right<s.length()){
            char c =s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            len=Math.max(len,right-left+1);
            set.add(c);
            
            right++;
            
        }
        return len;

        
        
    }
}
