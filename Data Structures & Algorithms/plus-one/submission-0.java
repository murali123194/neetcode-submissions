class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int n=digits.length;
        if((digits[n-1]+1)>9)carry=1;
        else {
            digits[n-1]++;
            return digits;
        }
        for(int i=n-1;i>=0;i--){
            int sum=digits[i]+carry;
            if(sum>9){
                carry=1;
                digits[i]=sum%10;
            }else {
                carry=0;
                digits[i]=sum;
            }
        }
        int len=0;
        if(carry==1)len=n+1;
        else len=n;
        int[] ans =new int[len];
        if(carry==1){
            ans[0]=1;
            for(int i=1;i<len;i++)ans[i]=digits[i-1];
            return ans;
        }
        else{
            return digits;
        }
        
    }
}
