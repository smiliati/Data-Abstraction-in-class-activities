import java.util.ArrayList;
import java.util.List;
import java.util.TreeNode;


public class Trees {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        inorder(root,res);
        return res;
    }

    public void inorder(TreeNode node, List<Integer> res) {
        if (node==null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }

    public Node deleteNode(Node root, int x) {
        if (root == null) {
            return root;
        }

        if (root.val > x) {
            root.left = deleteNode(root.left, x);
        } else if (root.val < x) {
            root.right = deleteNode(root.right, x);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                Node replace = getSuccessor(root);
                root.val = replace.val;
                root.right = deleteNode(root.right, replace.val);
            }
            return root;
        }

        public Node getSuccessor(Node curr) {
            curr = curr.right;
            while (curr != null && curr.left != null) {
                curr = curr.left;
            }
            return curr;
        }

    }

    //I WROTE:
    public boolean isBalanced(TreeNode root) { // checks if the tree is height balanced (left and right height differs by <= 1)
        int leftHeight = root.leftHeight(root);
        int rightHeight = root.rightHeight(root);
        if (abs(leftHeight - rightHeight) <= 1) {
            return true;
        } else {
            return false;
        }
    }
    public int leftHeight(TreeNode node) { //returns the height of the node you pass in as the parameter
        TreeNode current = node;
        int leftHeight = 0;
        while (current.left != null) {
            leftHeight++;
            current = current.left;
        }
        return leftHeight;
    }
    public int rightHeight(TreeNode node) {
        TreeNode current = node;
        int rightHeight = 0;
        while (node.right !- null) {
            rightHeight++;
            current = current.right;
        }
        return rightHeight;
    }

    //Dr. Tan WROTE:
    public boolean isBalancedA(Node root) {
        if (root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        } else if (!isBalanced(root.left) || !isBalanced(root.right)) {
            return false;
        } else {
            return true;
        }
    }
    public int height(Node curr) {
        if (curr == null) {
            return 0;
        }
        int leftHeight = height(curr.left);
        int rightHeight = height(curr.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    //I WROTE:
    public TreeNode sortedArrayToBST(int[] nums) {
        
    }

}
