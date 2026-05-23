class Solution {
    public boolean checkInclusion(String s1, String s2) {
        

        int n1=s1.length();
        int n2=s2.length();
        if(n2<n1){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n1;i++){
            char c=s1.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> window=new HashMap<>();
        int l=0;
        int r=0;
        for(int i=0;i<n1;i++){
            char c=s2.charAt(i);
            window.put(c,window.getOrDefault(c,0)+1);
            r++;
        }
        if(map.equals(window)){
            return true;
        }
        while(r<n2){
            char c =s2.charAt(r);
            window.put(s2.charAt(l),window.get(s2.charAt(l))-1);
            if(window.get(s2.charAt(l))==0) window.remove(s2.charAt(l));
            window.put(c,window.getOrDefault(c,0)+1);
            if(map.equals(window)){
                return true;
            }
            l++;
            r++;
        }
        return false;
}
}
