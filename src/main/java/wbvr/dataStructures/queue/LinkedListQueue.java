package wbvr.dataStructures.queue;

import wbvr.dataStructures.linkedlist.LinkedList;

public class LinkedListQueue<T> implements IQueue<T>{
    private final LinkedList<T> list = new LinkedList<>();
    @Override
    public void enqueue(T t) {
        list.addLast(t);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, there is no elements to dequeue.");
            return null;
        }
        T first = first();
        list.removeFirst();
        return first;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            System.out.println("Queue is empty, there is no first element.");
            return null;
        }
        return list.first().getData();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }
    public void print() { list.print(); }
}
