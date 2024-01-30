package wbvr.dataStructures;

import wbvr.dataStructures.interfaces.IRunner;

public class NullRunner implements IRunner {
    @Override
    public void run() {
        System.out.println("Wrong input or manager not implemented yet.");
    }
}
