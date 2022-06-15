package twotree;

public class ReserveTreeCode {


    /**
     * 中序遍历
     * @param root
     * @return
     */
    public TreeNode invertTree1(TreeNode root){
        if(root==null){
            return root;
        }
        invertTree1(root.left);
        TreeNode rightNode = root.right;
        root.right = root.left;
        root.left = rightNode;
        invertTree1(root.left);
        return root;
    }

    /**
     * 先序遍历
     * @param root
     * @return
     */
    public TreeNode invertTree2(TreeNode root){
        if(root==null){
            return root;
        }
        //保存右子树
        TreeNode rightTree = root.right;
        //交换左右子树的位置
        root.right = invertTree2(root.left);
        root.left = invertTree2(rightTree);
        return root;
    }
}
