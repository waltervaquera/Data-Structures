package wbvr.dataStructures.stack;

import wbvr.dataStructures.linkedlist.LinkedList;

public class LinkedListStack<T> implements IStack<T> {
    private final LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T t) {
        list.addFirst(t);
    }

    @Override
    public T pop() {
        var first = top();
        list.removeFirst();
        return first;
    }

    @Override
    public T top() {
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
