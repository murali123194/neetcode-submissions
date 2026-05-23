class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        backTrack(0,target,nums,list,ds);
        return list;
        
    }
    public void backTrack(int idx,int target,int[] nums,List<List<Integer>> list,List<Integer> ds){
        if(target==0){
            
            if(!list.contains(ds)){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(target<0)return;
        for(int i=idx;i<nums.length;i++){
            // TAKE
            ds.add(nums[i]);
            backTrack(i,target-nums[i],nums,list,ds);
            ds.remove(ds.size()-1);

            

        }
    }
}
