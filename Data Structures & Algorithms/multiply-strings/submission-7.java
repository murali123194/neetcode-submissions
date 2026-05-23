class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder s1=new StringBuilder(num1);
        StringBuilder s2 =new StringBuilder(num2);
        StringBuilder res=new StringBuilder();
        if(num1.equals("0")||num2.equals("0"))return "0";
        // int[] ans=new int[];
        s1.reverse();
        s2.reverse();
        int n1=s1.length();
        int n2=s2.length();
        int[] ans=new int[n1+n2];

        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                int digit=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
                ans[i+j]+=digit;
                ans[i+j+1]+=ans[i+j]/10;
                ans[i+j]=ans[i+j]%10;            }
        }

        int i = ans.length - 1;
        while (i >= 0 && ans[i] == 0) {
            i--;
        }
        while (i >= 0) {
            res.append(ans[i--]);
        }
        return res.toString();
        
    }
}
