package wbvr.dataStructures.queue;

import wbvr.dataStructures.interfaces.IRunner;

public class QueueRunner implements IRunner {
    @Override
    public void run() {
        LinkedListDequeue<String> queue = new LinkedListDequeue<>();
        System.out.println("Queue size: " + queue.size());
//      print menu
//      read inputs
        queue.addFirst("ewe");
        queue.addLast("owo");
        queue.addFirst("uwu");
        queue.print();
        System.out.println("Queue size: " + queue.size());
        queue.removeFirst();
        queue.print();
        System.out.println("Queue size: " + queue.size());
        queue.removeLast();
        queue.print();
        System.out.println("Queue size: " + queue.size());
    }
}
