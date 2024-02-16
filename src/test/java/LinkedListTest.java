import org.junit.Test;
import wbvr.dataStructures.linkedList.LinkedList;

import static org.junit.Assert.*;


public class LinkedListTest {
    private final LinkedList<Integer> linkedList = new LinkedList<>();

    @Test
    public void testSize() {
        assertEquals(0, linkedList.size());
        linkedList.addFirst(5);
        assertEquals(1, linkedList.size());
        linkedList.addLast(10);
        assertEquals(2, linkedList.size());
        linkedList.removeFirst();
        assertEquals(1, linkedList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(linkedList.isEmpty());
        linkedList.addFirst(5);
        assertFalse(linkedList.isEmpty());
        linkedList.removeFirst();
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testAddFirst() {
        linkedList.addFirst(5);
        assertEquals(5, (int) linkedList.first().getData());
        assertEquals(5, (int) linkedList.last().getData());
        linkedList.addFirst(10);
        assertEquals(10, (int) linkedList.first().getData());
        assertEquals(5, (int) linkedList.last().getData());
    }

    @Test
    public void testAddLast() {
        linkedList.addLast(5);
        assertEquals(5, (int) linkedList.first().getData());
        assertEquals(5, (int) linkedList.last().getData());
        linkedList.addLast(10);
        assertEquals(5, (int) linkedList.first().getData());
        assertEquals(10, (int) linkedList.last().getData());
    }

    @Test
    public void testRemoveFirst() {
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.removeFirst();
        assertEquals(10, (int) linkedList.first().getData());
        assertEquals(10, (int) linkedList.last().getData());
        linkedList.removeFirst();
        assertTrue(linkedList.isEmpty());
    }
}
