package wbvr.dataStructures.linkedList;

public interface ILinkedList<T> {

    /**
     * Returns the Number of Elements in the Linked List
     * @return number of elements
     */
    int size();

    /**
     * Returns whether the Linked List is Empty or not
     * @return whether the Linked List is Empty
     */
    boolean isEmpty();

    /**
     * Returns the First element on the Linked List
     * @return First Node
     */
    Node<T> first();

    /**
     * Returns the Last element on the Linked List
     * @return Last Node
     */
    Node<T> last();

    /**
     * Add an element at the Beginning of the Linked List
     * @param data the element to be inserted
     */
    void addFirst(T data);

    /**
     * Add an element at the End of the Linked List
     * @param data the element to be inserted
     */
    void addLast(T data);

    /**
     * Removes the First element of the Linked List
     */
    void removeFirst();
}
