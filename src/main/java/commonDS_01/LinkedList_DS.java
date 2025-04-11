package commonDS_01;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList_DS {
    private LinkedList<Integer> integerLinkedList_01;
    private LinkedList<Integer> integerLinkedList_02;

    public LinkedList_DS() {
        this.integerLinkedList_01 = new LinkedList<>();
        this.integerLinkedList_02 = new LinkedList<>(Arrays.asList(351,31,35,153,1,351,531,351,351,352));
    }

    private void setIntegerLinkedList_01() {
        for(int i = 0; i < 15; i++) {
            // Add items to the list
            this.integerLinkedList_01.add(i);
        }

        // Remove last item from the list
        this.integerLinkedList_01.removeLast();

        // Add item in the last of the list
        this.integerLinkedList_01.addLast(3700);
    }

    /*-------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        LinkedList_DS linkedListDs = new LinkedList_DS();

        // integerLinkedList_01
        linkedListDs.setIntegerLinkedList_01();
        System.out.println("The items in the integerLinkedList_01 are: "+linkedListDs.integerLinkedList_01);

        // integerLinkedList_02
        System.out.println("The items in the integerLinkedList_02 are: "+linkedListDs.integerLinkedList_02);
    }
}
