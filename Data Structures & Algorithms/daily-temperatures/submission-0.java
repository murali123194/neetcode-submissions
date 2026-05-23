class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        for(int i=0;i<n-1;i++){
            int count=0;
            int j;
            for(j=i+1;j<n;j++){
                if(temperatures[j]>temperatures[i]){
                    count=1;
                    break;
                }
                
            }
            if(count==1)ans[i]=j-i;
            else ans[i]=0;

        }
        ans[n-1]=0;
        return ans;
        
    }
}
