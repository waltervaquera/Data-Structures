import org.junit.Test;
import wbvr.dataStructures.queue.LinkedListQueue;

import static org.junit.Assert.*;


public class QueueTest {
    private final LinkedListQueue<Integer> queue = new LinkedListQueue<>();

    @Test
    public void testEnqueueAndDequeue() {
        assertTrue(queue.isEmpty());
        queue.enqueue(5);
        assertFalse(queue.isEmpty());
        assertEquals(5, (int) queue.first());
        assertEquals(1, queue.size());
        assertEquals(5, (int) queue.dequeue());
        assertTrue(queue.isEmpty());
        assertNull(queue.dequeue());
    }

    @Test
    public void testFirst() {
        assertNull(queue.first());
        queue.enqueue(5);
        assertEquals(5, (int) queue.first());
        queue.enqueue(10);
        assertEquals(5, (int) queue.first());
        queue.dequeue();
        assertEquals(10, (int) queue.first());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.enqueue(5);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, queue.size());
        queue.enqueue(5);
        assertEquals(1, queue.size());
        queue.enqueue(10);
        assertEquals(2, queue.size());
        queue.dequeue();
        assertEquals(1, queue.size());
    }
}
