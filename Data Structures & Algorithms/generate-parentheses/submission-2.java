class Solution {

    private void bT(int o,int c,int n,String s,List<String> ans){
        if(o==c&&o==n){
            ans.add(s);
            return;
        }
        if(o<n){
            // s.append("(");
            bT(o+1,c,n,s+"(",ans);
            
            
            
        }
        if(c<o){
            // s.append(")");
            bT(o,c+1,n,s+")",ans);
            // s.deleteCharAt(s.length()-1);
        }

    }
    public List<String> generateParenthesis(int n){
        List<String> ans=new ArrayList<>();
        // StringBuilder sb=new StringBuilder();
        // StringBuilder s=new StringBuilder();
        String s =new String();
        bT(0,0,n,s,ans);
        return ans;
    }
    
}
