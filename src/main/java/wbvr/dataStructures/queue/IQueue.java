package wbvr.dataStructures.queue;

public interface IQueue<T> {

    /**
     * Add an element at the End of the Queue
     * @param t the element to be inserted
     */
    void enqueue(T t);

    /**
     * Removes and returns the element at the Beginning of the Queue
     * @return Element Removed
     */
    T dequeue();

    /**
     * Returns the element at the Beginning of the Queue
     * @return First element
     */
    T first();

    /**
     * Returns whether the Queue is Empty or not
     * @return whether the Queue is Empty
     */
    boolean isEmpty();

    /**
     * Returns the Number of Elements in the Queue
     * @return number of elements
     */
    int size();
}
