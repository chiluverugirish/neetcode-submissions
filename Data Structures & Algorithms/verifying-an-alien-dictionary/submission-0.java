class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int arr[]=new int[26];
        int val=0;
        for(char c:order.toCharArray()){
            arr[c-'a']=val;val++;
        }
        String tmp[]=words.clone();
        Arrays.sort(tmp,(a,b)->{
            int min=Math.min(a.length(),b.length());
            for(int i=0;i<min;i++){
                char c1=a.charAt(i),c2=b.charAt(i);
                int v1=arr[c1-'a'],v2=arr[c2-'a'];
                if(v1!=v2){
                    return v1-v2;
                }
            }return a.length()-b.length();
        });
        System.out.println(Arrays.toString(tmp));
        for(int i=0;i<words.length;i++){
            if(!tmp[i].equals(words[i]))return false;
        }
        return true;
    }
}