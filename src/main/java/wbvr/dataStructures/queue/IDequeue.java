package wbvr.dataStructures.queue;

public interface IDequeue<T> {
    void addFirst(T t);
    void addLast(T t);
    T removeFirst();
    T removeLast();
    T first();
    T last();
    int size();
    boolean isEmpty();
}
