package users.kedjoshi.leetcode;

import java.util.*;

public class Group_Anagram{
    public static class Solution{
        public List<List<String>> grp_anagram(String [] str){
            Map <String,List<String>> map = new HashMap<>();

            for(String s : str){
                char[] ch = str.toCharArray();
                Arrays.sort(ch);

                String key = new String(ch);

                if(!map.containsKey(key)){
                    map.put(key,new ArrayList<>());
                }

                map.put(key,s);

            }

            return new ArrayList<>(map.values());
        }
    }
}