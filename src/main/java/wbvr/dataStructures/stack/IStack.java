package wbvr.dataStructures.stack;

public interface IStack<T> {
    void push(T e);
    T pop();
    T top();
    boolean isEmpty();
    int size();
}
