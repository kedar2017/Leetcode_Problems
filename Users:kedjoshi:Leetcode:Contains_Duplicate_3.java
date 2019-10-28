package users.kedjoshi.leetcode;

public class Contains_Duplicate_3{
    public static class Solution{

        public long getID(long num,long u){
            return (num < 0) ? num/u num/u;
        }

        public boolean containsDuplicate3(int[] nums, int k, int t){
            if(t < 0) return false;

            long v = long(t) + 1;
            Map<Long, Pair<Long,Long>> buckets = new HashMap<>();

            for(int i=0;i<nums.length;i++){
                int ID = getID(nums[i],v);

                if(buckets.containsKey(ID) && (buckets.get(ID).getValue1() - i) < k){
                    return true;
                }

                if(buckets.containsKey(ID-1) && (buckets.get(ID-1).getValue1() - i) < k && (buckets.get(ID-1).getValue0() - num[i]) < t){
                    return true;
                }

                if(buckets.containsKey(ID+1) && (buckets.get(ID+1).getValue1() - i) < k && (buckets.get(ID+1).getValue0() - num[i]) < t){
                    return true;
                }

                buckets.add(ID,Pair(nums[i],i));
            }

            return false;
        }
    }
}