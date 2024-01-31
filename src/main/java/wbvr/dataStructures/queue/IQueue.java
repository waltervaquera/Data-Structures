package wbvr.dataStructures.queue;

public interface IQueue<T> {
    void enqueue(T t);
    T dequeue();
    T first();
    boolean isEmpty();
    int size();
}
