class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        // 
        // int[] ans=new int[nums.length];
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // int idx=0;
        
        if(nums.length==0){
            return new int[]{};
        }
        // return ans.stream().mapToInt(Integer::intValue).toArray();
        map.entrySet()
   .stream()
   .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
   .forEach(entry -> 
       list.add(entry.getKey()));
       int[] ans=new int[k];
       for(int i=0;i<k;i++){
        ans[i]=list.get(i);
       }
       return ans;

        
        
    }
}
