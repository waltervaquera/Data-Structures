package wbvr.dataStructures.linkedList;

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

    @Override
    public String toString() {
        return data.toString();
    }
}
