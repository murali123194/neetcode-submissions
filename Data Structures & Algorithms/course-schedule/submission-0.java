class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Convert into the AdjList;
        int n=prerequisites.length;
        List<List<Integer>> adj=new ArrayList<>();
        int[] indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
                adj.add(new ArrayList<>());
        }
        for(int[] course:prerequisites){
            adj.get(course[1]).add(course[0]);
            indegree[course[0]]++;
        }
    
        // Find the indegree of the vertices
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
                if(indegree[i]==0)q.add(i);
        } 
        int courses=0;
        // Perform the Kahns Algorithm 
        while(!q.isEmpty()){
            int s=q.poll();
            courses++;
            for(int nei:adj.get(s)){
                indegree[nei]--;
                if(indegree[nei]==0)q.add(nei);
            }
        }
        // }b
        // for(int )
        // Evaluate the indegree arr ,if any one of them >0 return false;
        if(courses!=numCourses)return false;
        return true;

        
        
    }
}
