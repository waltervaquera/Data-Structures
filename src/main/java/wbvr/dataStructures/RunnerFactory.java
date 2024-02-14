package wbvr.dataStructures;

import wbvr.dataStructures.binaryTree.BinaryTreeRunner;
import wbvr.dataStructures.doublyLinkedList.DoublyLinkedListRunner;
import wbvr.dataStructures.linkedList.LinkedListRunner;
import wbvr.dataStructures.queue.QueueRunner;
import wbvr.dataStructures.stack.StackRunner;

public class RunnerFactory {
    public static IRunner getRunner(String structureID) {
        return switch (structureID) {
            case "A" -> new LinkedListRunner();
            case "B" -> new DoublyLinkedListRunner();
            case "C" -> new StackRunner();
            case "D" -> new QueueRunner();
            case "E" -> new BinaryTreeRunner();
            case "H" -> new ExitRunner();
            default -> new NullRunner();
        };
    }
}
