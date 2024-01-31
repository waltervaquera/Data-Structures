package wbvr.dataStructures.queue;

import wbvr.dataStructures.interfaces.IRunner;
import wbvr.dataStructures.stack.LinkedListStack;

public class QueueRunner implements IRunner {
    @Override
    public void run() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        System.out.println("Queue size: " + queue.size());
//      print menu
//      read inputs
        queue.enqueue("ewe");
        queue.enqueue("owo");
        queue.enqueue("uwu");
        queue.print();
        System.out.println("Queue size: " + queue.size());
        queue.dequeue();
        queue.print();
        System.out.println("Queue size: " + queue.size());
    }
}
