package users.kedjoshi.leetcode;

public class ZigZag_Binary_Tree{
    public static class Solution{
        public List<List> zigzagBinarytree(TreeNode root){
            List<List> res = new ArrayList<>();

            if(res == null) return res;

            Queue<TreeNode> q = new LinkedList<>();

            q.add(root);

            int q_size = 1;

            boolean traverse = true;

            while(!q.isEmpty()){

                List<Integer> tmp = new ArrayList<>();
                for(int j=0;j<q_size;j++){
                    TreeNode n = q.poll();

                    if(traverse){
                        tmp.add(n.val);
                    }
                    else{
                        tmp.add(0,n.val);
                    }

                    if(n.left!=null) q.add(n.left);

                    if(n.right!=null) q.add(n.right);

                }

                res.add(tmp);

                q_size = q.size();
                traverse = !traverse;
            }

            return res;
        }
    }
}