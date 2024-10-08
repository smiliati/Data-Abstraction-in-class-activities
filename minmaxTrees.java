public class minmaxTrees {
    
    public class Node {
        Node left;
        Node val;
        Node right;
    }

    public int min() {
        Node current = root;
        int currMin = root.val;
        //traverse through the tree and
            if (current.val < currMin) {
                currMin = current.val;
            }

        return currMin;
    }

    public int max() {
        Node current = root;
        int currMax = root.val;
        //traverse through the tree and
            if (current.val > currMax) {
                currMax = current.val;
            }

        return currMax;
    }

    //Dr. Tan's min and max methods:
    public int minV() {
        Node curr = root;
        while (curr != null) {
            curr = curr.left;
        }
        return curr.val;
    }

    public int maxV() {
        Node current = root;
        while (curr != null) {
            curr = curr.right;
        }
        return curr.val;
    }


}
