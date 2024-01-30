package wbvr.dataStructures.linkedlist;

public class LinkedList<T> implements ILinkedList<T> {
    Node<T> head;

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int size = 0;
        Node<T> current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Node<T> first() {
        return head;
    }

    @Override
    public Node<T> last() {
        Node<T> current = head;
        while (current != null) {
            if (current.next == null) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void addLast(T data) {
        Node<T> lastNode = last();
        if (lastNode == null) {
            head = new Node<>(data);
            return;
        }
        lastNode.next = new Node<>(data);
    }

    @Override
    public void removeFirst() {

    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
