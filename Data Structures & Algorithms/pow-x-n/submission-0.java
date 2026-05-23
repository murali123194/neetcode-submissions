class Solution {
    // double ans=1;
    public double myPow(double x, int n) {
        if(n==0)return 1;
        if(n<0){

            return myPow(x,n+1)*(1/x);
        }
        else {
            return myPow(x,n-1)*x;
        }


        
        
        
    }
    
}
