package twotree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class ReserveTreeCode {


    /**
     * 中序遍历
     * @param root
     * @return
     */
    public TreeNode invertTree1(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return root;
        }
        invertTree1(root.left);
        TreeNode rightNode = root.right;
        list.add(rightNode.val);
        root.right = root.left;
        root.left = rightNode;
        invertTree1(root.left);
        return root;
    }

    /**
     *中序遍历
     */
    List<Integer> list = new ArrayList<>();
    public List<Integer> traverNode(TreeNode root){
      if(root == null)
          return list;
      traverNode(root.left);
      list.add(root.val);
      traverNode(root.right);
      return list;
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
