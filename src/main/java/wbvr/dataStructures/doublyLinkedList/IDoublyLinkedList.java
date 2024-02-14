package wbvr.dataStructures.doublyLinkedList;

public interface IDoublyLinkedList<T> {
    int size();
    boolean isEmpty();
    DoubleEdgeNode<T> first();
    DoubleEdgeNode<T> last();
    void addFirst(T data);
    void addLast(T data);
    void removeFirst();
    void removeLast();
}
