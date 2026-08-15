class Node{
    Node ch[];
    boolean eow;
    Node(){
        ch=new Node[26];eow=false;
    }
}
class PrefixTree {
    private Node top;
    public PrefixTree() {
        top=new Node();
    }

    public void insert(String word) {
        Node tmp=top;
        for(char c:word.toCharArray()){
            if(tmp.ch[c-'a']==null)tmp.ch[c-'a']=new Node();
            tmp=tmp.ch[c-'a'];
        }
        tmp.eow=true;
    }

    public boolean search(String word) {
        Node tmp=top;
        for(char c:word.toCharArray()){
            if(tmp.ch[c-'a']==null)return false;
            tmp=tmp.ch[c-'a'];
        }
        return tmp.eow;
    }

    public boolean startsWith(String prefix) {
        Node tmp=top;
        for(char c:prefix.toCharArray()){
            if(tmp.ch[c-'a']==null)return false;
            tmp=tmp.ch[c-'a'];
        }
        return true;
    }
}
