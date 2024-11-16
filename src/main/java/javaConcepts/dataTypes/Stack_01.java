package javaConcepts.dataTypes;

import java.util.Stack;

public class Stack_01 {
    private Stack unspecificStack_01 = new Stack();
    private Stack<Integer> intStack_01 = new Stack<>();

    public void pushToStack() {
        for (int i = 0; i < 5; i++) {
            unspecificStack_01.push(i + 1);
        }

        System.out.println("The stack is now: " + unspecificStack_01);
    }

    public void peekFromStack() {
        Object latestObject = unspecificStack_01.peek();
        System.out.println("It peeked "+ latestObject+ " & the stack is now "+unspecificStack_01);
        System.out.println("The stack is now: "+ unspecificStack_01);
    }

    public void popFromStack() {
        unspecificStack_01.pop();
        System.out.println("The stack is now: "+ unspecificStack_01);
    }

    public Boolean isStackEmpty() {
        Boolean isEmpty = unspecificStack_01.empty();
        System.out.println("Is the stack empty? "+isEmpty);
        return unspecificStack_01.empty();
    }
}
