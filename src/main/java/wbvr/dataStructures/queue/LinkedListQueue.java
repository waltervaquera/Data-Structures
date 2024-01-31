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
        var first = first();
        list.removeFirst();
        return first;
    }

    @Override
    public T first() {
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
