class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>  left=new Stack<>();
        Stack<Integer>  star=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')left.add(i);
            else if(s.charAt(i)=='*')star.add(i);
            else if(s.charAt(i)==')'){
                if(left.isEmpty()&&star.isEmpty())return false;
                if(!left.isEmpty()){
                    left.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
            }
        }
        if(left.isEmpty())return true;
        while(!left.isEmpty()&&!star.isEmpty()){
            int l=left.pop();
            int r=star.pop();
            if(l>r)return false;
        }
        if(left.isEmpty())return true;
        return false;
        
    }
}
