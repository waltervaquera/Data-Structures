package wbvr.dataStructures.binaryTree;

public interface IBinaryTree {
    void insert(int data);
    boolean search(int data);
    BTNode getRoot();
    BTNode getNode(int data);
    void delete(int data);
    int[] preOrder();
    int[] inOrder();
    int[] postOrder();
    int height();
    int size();
}
