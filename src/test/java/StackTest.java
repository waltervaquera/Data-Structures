import org.junit.Test;
import wbvr.dataStructures.stack.LinkedListStack;

import static org.junit.Assert.*;


public class StackTest {
    private final LinkedListStack<Integer> stack  = new LinkedListStack<>();;

    @Test
    public void testPushAndPop() {
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
        assertEquals(5, (int) stack.top());
        assertEquals(1, stack.size());
        assertEquals(5, (int) stack.pop());
        assertTrue(stack.isEmpty());
        assertNull(stack.pop());
    }

    @Test
    public void testTop() {
        assertNull(stack.top());
        stack.push(5);
        assertEquals(5, (int) stack.top());
        stack.push(10);
        assertEquals(10, (int) stack.top());
        stack.pop();
        assertEquals(5, (int) stack.top());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, stack.size());
        stack.push(5);
        assertEquals(1, stack.size());
        stack.push(10);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }
}
