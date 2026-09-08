class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String>mp1=new HashMap<>();
        HashMap<String,Character>mp2=new HashMap<>();
        String arr[]=s.split(" ");
        if(arr.length!=pattern.length())return false;
        int j=0;
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            if(mp2.containsKey(arr[j])){
                if(mp2.get(arr[j])!=c)return false;
            }
            else{
                mp2.put(arr[j],c);
            }
            if(mp1.containsKey(c)){
                if(!mp1.get(c).equals(arr[j]))return false;
            }
            else{
                mp1.put(c,arr[j]);
            }
            j++;
        }
        for(;j<arr.length;j++){
            if(!mp2.containsKey(arr[j]))return false;
        }return true;
    }
}