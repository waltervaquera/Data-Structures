package wbvr.dataStructures.stack;

import wbvr.dataStructures.interfaces.IRunner;

public class StackRunner implements IRunner {
    @Override
    public void run() {
        LinkedListStack<String> stack = new LinkedListStack<>();
        System.out.println("Stack size: " + stack.size());
//      print menu
//      read inputs
        stack.push("ewe");
        stack.push("owo");
        stack.push("uwu");
        stack.print();
        System.out.println("Stack size: " + stack.size());
        stack.pop();
        stack.print();
        System.out.println("Stack size: " + stack.size());
    }
}
