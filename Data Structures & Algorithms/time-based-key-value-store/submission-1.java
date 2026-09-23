class Pair{
    String value;
    int time;
    Pair(int f){
        time=f;
    }
    Pair(String v,int t){
        value=v;
        time=t;
    }
}
class TimeMap {
    Map<String,TreeSet<Pair>>mp;
    public TimeMap() {
        mp=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeSet<Pair>ts=mp.getOrDefault(key,new TreeSet<>((a,b)->a.time-b.time));
        ts.add(new Pair(value,timestamp));
        mp.put(key,ts);
    }
    
    public String get(String key, int timestamp) {
        TreeSet<Pair>ts=mp.get(key);
        if(ts==null)return "";
        Pair p=ts.floor(new Pair(timestamp));
        if(p!=null)return p.value;
        return "";
    }
}
