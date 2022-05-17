package twotree;

public class MinDepth {
    /**
     * 深度优先搜索
     * @param treeNode
     * @return
     */
     public int minDepth(TreeNode treeNode){
         if(treeNode == null)
             return 0;
         if(treeNode.left==null&&treeNode.right==null)
             return 1;
         int minDepth = Integer.MIN_VALUE;
         if(treeNode.left!=null){
             minDepth = Math.min(minDepth(treeNode.left),minDepth);
         }
         if(treeNode.right!=null){
             minDepth = Math.min(minDepth(treeNode.right),minDepth);
         }
         return minDepth+1;
     }

    /**
     * 广度优先搜索
     * @param treeNode
     * @return
     */
     public int minDepthWodth(TreeNode treeNode){
        int minDepth = Integer.MIN_VALUE;
        return  minDepth;
     }


}
