class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> list = new ArrayList<>(Arrays.asList(strs));
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[list.size()]; // ✅ to avoid removing elements

        for (int i = 0; i < list.size(); i++) {
            if (visited[i]) continue; 
            String curr = list.get(i);
            List<String> group = new ArrayList<>();
            group.add(curr);
            visited[i] = true;

            for (int j = i + 1; j < list.size(); j++) {
                if (!visited[j] && checkAnagram(curr, list.get(j))) {
                    group.add(list.get(j));
                    visited[j] = true;
                }
            }

            ans.add(group);
        }
        return ans;
    }

    public boolean checkAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) return false;
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
