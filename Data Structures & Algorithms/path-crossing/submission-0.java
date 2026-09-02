class Solution {
    public boolean isPathCrossing(String path) {
        Set<List<Integer>>s=new HashSet<>();
        int x=0,y=0;
        List<Integer>tmp=new ArrayList<>();
            tmp.add(x);
            tmp.add(y);
        s.add(tmp);
        for(char c:path.toCharArray()){
            if(c=='N')y++;
            else if(c=='S')y--;
            else if(c=='E')x++;
            else x--;
            List<Integer>li=new ArrayList<>();
            li.add(x);
            li.add(y);
            if(s.contains(li))return true;
            s.add(li);
        }return false;
    }
}