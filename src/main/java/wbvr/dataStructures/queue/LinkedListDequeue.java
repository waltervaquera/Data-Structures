package wbvr.dataStructures.queue;

import wbvr.dataStructures.linkedList.DoublyLinkedList;

public class LinkedListDequeue<T> implements IDequeue<T>{
    private final DoublyLinkedList<T> list = new DoublyLinkedList<>();
    @Override
    public void addFirst(T t) { list.addFirst(t);}

    @Override
    public void addLast(T t) { list.addLast(t);}

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            System.out.println("Queue is empty, there is no elements to remove.");
            return null;
        }
        T first = first();
        list.removeFirst();
        return first;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            System.out.println("Queue is empty, there is no elements to remove.");
            return null;
        }
        T last = last();
        list.removeLast();
        return last;
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
    public T last() {
        if (isEmpty()) {
            System.out.println("Queue is empty, there is no last element.");
            return null;
        }
        return list.last().getData();
    }

    @Override
    public int size() { return list.size(); }

    @Override
    public boolean isEmpty() { return list.isEmpty(); }
    public void print() { list.print(); }
}
