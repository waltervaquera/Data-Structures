package wbvr.dataStructures.binaryTree;

public class BinaryTree implements IBinaryTree {
    BTNode root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int data) {
        root = new BTNode(data);
    }

    @Override
    public void insert(int data) {
        root = insert(root, data);
    }

    @Override
    public boolean search(int data) {
        return search(root, data);
    }

    @Override
    public BTNode getRoot() {
        return root;
    }

    @Override
    public BTNode getNode(int data) {
        return getNode(root, data);
    }

    @Override
    public void delete(int data) {

    }

    @Override
    public int[] inOrder() {
        int[] arr = new int[size()];
        inOrder(root, arr, 0);
        return arr;
    }

    @Override
    public int[] preOrder() {
        int[] arr = new int[size()];
        preOrder(root, arr, 0);
        return arr;
    }

    @Override
    public int[] postOrder() {
        int[] arr = new int[size()];
        postOrder(root, arr, 0);
        return arr;
    }

    @Override
    public int height() {
        return height(root);
    }

    @Override
    public int size() {
        return size(root);
    }

    public void print() {
        var preOrder = preOrder();
        for (int i : preOrder) {
            System.out.println(i + " ");
        }
    }

    private static BTNode insert(BTNode root, int data) {
        if (root == null) {
            return new BTNode(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    private static boolean search(BTNode root, int data) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        }

        if (data < root.data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }

    private static BTNode getNode(BTNode root, int data) {
        if (root == null || root.data == data) {
            return root;
        }

        if (data < root.data) {
            return getNode(root.left, data);
        }
        return getNode(root.right, data);
    }

    private void inOrder(BTNode node, int[] arr, int index) {
        if (node != null) {
            inOrder(node.left, arr, index);
            arr[index++] = node.data;
            inOrder(node.right, arr, index);
        }
    }

    private void preOrder(BTNode node, int[] arr, int index) {
        if (node != null) {
            arr[index++] = node.data;
            preOrder(node.left, arr, index);
            preOrder(node.right, arr, index);
        }
    }

    private void postOrder(BTNode node, int[] arr, int index) {
        if (node != null) {
            postOrder(node.left, arr, index);
            postOrder(node.right, arr, index);
            arr[index++] = node.data;
        }
    }

    private static int size(BTNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + size(root.left) + size(root.right);
    }

    private static int height(BTNode root){
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.left));
    }
}
