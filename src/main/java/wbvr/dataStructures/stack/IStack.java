package wbvr.dataStructures.stack;

public interface IStack<T> {

    /**
     * Add an element at the Top of the Stack
     * @param t the element to be inserted
     */
    void push(T t);

    /**
     * Removes and returns the element at the Top of the Stack
     * @return Element Removed
     */
    T pop();

    /**
     * Returns the element at the Top of the Stack
     * @return Top element
     */
    T top();

    /**
     * Returns whether the Stack is Empty or not
     * @return whether the Stack is Empty
     */
    boolean isEmpty();

    /**
     * Returns the Number of Elements in the Stack
     * @return number of elements
     */
    int size();
}
