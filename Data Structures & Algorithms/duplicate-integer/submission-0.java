class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int freq:map.values()){
            if(freq>1){
                return true;
            }
        }
        return false;
        
    }
}