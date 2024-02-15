package wbvr.dataStructures.binaryTree;

public interface IBinaryTree {

    /**
     * Insert a Node in the Binary Tree based on the value of the Root
     * @param data the Node to be inserted
     */
    void insert(int data);

    /**
     * Search whether a Node in the Binary Tree exist or not
     * @param data the Node to be searched
     * @return whether a Node exist in the Binary Tree
     */
    boolean search(int data);

    /**
     * Returns the Root of the Binary Tree
     * @return Root Node
     */
    BTNode getRoot();

    /**
     * Search and returns a Node from the Binary Tree
     * @param data the Node to be got
     * @return Found Node
     */
    BTNode getNode(int data);

    /**
     * Search and deletes a Node from the Binary Tree
     * @param data the Node to be deleted
     */
    void delete(int data);

    /**
     * Returns an Array representing the pre-order traversal of the Binary Tree
     * @return an Integer Array representing the pre-order traversal
     */
    int[] preOrder();

    /**
     * Returns an Array representing the in-order traversal of the Binary Tree
     * @return an Integer Array representing the in-order traversal
     */
    int[] inOrder();

    /**
     * Returns an Array representing the post-order traversal of the Binary Tree
     * @return an Integer Array representing the post-order traversal
     */
    int[] postOrder();

    /**
     * Returns the maximum Depth of any leaf node from the Root node
     * @return the maximum depth
     */
    int height();

    /**
     * Returns the number of elements in the Binary Tree
     * @return number of elements
     */
    int size();
}
