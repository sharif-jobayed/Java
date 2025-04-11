package commonDS_01;

import java.util.Stack;

public class Stack_DS {
    private Stack<Integer> stack_01;

    public Stack_DS() {
        this.stack_01 = new Stack<>();
    }

    private void setStack_01() {
        for(int i = 0; i < 10; i++) {
            this.stack_01.push(i);
        }
    }
    /*-------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        Stack_DS stackDs = new Stack_DS();

        // stack_01
        stackDs.setStack_01();
        System.out.println("The items in the stack_01 are: "+stackDs.stack_01);

        int stackPeek_01 = stackDs.stack_01.peek();
        System.out.println("The peek from the stack_01 is: "+stackPeek_01);

        stackDs.stack_01.pop();
        int stackPeek_02 = stackDs.stack_01.peek();
        System.out.println("The peek from the stack_01 is: "+stackPeek_02);
    }
}
