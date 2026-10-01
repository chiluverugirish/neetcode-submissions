class Solution {
    public boolean isPathCrossing(String path) {
        int x=0,y=0;
        HashSet<List<Integer>>s=new HashSet<>();
        List<Integer>l=new ArrayList<>();l.add(x);l.add(y);s.add(l);
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N')y++;
            else if(path.charAt(i)=='E')x++;
            else if(path.charAt(i)=='S')y--;
            else x--;
            List<Integer>tmp=new ArrayList<>();tmp.add(x);tmp.add(y);s.add(l);
            if(s.contains(tmp))return true;
            s.add(tmp);
        }
        return false;
    }
}