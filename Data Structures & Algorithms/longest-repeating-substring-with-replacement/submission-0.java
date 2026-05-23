class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        Map<Character,Integer> map=new HashMap<>();
        int max=0;
        int freq=0;
        for(int r=0;r<s.length();r++){
            char c =s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            freq=Math.max(freq,map.get(c));
            while((r-l+1)-freq>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;

            }
            max=Math.max(max,r-l+1);
            
        }
        return max;
        
    }
}
