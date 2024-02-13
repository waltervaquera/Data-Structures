package wbvr.dataStructures;

import wbvr.dataStructures.linkedList.LinkedListRunner;
import wbvr.dataStructures.queue.QueueRunner;
import wbvr.dataStructures.stack.StackRunner;

public class RunnerFactory {
    public static IRunner getManager(String structureID) {
        if (structureID.equals("A")) {
            return new LinkedListRunner();
        }
        if (structureID.equals("B")) {
            return new StackRunner();
        }
        if (structureID.equals("C")) {
            return new QueueRunner();
        }
        return new NullRunner();
    }
}
