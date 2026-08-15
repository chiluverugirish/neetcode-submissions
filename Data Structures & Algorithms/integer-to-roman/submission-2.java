class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"I");
        hm.put(5,"V");
        hm.put(10,"X");
        hm.put(50,"L");
        hm.put(100,"C");
        hm.put(500,"D");
        hm.put(1000,"M");
        hm.put(4,"IV");
        hm.put(9,"IX");
        hm.put(40,"XL");
        hm.put(90,"XC");
        hm.put(400,"CD");
        hm.put(900,"CM");

        StringBuilder ans=new StringBuilder();
        if(num/1000>=1){
            int v=num/1000;
            for(int i=0;i<v;i++)ans.append(hm.get(1000));
            num=num-v*1000;
        }
        if(num/100>=1){
            int v=num/100;
            if(v==9){
                    ans.append(hm.get(900));
                    num-=900;v-=9;
                    }
             if(v==4){
                    ans.append(hm.get(400));
                    num-=400;v-=4;
                }
            if(v>=5){
                ans.append(hm.get(500));
                num-=500;v-=5;
            }
                for(int i=0;i<v;i++)ans.append(hm.get(100));
                    num-=v*100;
        }
        
        if(num/10>=1){
            int v=num/10;
            if(v==4){ans.append(hm.get(40));num-=40;v-=4;}
            if(v==9){ans.append(hm.get(90));num-=90;v-=9;}
            if(num/50>=1){
            ans.append(hm.get(50));
            num-=50;v-=5;
        }
        for(int i=0;i<v;i++)ans.append(hm.get(10));num-=v*10;
        }
        
        if(num/1>=1){
            int v=num/1;
            if(v==4){ans.append(hm.get(4));v-=4;num-=4;}
            if(v==9){ans.append(hm.get(9));v-=9;num-=5;}
            if(num/5>=1){
            ans.append(hm.get(5));
            num-=5;v-=5;
        }
        for(int i=0;i<v;i++)ans.append(hm.get(1));
        }
        return ans.toString();
    }
}