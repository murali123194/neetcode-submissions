class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ds =new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        backTrack(0,used,ds,list,nums);
        return list;
        
    }
    public void backTrack(int idx,boolean[] used,List<Integer> ds,List<List<Integer>> list,int[] nums){
        if(ds.size()==nums.length){
            list.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            used[i]=true;
            ds.add(nums[i]);
            backTrack(i+1,used,ds,list,nums);
            ds.remove(ds.size()-1);
            used[i]=false;
        }
    }
}
