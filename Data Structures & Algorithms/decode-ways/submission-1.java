class Solution {
    public int numDecodings(String s) {
    // return decode(s,0,s.length());
        int n=s.length();
        int[] memo=new int[n];
        Arrays.fill(memo,-1);
        return decode(s,0,s.length(),memo);
        
    }
    public int decode(String s,int i,int n,int[] memo){
        if(i==n)return 1;
        if(s.charAt(i)=='0')return 0;
        if(memo[i]!=-1)return memo[i];

        int take_first_char=decode(s,i+1,n,memo);
        int take_first_and_second_char=0;
        if(i+1<n){
            if(s.charAt(i)=='1'||(s.charAt(i)=='2'&&s.charAt(i+1)<='6'))
                take_first_and_second_char=decode(s,i+2,n,memo);
        }
        return memo[i]=take_first_and_second_char+take_first_char;

    
    }
}
