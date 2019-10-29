package users.kedjoshi.leetcode;

import com.fishercoder.common.classes.Interval;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge_Intervals{
    public static class Solution{

        public List<Interval> merge(List<Interval> intervals){

            if(intervals.size() <= 1){
                return intervals;
            }

            Collections.sort(intervals, (o1, o2) -> o1.start - o2.start);

            List<Interval> result = new ArrayList();

            for(int i=0;i<intervals.size();i++){
                int first = intervals.get(i).start;
                int second= intervals.get(i).end;

                while(second >= intervals.get(i).start){
                    second = max(second,intervals.get(i).end);
                    i++;
                }

                result.add(new Interval(first,second));
                i--;
            }

            return result;
        }
    }
}