class Solution {
    public int numDecodings(String s) {
        return decode(s,0,s.length());
        
    }
    public int decode(String s,int i,int n){
        if(i==n)return 1;
        if(s.charAt(i)=='0')return 0;

        int take_first_char=decode(s,i+1,n);
        int take_first_and_second_char=0;
        if(i+1<n){
            if(s.charAt(i)=='1'||(s.charAt(i)=='2'&&s.charAt(i+1)<='6'))
                take_first_and_second_char=decode(s,i+2,n);
        }
        return take_first_and_second_char+take_first_char;

    
    }
}
