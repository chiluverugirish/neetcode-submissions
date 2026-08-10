class Obj{
    String a;int b;
    Obj(String x,int y){
        a=x;b=y;
    }
}
class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        Obj[] ar=new Obj[names.length];
        for(int i=0;i<names.length;i++){
            ar[i]=new Obj(names[i],heights[i]);
        }
        Arrays.sort(ar,(a,b)->b.b-a.b);
        for(int i=0;i<names.length;i++)names[i]=ar[i].a;
        return names;
    }
}