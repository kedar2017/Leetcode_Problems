package users.kedjoshi.leetcode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Flatten_2D_Vector{
    public static class Solution {
        class 2DVector implements Iterator<Integer>{
            private Queue<Integer> temp;
            private List<List<Integer>> vec2D;

            public 2DVector(List<List<Integer>> vec2D){

                this.vec2D = vec2D;

                this.temp = new LinkedList<Integer>;

                if(vec2D.size() > 0 && vec2D != null){
                    for(List<Integer> list : vec2D){
                        for(int i : list){
                            temp.offer(i);
                        }
                    }
                }

            }

            @Override
            public Integer next(){
                return temp.poll();
            }

            @Override
            public boolean hasNext(){
                return !temp.isEmpty();
            }
        }
    }
}