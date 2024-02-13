package wbvr.dataStructures.binaryTree;

public interface IBinaryTree {
    void insert(int data);
    boolean search(int data);
    BTNode getRoot();
    BTNode getNode(int data);
    void delete(int data);
    int[] inOrder();
    int[] preOrder();
    int[] postOrder();
    int height();
    int size();
}
