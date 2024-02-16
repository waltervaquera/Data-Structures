import org.junit.Test;
import wbvr.dataStructures.doublyLinkedList.DoublyLinkedList;

import static org.junit.Assert.*;


public class DoublyLinkedListTest {
    private final DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

    @Test
    public void testSize() {
        assertEquals(0, doublyLinkedList.size());
        doublyLinkedList.addFirst(5);
        assertEquals(1, doublyLinkedList.size());
        doublyLinkedList.addLast(10);
        assertEquals(2, doublyLinkedList.size());
        doublyLinkedList.removeFirst();
        assertEquals(1, doublyLinkedList.size());
        doublyLinkedList.removeLast();
        assertEquals(0, doublyLinkedList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(doublyLinkedList.isEmpty());
        doublyLinkedList.addFirst(5);
        assertFalse(doublyLinkedList.isEmpty());
        doublyLinkedList.removeFirst();
        assertTrue(doublyLinkedList.isEmpty());
    }

    @Test
    public void testAddFirst() {
        doublyLinkedList.addFirst(5);
        assertEquals(5, (int) doublyLinkedList.first().getData());
        assertEquals(5, (int) doublyLinkedList.last().getData());
        doublyLinkedList.addFirst(10);
        assertEquals(10, (int) doublyLinkedList.first().getData());
        assertEquals(5, (int) doublyLinkedList.last().getData());
    }

    @Test
    public void testAddLast() {
        doublyLinkedList.addLast(5);
        assertEquals(5, (int) doublyLinkedList.first().getData());
        assertEquals(5, (int) doublyLinkedList.last().getData());
        doublyLinkedList.addLast(10);
        assertEquals(5, (int) doublyLinkedList.first().getData());
        assertEquals(10, (int) doublyLinkedList.last().getData());
    }

    @Test
    public void testRemoveFirst() {
        doublyLinkedList.addFirst(5);
        doublyLinkedList.addLast(10);
        doublyLinkedList.removeFirst();
        assertEquals(10, (int) doublyLinkedList.first().getData());
        assertEquals(10, (int) doublyLinkedList.last().getData());
        doublyLinkedList.removeFirst();
        assertTrue(doublyLinkedList.isEmpty());
    }

    @Test
    public void testRemoveLast() {
        doublyLinkedList.addFirst(5);
        doublyLinkedList.addLast(10);
        doublyLinkedList.removeLast();
        assertEquals(5, (int) doublyLinkedList.first().getData());
        assertEquals(5, (int) doublyLinkedList.last().getData());
        doublyLinkedList.removeLast();
        assertTrue(doublyLinkedList.isEmpty());
    }
}
