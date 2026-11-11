class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int i=0,j=0;
        while(i<students.length && j<sandwiches.length){
            if(students[i]==sandwiches[j]){
                students[i]=-1;
                i++;j++;
            }
            else i++;
        }
        for(int k=j;k<sandwiches.length;k++){
            int z=i;
            boolean ans=false;
            for( z=i;z<i+students.length;z++){
                int index=z%students.length;
                if(sandwiches[k]==students[index]){
                    students[index]=-1;
                    ans=true;break;
                }
            }
            // System.out.println(k);
            if(!ans)return sandwiches.length-k;
            i=z;
        }
        return 0;
    }
}