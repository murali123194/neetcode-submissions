class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        backTrack(0,target,candidates,list,ds);
        return list;
    }
    public void backTrack(int idx,int target,int[] nums,List<List<Integer>> list,List<Integer> ds){
        
        if(target==0){
            List<Integer> ans=new ArrayList<>(ds);
            Collections.sort(ans);
            if(!list.contains(ans)){
                list.add(new ArrayList<>(ans));
                return;
        }
        }
            
            
            
        


        
        
        if(target<0)return;
        for(int i=idx;i<nums.length;i++){
            // TAKE
            ds.add(nums[i]);
            backTrack(i+1,target-nums[i],nums,list,ds);
            ds.remove(ds.size()-1);

            

        }
    }
}
