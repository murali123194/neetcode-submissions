class Solution {
    public List<Integer> partitionLabels(String s) {
        int n=s.length();
        List<Integer> ans=new ArrayList<>();
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(s.charAt(i),i);
        }
        for(int i=0;i<n;){
            int lastIndex=m.get(s.charAt(i));
            // Set<Character> set=new HashSet<>();
            // set.add(s.charAt(i));
            int j=i+1;
            for(j=i+1;j<=lastIndex;j++){
                // if(set.contains(s.charAt(j)))continue;
                int lIndex=m.get(s.charAt(j));
                if(lIndex>lastIndex){
                    lastIndex=lIndex;
                }
                // set.add(s.charAt(j));
            }
            ans.add(lastIndex-i+1);
            i=j;
        }
        return ans;
        
        
    }
}
