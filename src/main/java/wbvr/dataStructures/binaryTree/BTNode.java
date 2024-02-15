package wbvr.dataStructures.binaryTree;

public class BTNode {
    int data;
    BTNode left;
    BTNode right;

    public BTNode (int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public boolean isLeafNode() {
        return left == null && right == null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
