class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,String> map=new HashMap<>();
        if(digits.length()==0)return new ArrayList<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> list=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        back(map,digits,0,s,list);
        return list;

    }
    public void back(Map<Character,String> map,String digits,int idx,StringBuilder s,List<String> list){
        if(idx==digits.length()){
            list.add(s.toString());
            return;
        }
        
            for(char value:map.get(digits.charAt(idx)).toCharArray()){
                s=s.append(value);
                back(map,digits,idx+1,s,list);
                s.deleteCharAt(s.length()-1);
            }
        

    }

}
