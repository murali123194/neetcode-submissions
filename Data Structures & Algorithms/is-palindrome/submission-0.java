class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if((c>='A'&&c<='z')||(c>='0'&&c<='9'))sb.append(Character.toLowerCase(c));
            
        }
        int r=sb.length()-1;
        int l=0;
        while(l<r){
            if(sb.charAt(l)!=sb.charAt(r))return false;
            l++;
            r--;
        }
        return true;

    }
}
