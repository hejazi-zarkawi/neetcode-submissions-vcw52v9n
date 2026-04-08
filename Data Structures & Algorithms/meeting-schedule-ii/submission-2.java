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
    public int minMeetingRooms(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)-> Integer.compare(a.start,b.start));

        if(intervals.size()==0) return 0;
        Interval first= intervals.get(0);
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.add(first.end);
        for(int j=1; j<intervals.size();j++){
            Interval curr= intervals.get(j);

            if(pq.peek()>curr.start){
                pq.add(curr.end);
            }
            else{
                pq.poll();
                pq.add(curr.end);
            }
        }

        return pq.size();
    }
}
