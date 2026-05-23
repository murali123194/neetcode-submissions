class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String> q=new LinkedList<>();
        int count=0;
        List<String> list=new ArrayList<>(Arrays.asList(deadends));
        Set<String> visited=new HashSet<>();
        visited.add("0000");
        q.add("0000");
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String sb=q.poll();
                if(sb.equals(target))return count;
                if(list.contains(sb))continue;

                for(int j=0;j<4;j++){
                    int next=((sb.charAt(j)-'0')+1)%10;
                    int prev=((sb.charAt(j)-'0')-1+10)%10;
                    String nex=sb.substring(0,j)+Integer.toString(next)+sb.substring(j+1);
                    String pre=sb.substring(0,j)+Integer.toString(prev)+sb.substring(j+1);
                    if(!visited.contains(nex)){
                        visited.add(nex);
                        q.add(nex);
                    }
                    if(!visited.contains(pre)){
                        visited.add(pre);
                        q.add(pre);
                    }
                }
            }
            count++;
        }
        return -1;



        
    }
}