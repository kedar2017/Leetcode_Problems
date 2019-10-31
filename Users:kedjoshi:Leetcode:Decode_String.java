package users.kedjoshi.leetcode;

import java.util.Stack;

public class Decode_String{
    public static class Solution{
        public String decodeString(String s){
            Stack<Integer> count = new Stack<>();
            Stack<String> str = new Stack<>();

            int pos = 0;

            str.push("");

            while(pos < s.length()){

                if(s.charAt(pos) >= '0' && s.charAt(pos) <= '9'){
                    int p = pos;
                    while(s.charAt(pos) >= '0' && s.charAt(pos) <= '9'){
                        pos++;
                    }

                    count.push(Integer.parseInt(s.substring(p,pos+1)));
                }

                else if (s.charAt(pos) == '['){
                    str.push("");
                }

                else if(s.charAt(pos) == ']'){
                    String st = str.pop();
                    StringBuilder sb = new StringBuilder();

                    int n = count.pop();

                    for(int i=0;i<n;i++){
                        sb.append(st);
                    }

                    str.push(str.pop()+sb.toString());
                }

                else {
                    str.push(str.pop()+s.charAt(pos));
                }

                pos++;
            }

            return str.pop();

        }
    }

}