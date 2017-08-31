package practice20170825;

树的子结构 
题目描述
输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）






public class Demo17 {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
    	boolean flag = false;
    	if(root2 == null ) return false;
    	if(root1 == null && root2!=null) return false;
    	if(root1.val == root2.val) {
    		flag = isSubTree(root1,root2);
    	}
    	if(!flag) {
    		flag = HasSubtree(root1.left,root2);
    		if(!flag) {
    			flag = HasSubtree(root1.right, root2);
    		}
    	}
        return flag;
    }
    public boolean isSubTree(TreeNode root1, TreeNode root2) {
    	if(root2 == null) return true;
    	if(root1 == null && root2!=null) return false;
    	if(root1.val == root2.val) {
    		return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
    	}else {
    		return false;
    	}
    }
}
