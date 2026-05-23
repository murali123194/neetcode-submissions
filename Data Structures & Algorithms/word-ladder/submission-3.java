class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q=new LinkedList<>();
        Set<String> set =new HashSet<>();
        if(!wordList.contains(endWord))return 0;
        q.add(beginWord);
        set.add(beginWord);
        int ans=0;
        while(!q.isEmpty()){
            int size=q.size();
            ans++;
            while(size>0){
                String word=q.poll();
                if(endWord.equals(word))return ans;
                for(String nextWord:wordList){
                    int length=0;
                    if(set.contains(nextWord))continue;
                    
                    for(int i=0;i<word.length();i++){
                        if(nextWord.charAt(i)!=word.charAt(i))length++;
                        
                }
                if(length==1){
                            if(!set.contains(nextWord))
                            set.add(nextWord);
                            q.add(nextWord);
                        }
            }
            size--;
            }
            
        }
        return 0;

        
        
        
        


        

        

        
    }
    
}
