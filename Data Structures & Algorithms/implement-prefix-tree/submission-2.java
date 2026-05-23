class PrefixTree {
    private static Node root;
    public PrefixTree() {
         root=new Node();
    }

    public void insert(String word) {
        Node node =root;
        for(int i=0;i<word.length();i++){
            char c =word.charAt(i);
            if(!node.containsKey(c))node.put(c,new Node());
            node=node.get(c);
        }
        node.flag=true;


    }

    public boolean search(String word) {
        Node node =root;
        for(int i=0;i<word.length();i++){
            char c =word.charAt(i);
            if(!node.containsKey(c))return false;
            node=node.get(c);
            
        }
        if(!node.hasEnd())return false;
        else return true;

    }

    public boolean startsWith(String prefix) {
        Node node =root;
        for(int i=0;i<prefix.length();i++){
            char c =prefix.charAt(i);
            if(!node.containsKey(c))return false;
            node=node.get(c);
            
        }
        return true;

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

    public boolean hasEnd(){return flag;}


}
