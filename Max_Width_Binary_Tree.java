import java.util.AbstractMap;

class Solution{
    public int maxWidthBinaryTree(TreeNode node){
        if(node == null) return 0;

        Queue<TreeNode> queue = new LinkedList<TreeNode()>;
        Map<TreeNode,Integer> map = new HashMap<TreeNode,Integer>();

        int max, l, r = 0;

        map.put(node,1);

        queue.offer(node);

        while(!queue.isEmpty()){
            l = map.get(queue.peek()); r = l;

            int size = queue.size();
            for(int i =0;i<size;i++){
                TreeNode t = queue.peek();
                r = map.get(queue.poll());

                if(t.left!=null){
                    queue.add(t.left); 
                    map.put(t.left,2*r-1);
                }

                if(t.right!=null) {
                    queue.add(t.right);
                    map.put(t.right,2*r);
                }
            }

            max = Math.max(max,r-l+1);
        }

        return max;
        
    }
}