class WordDictionary {
    private Node root;
    public WordDictionary() {
        root=new Node();
    }

    public void addWord(String word) {
        
        Node node =root;
        for(int i=0;i<word.length();i++){
            char c =word.charAt(i);
            if(!node.containsKey(c))node.put(c,new Node());
            node=node.get(c);
        }
        node.flag=true;
    }

    public boolean search(String word) {
        return dfs(word, root);
    }

    public boolean dfs(String word, Node node){
        if (word.isEmpty()) return node.flag;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='.'){
                for(int j=0;j<26;j++){
                    if(node.links[j]!=null){
                        if(dfs(word.substring(i+1), node.links[j])) return true;
                    }
                }
                return false;
            }
            else if(!node.containsKey(c)) return false;
            else {
                node=node.get(c);
            }
        }
        return node.flag;
    }

}

class Node{
    Node[] links=new Node[26];
    boolean flag=false;
    public Node(){

    }
    public boolean containsKey(char c) {
        return (links[c-'a']!=null);
        }

    public void put(char c,Node node) {links[c-'a']=node;}

    public Node get(char c){return links[c-'a'];}

    public boolean set() {return true;}

    public boolean hasEnd(){
        return flag;
    }
}