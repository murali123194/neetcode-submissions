class Solution {

    Map<String, List<String>> map = new HashMap<>();
    List<String> ans = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        for (List<String> t : tickets) {
            map.putIfAbsent(t.get(0), new ArrayList<>());
            map.get(t.get(0)).add(t.get(1));
        }

    
        for (List<String> list : map.values()) {
            Collections.sort(list);
        }

        dfs("JFK");
        return ans;
    }

    public void dfs(String src) {

        List<String> list = map.get(src);
        
        while (list != null && !list.isEmpty()) {
            String next = list.remove(0); 
            dfs(next);
        }
        ans.add(0, src);

        
        
    }
}
