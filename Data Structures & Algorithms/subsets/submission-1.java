class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new LinkedList<>();
        List<Integer> ds=new ArrayList<>();
        backTrack(0,nums,list,ds);
        return list;
        
    }
    public void backTrack(int idx,int[] nums,List<List<Integer>> list,List<Integer> ds){
        if(idx==nums.length){
            list.add(new ArrayList<>(ds));
            
            
            return;
        }
        // Take 
        ds.add(nums[idx]);
        backTrack(idx+1,nums,list,ds);

        // Undo
        ds.remove(ds.size()-1);
        backTrack(idx+1,nums,list,ds);

    }
}
