package wbvr.dataStructures.doublyLinkedList;

public class DoubleEdgeNode<T> {
    DoubleEdgeNode<T> prev;
    DoubleEdgeNode<T> next;
    T data;

    public T getData() {
        return data;
    }

    public DoubleEdgeNode(T data) {
        this.prev = null;
        this.next = null;
        this.data = data;
    }
}
