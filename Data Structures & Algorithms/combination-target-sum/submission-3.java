class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        backTrack(0,target,nums,list,ds);
        return list;
        
    }
    public void backTrack(int idx,int target,int[] nums,List<List<Integer>> list,List<Integer> ds){
        
        if(target==0){
            List<Integer> temp=new ArrayList<>(ds);
            Collections.sort(temp);

            if(!list.contains(temp)){

                list.add(new ArrayList<>(temp));
            }
            return;
        }
        if(idx>=nums.length)return;
        if(target<0)return;
        for(int i=0;i<nums.length;i++){
            // TAKE
            ds.add(nums[i]);
            backTrack(i,target-nums[i],nums,list,ds);
            ds.remove(ds.size()-1);

            

        }
        // ds.add(nums[idx]);
        // backTrack(idx,target-nums[idx],nums,list,ds);
        // ds.remove(ds.size()-1);
        // backTrack(idx+1,target,nums,list,ds);

    }
}
