class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        // corresponding vaues of triplets <=target
        // 
        int[] best={0,0,0};
        for(int[] triplet:triplets){
            int t1=triplet[0];
            int t2=triplet[1];
            int t3=triplet[2];
            if(t1>target[0] || t2>target[1] || t3>target[2])continue;
            best[0]=Math.max(t1,best[0]);
            best[1]=Math.max(t2,best[1]);
            best[2]=Math.max(t3,best[2]);

        }
        if(best[0]==target[0] &&
        best[1]==target[1] &&
        best[2]==target[2])return true;
        return false;
        
    }
}
