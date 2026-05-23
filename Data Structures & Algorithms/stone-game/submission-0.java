class Solution {
    public boolean stoneGame(int[] piles) {
        return rec(0,0,0,piles.length-1,piles,1);

        
    }
    private boolean rec(int start,int A,int B,int end,int[] piles,int chance){
        if(start>end){
            if(A>B)return true;
        }
        boolean bool=false;
        if(chance==1){
            bool=rec(start+1,A+piles[start],B,end,piles,0)||rec(start,A+piles[end],B,end-1,piles,0);
        }

        if(chance==0){
            bool=rec(start,A,B+piles[start],end,piles,1)||rec(start,A,B+piles[end],end-1,piles,1);
        }
        return bool;
    }
}