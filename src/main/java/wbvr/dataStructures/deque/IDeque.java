package wbvr.dataStructures.deque;

public interface IDeque<T> {
    void addFirst(T t);
    void addLast(T t);
    T removeFirst();
    T removeLast();
    T first();
    T last();
    int size();
    boolean isEmpty();
}
