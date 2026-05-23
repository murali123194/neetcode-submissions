class Solution {
    public int[] productExceptSelf(int[] nums) {
        long multiply=1;
        int zeroes=0;
        int zero_index=-1;
        int n=nums.length;

        for(int i=n-1;i>=0;i--){
            if(nums[i]==0){
               
                zeroes++;
                zero_index=i;
                
            }else{
                
                multiply*=nums[i];
            }
            if(zeroes>1){
                 Arrays.fill(nums,0);
                 return nums;
            }
        }
        if(zeroes==1){
            
            Arrays.fill(nums,0);
            nums[zero_index]=(int)multiply;
            return nums;
            
        }
        for(int i=0;i<n;i++){
            nums[i]=(int)multiply/nums[i];
        }
        return nums;
            
            



    
            
        
        
    }
}  
