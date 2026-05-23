class Solution {
    Map<Integer,String> map;

    public String encode(List<String> strs) {
        map=new HashMap<>();
        int i=1;
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            map.put(i,s);
            sb.append(String.valueOf(i));
            i++;


        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        return new ArrayList<>(map.values());

    }
}
