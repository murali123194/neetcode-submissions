// import java.util.*;

class Solution {

    List<List<Integer>> adj;
    int[] vis;          // 0 = unvisited, 1 = visiting, 2 = processed
    Stack<Integer> stack;
    boolean possible = true;

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        adj = new ArrayList<>();
        vis = new int[numCourses];
        stack = new Stack<>();

        // Build graph
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : prerequisites) {
            adj.get(edge[1]).add(edge[0]);
        }

        // DFS from every node
        for (int i = 0; i < numCourses; i++) {

            if (vis[i] == 0) {
                dfs(i);

                if (!possible)
                    return new int[0];
            }
        }

        // Pop stack into answer
        int[] ans = new int[numCourses];
        int idx = 0;

        while (!stack.isEmpty()) {
            ans[idx++] = stack.pop();
        }

        return ans;
    }

    private void dfs(int node) {

        // Cycle detected
        if (vis[node] == 1) {
            possible = false;
            return;
        }

        
        

        vis[node] = 1;

        for (int next : adj.get(node)) {

            if (vis[next] != 2)
            
            dfs(next);

            if (!possible)
                return;
        }

        vis[node] = 2;
        stack.push(node);
    }
}