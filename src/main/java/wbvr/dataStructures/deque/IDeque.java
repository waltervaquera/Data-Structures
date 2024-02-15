package wbvr.dataStructures.deque;

public interface IDeque<T> {

    /**
     * Add an element at the Beginning of the Deque
     * @param t the element to be inserted
     */
    void addFirst(T t);

    /**
     * Add an element at the End of the Deque
     * @param t the element to be inserted
     */
    void addLast(T t);

    /**
     * Removes the First element of the Deque
     */
    T removeFirst();

    /**
     * Removes the Last element of the Deque
     */
    T removeLast();

    /**
     * Returns the First element on the Deque
     * @return First element
     */
    T first();

    /**
     * Returns the Last element on the Deque
     * @return Last element
     */
    T last();

    /**
     * Returns the Number of Elements in the Deque
     * @return number of elements
     */
    int size();

    /**
     * Returns whether the Deque is Empty or not
     * @return whether the Deque is Empty
     */
    boolean isEmpty();
}
