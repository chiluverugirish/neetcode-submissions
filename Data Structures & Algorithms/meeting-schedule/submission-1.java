/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()==0)return true;
        Collections.sort(intervals,(a,b)->a.start-b.start);
        int prev=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            int s=intervals.get(i).start,e=intervals.get(i).end;
            // System.out.println(s+" "+prev);
            if(prev>s)return false;
            prev=e;
        }
        return true;
    }   
}
