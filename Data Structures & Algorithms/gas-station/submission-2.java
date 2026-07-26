class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // sum of gas >=sum of cost
        // then try for the segment ,if that segement tends to negative ,then skip those elements as the startingpoint 
        int gasSum=0;
        int costSum=0;
        int n=gas.length;
        for(int i=0;i<n;i++){
            gasSum+=gas[i];
            costSum+=cost[i];
        }
        if(costSum>gasSum)return -1;
        int idx=0;
        
        for(int i=0;i<n;i++){
            // int tank=-
            int tank=gas[i]-cost[i];
            if(tank<0)continue;
            for(int j=(i+1)%n;j<n;j++){
                tank+=(gas[j]-cost[j]);
                if(tank<0) break;
            }

            if(tank>=0)return i;

            


        }
        return -1;

        
    }
    
}
