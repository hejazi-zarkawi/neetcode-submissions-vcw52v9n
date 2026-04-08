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

        if(intervals.size()==0){
            return true;
        }
        Collections.sort(intervals, (a,b)-> Integer.compare(a.start,b.start));
        Interval initial_interval= intervals.get(0);
        int start= initial_interval.start;
        int end= initial_interval.end;

        for(int j=1;j<intervals.size(); j++){
            Interval curr= intervals.get(j);
            if(end> curr.start){
                return false;
            }
            else{
                start= curr.start;
                end= curr.end;
            }
        }

        return true;
    }
}
