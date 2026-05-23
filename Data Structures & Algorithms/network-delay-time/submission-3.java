


class Solution {
    
    public int networkDelayTime(int[][] times, int n, int k) {
        int[][] mat=new int[n][n];
        for(int[] m:mat){
            Arrays.fill(m,10000000);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    mat[i][j]=0;
                    break;
                }
                
            }
        }
        int len=times.length;
        for(int[] time:times){
            int src=time[0];
            int des=time[1];
            int wei=time[2];
            mat[src-1][des-1]=wei;
        }

        for(int k1=0;k1<n;k1++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=Math.min(mat[i][k1]+mat[k1][j],mat[i][j]);
                }
            }
        }
        int ans=0;
        int size=n-1;
        for(int i=0;i<n;i++){
            if(mat[k-1][i]>=10000000)return -1;
            if(i==k-1) continue;
            ans=Math.max(mat[k-1][i],ans);
        }
        return ans;

            // Perform the Dikjstars Algoritm
         
    }
}
