class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ds =new ArrayList<>();
        back(s,0,ans,ds);
        return ans;


        
    }
    private void back(String s,int idx,List<List<String>> ans,List<String> ds){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(palindrome(s.substring(idx,i+1))){ds.add(s.substring(idx,i+1));
            back(s,i+1,ans,ds);
            if(ds.size()>0)ds.remove(ds.size()-1);
            }
        }
    }
    private boolean palindrome(String s){
        if(s.length()==0||s.length()==1)return true;
        if(s.charAt(0)!=s.charAt(s.length()-1))return false;
        return palindrome(s.substring(1,s.length()-1));
    }
}
