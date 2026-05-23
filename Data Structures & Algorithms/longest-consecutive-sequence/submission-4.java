class Solution {
    public int longestConsecutive(int[] nums) {
        // Sorting and then counting;
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int curr=nums[0];
        int streak=0;
        int i=0;
        
        int min=0;

        while(i<n){
            if(nums[i]!=curr){
                curr=nums[i];
                streak=0;
            }
            while(i<nums.length&&nums[i]==curr){
                i++;
            }
            curr++;
            streak++;
            min=Math.max(min,streak);
        }
        return min;
        // Map<Integer,Integer> map=new HashMap<>();
        // int max=0;
        // for(int num:nums){
        //     if(map.containsKey(num-1)){
        //         map.put(num,map.get(num-1)+1);
        //         map.remove(num-1);
                
        //     }else{
        //         map.put(num,1);
        //     }
        //     max=Math.max(max,map.get(num));
        // }
        // return max;

        
    }
}
