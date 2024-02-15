package wbvr.dataStructures.doublyLinkedList;

public class DoublyLinkedList<T> implements IDoublyLinkedList<T> {
    private final DoubleEdgeNode<T> head;
    private final DoubleEdgeNode<T> tail;

    public DoublyLinkedList() {
        DoubleEdgeNode<T> head = new DoubleEdgeNode<>(null);
        DoubleEdgeNode<T> tail = new DoubleEdgeNode<>(null);
        head.next = tail;
        tail.prev = head;
        this.head = head;
        this.tail = tail;
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
        }

        int size = 0;
        DoubleEdgeNode<T> current = head.next;
        while (current != tail) {
            size++;
            current = current.next;
        }

        return size;
    }

    @Override
    public boolean isEmpty() {
        return head.next == tail;
    }

    @Override
    public DoubleEdgeNode<T> first() {
        return head.next;
    }

    @Override
    public DoubleEdgeNode<T> last() {
        DoubleEdgeNode<T> current = head.next;
        while (current != tail) {
            if (current.next == tail) {
                return current;
            }
            current = current.next;
        }

        return null;
    }

    @Override
    public void addFirst(T data) {
        DoubleEdgeNode<T> newNode = new DoubleEdgeNode<>(data);
        newNode.prev = head;
        newNode.next = head.next;

        head.next = newNode;
        newNode.next.prev = newNode;
    }

    @Override
    public void addLast(T data) {
        DoubleEdgeNode<T> newNode = new DoubleEdgeNode<>(data);
        newNode.next = tail;
        newNode.prev = tail.prev;

        tail.prev = newNode;
        newNode.prev.next = newNode;
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Doubly Linked List is empty, there is no elements to remove.");
            return;
        }

        head.next = head.next.next;
        head.next.prev = head;
    }

    @Override
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Doubly Linked List is empty, there is no elements to remove.");
            return;
        }

        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
    }

    public void print() {
        DoubleEdgeNode<T> current = head.next;
        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
