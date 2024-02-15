package wbvr.dataStructures.stack;

import wbvr.dataStructures.linkedList.LinkedList;

public class LinkedListStack<T> implements IStack<T> {
    private final LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T t) {
        list.addFirst(t);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, there is no elements to remove.");
            return null;
        }

        T first = top();
        list.removeFirst();
        return first;
    }

    @Override
    public T top() {
        if (isEmpty()) {
            System.out.println("Stack is empty, there is no top element.");
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
