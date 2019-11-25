package nowCode;

/**
 * 二叉树镜像
 * @author ZhaoMin
 * @date 2019/11/24 20:37
 */
class TreeNode{
    TreeNode left;
    TreeNode right;
    public TreeNode(){
    }
}
public class Main31 {
    public void Mirror(TreeNode root) {
        if(root==null){
            return ;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
