package wbvr.dataStructures.linkedlist;

public class Node<T> {
    T data;
    Node<T> next;

    public T getData() {
        return data;
    }

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}
