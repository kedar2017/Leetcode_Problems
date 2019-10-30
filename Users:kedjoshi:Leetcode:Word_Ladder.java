package users.kedjoshi.leetcode;

public class Word_Ladder{
    public static class Solution{
        public int wordLadder(String start, String end, Set<String> dict){
            Queue<String> queue = new LinkedList<String>;

            queue.add(start);

            int level = 0;

            Set<String> visited = new Hashset<String>;
            visited.add(start);

            while(!queue.isEmpty()){

                for(int i=0;i<queue.size();i++){

                    String str = queue.poll();

                    char[] chars = str.toCharArray();
                    for(int j=0;j<str.length();j++){

                        for(c='a';c<'z';c++){

                            chars[i] = c;

                            String word = new String(chars);

                            if(word.equals(end)) return level+1;

                            if(dict.contains(word) && !visited.contains(word)){
                                queue.add(word);
                                visited.add(word);
                            }
                        }
                    }
                }

                level++;
            }

            return 0;
        }
    }
}