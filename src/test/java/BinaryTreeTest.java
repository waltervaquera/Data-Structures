import org.junit.Test;
import wbvr.dataStructures.binaryTree.BinaryTree;

import static org.junit.Assert.*;


public class BinaryTreeTest {
    private final BinaryTree binaryTree = new BinaryTree();

    @Test
    public void testInsertAndSearch() {
        assertFalse(binaryTree.search(5));
        binaryTree.insert(5);
        assertTrue(binaryTree.search(5));
        assertFalse(binaryTree.search(10));
    }

    @Test
    public void testDelete() {
        binaryTree.insert(5);
        binaryTree.insert(10);
        binaryTree.insert(3);
        assertTrue(binaryTree.search(10));
        binaryTree.delete(10);
        assertFalse(binaryTree.search(10));
    }

    @Test
    public void testPreOrder() {
        binaryTree.insert(5);
        binaryTree.insert(10);
        binaryTree.insert(3);
        int[] expected = {5, 3, 10};
        assertArrayEquals(expected, binaryTree.preOrder());
    }

    @Test
    public void testInOrder() {
        binaryTree.insert(5);
        binaryTree.insert(10);
        binaryTree.insert(3);
        int[] expected = {3, 5, 10};
        assertArrayEquals(expected, binaryTree.inOrder());
    }

    @Test
    public void testPostOrder() {
        binaryTree.insert(5);
        binaryTree.insert(10);
        binaryTree.insert(3);
        int[] expected = {3, 10, 5};
        assertArrayEquals(expected, binaryTree.postOrder());
    }

    @Test
    public void testHeight() {
        assertEquals(0, binaryTree.height());
        binaryTree.insert(5);
        assertEquals(1, binaryTree.height());
        binaryTree.insert(10);
        binaryTree.insert(3);
        assertEquals(2, binaryTree.height());
    }

    @Test
    public void testSize() {
        assertEquals(0, binaryTree.size());
        binaryTree.insert(5);
        assertEquals(1, binaryTree.size());
        binaryTree.insert(10);
        binaryTree.insert(3);
        assertEquals(3, binaryTree.size());
    }
}
