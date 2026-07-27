class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // Freq Map and finding the min
        // then finding the min++ ,if present then reduce the freq and track the min again and 
        // iteratuvely loop
        int n=hand.length;
        if(n%groupSize!=0)return false;
        Map<Integer,Integer> map=new HashMap<>();
        // int min=Integer.MAX_VALUE;
        for(int i:hand){
            map.put(i,map.getOrDefault(i,0)+1);
            

        }
        int i=0;
        Arrays.sort(hand);
        while(i<n){
            
            int m=groupSize;
            int minWindow=hand[i];
            i++;
            if(!map.containsKey(minWindow))continue;
            while(m>0){

                if(!map.containsKey(minWindow))return false;
                else if(map.containsKey(minWindow)){
                    if(map.get(minWindow)==1)map.remove(minWindow);
                    else map.put(minWindow,map.get(minWindow)-1);
                }
                minWindow++;
                m--;
                
                

            }
            if(map.size()==0)return true;
            

        }
        return true;


        
    }
}
