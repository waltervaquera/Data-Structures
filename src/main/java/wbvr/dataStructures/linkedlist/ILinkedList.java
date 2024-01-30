package wbvr.dataStructures.linkedlist;

public interface ILinkedList<T> {
    int size();
    boolean isEmpty();
    Node<T> first();
    Node<T> last();
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
}
