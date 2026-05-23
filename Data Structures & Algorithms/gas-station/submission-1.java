class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;

        for(int i=0;i<n;i++){
            int tank=0;
            if(tank+gas[i]<cost[i])continue;
            else tank+=gas[i];
            tank-=cost[i];
            int j=(i+1)%n;
            int m=n;
            while(m>0){
                if(tank+gas[j]<cost[j])break;
                else {
                    tank+=gas[j];
                    tank-=cost[j];
                }
                j=(j+1)%n;
                m--;
            }
            if(m==0)return  i;
        }
        return -1;

        
    }
    
}
