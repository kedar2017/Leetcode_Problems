package users.kedjoshi.leetcode;

public class Pour_Water{
    public class Solution{
        public int[] pourWater(int[] heights, int V, int K){
            int index;

            while(V > 0){
                index = K;

                for(int i=K;i>=0;i--){
                    if(heights[i] < heights[index]){
                        index = i;
                    }
                    else
                        break;

                }

                if(index != K){
                    heights[index]++;
                    V--;
                    continue;
                }

                for(int j=K+1;j<=heights.length();j++){
                    if(heights[j] < heights[index]){
                        index = j;
                    }
                    else
                        break;
                }

                heights[index]++;
                V--;
            }

            return heights;
        }
    }
}