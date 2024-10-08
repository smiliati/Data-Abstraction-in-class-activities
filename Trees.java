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
        }

        public Node getSuccessor(Node curr) {
            curr = curr.right;
            while (curr != null && curr.left != null) {
                curr = curr.left;
            }
            return curr;
        }


    }

}
