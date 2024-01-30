package wbvr.dataStructures;

import wbvr.dataStructures.interfaces.IRunner;
import wbvr.dataStructures.linkedlist.LinkedListRunner;

public class RunnerFactory {
    public static IRunner getManager(String structureID) {
        if (structureID.equals("A")) {
            return new LinkedListRunner();
        }
        return new NullRunner();
    }
}
