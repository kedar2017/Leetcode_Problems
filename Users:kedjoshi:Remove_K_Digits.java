package users.kedjoshi.leetcode;

public class Remove_K_Digits{
    public static class Solution{
        public String removeKDigits(String str, int k){
            int len = str.length();

            Stack<Character> stk = new Stack<>();

            int i = 0;

            while(i<len){
                if(!stk.isEmtpy() && stk.peek()>num.charAt(i)){
                    stk.pop();
                    k--;
                }

                stk.push(num.charAt(i));
                i++;
            }

            while(k>0){
                stack.pop();
                k--;
            }

            StringBuilder sb = new StringBuilder();
            while(!stk.isEmpty()){
                sb.append(stk.pop());
            }

            sb.reverse();
            while(sb.length()>0 && sb.charAt(0) == '0'){
                sb.deletecharAt(0);
            }

            return sb.toString();
        }
    }
}