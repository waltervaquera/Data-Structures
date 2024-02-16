import org.junit.Test;
import wbvr.dataStructures.deque.LinkedListDeque;

import static org.junit.Assert.*;


public class DequeTest {
    private final LinkedListDeque<Integer> deque = new LinkedListDeque<>();

    @Test
    public void testAddFirstAndRemoveFirst() {
        assertTrue(deque.isEmpty());
        deque.addFirst(5);
        assertFalse(deque.isEmpty());
        assertEquals(5, (int) deque.first());
        assertEquals(1, deque.size());
        assertEquals(5, (int) deque.removeFirst());
        assertTrue(deque.isEmpty());
        assertNull(deque.removeFirst());
    }

    @Test
    public void testAddLastAndRemoveLast() {
        assertTrue(deque.isEmpty());
        deque.addLast(5);
        assertFalse(deque.isEmpty());
        assertEquals(5, (int) deque.last());
        assertEquals(1, deque.size());
        assertEquals(5, (int) deque.removeLast());
        assertTrue(deque.isEmpty());
        assertNull(deque.removeLast());
    }

    @Test
    public void testFirstAndLast() {
        assertNull(deque.first());
        assertNull(deque.last());
        deque.addFirst(5);
        assertEquals(5, (int) deque.first());
        assertEquals(5, (int) deque.last());
        deque.addLast(10);
        assertEquals(5, (int) deque.first());
        assertEquals(10, (int) deque.last());
        deque.removeFirst();
        assertEquals(10, (int) deque.first());
        assertEquals(10, (int) deque.last());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(deque.isEmpty());
        deque.addFirst(5);
        assertFalse(deque.isEmpty());
        deque.removeFirst();
        assertTrue(deque.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, deque.size());
        deque.addFirst(5);
        assertEquals(1, deque.size());
        deque.addLast(10);
        assertEquals(2, deque.size());
        deque.removeFirst();
        assertEquals(1, deque.size());
    }
}
