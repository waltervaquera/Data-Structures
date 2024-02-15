package wbvr.dataStructures.doublyLinkedList;

public interface IDoublyLinkedList<T> {

    /**
     * Returns the Number of Elements in the Doubly Linked List
     * @return number of elements
     */
    int size();

    /**
     * Returns whether the Doubly Linked List is Empty or not
     * @return whether the Doubly Linked List is Empty
     */
    boolean isEmpty();

    /**
     * Returns the First element on the Doubly Linked List
     * @return First Node
     */
    DoubleEdgeNode<T> first();

    /**
     * Returns the Last element on the Doubly Linked List
     * @return Last Node
     */
    DoubleEdgeNode<T> last();

    /**
     * Add an element at the Beginning of the Doubly Linked List
     * @param data the element to be inserted
     */
    void addFirst(T data);

    /**
     * Add an element at the End of the Doubly Linked List
     * @param data the element to be inserted
     */
    void addLast(T data);

    /**
     * Removes the First element of the Doubly Linked List
     */
    void removeFirst();

    /**
     * Removes the Last element of the Doubly Linked List
     */
    void removeLast();
}
