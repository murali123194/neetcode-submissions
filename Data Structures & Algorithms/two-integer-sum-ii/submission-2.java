class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int num:numbers){
            map.put(num,i);
            i++;
        }
        for(int k=0;k<numbers.length;k++){
            int diff=target-numbers[k];
            if(map.containsKey(diff)){
                return new int[]{k+1,map.get(diff)+1};
            }

        }
        return new int[]{};
        
    }
}
