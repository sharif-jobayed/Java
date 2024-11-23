package commonDS_01;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue_DS {
    private Queue<Integer> integerQueue;

    public Queue_DS() {
        this.integerQueue = new LinkedList<>(List.of(1, 2, 654, 6, 1465, 151, 35, 135, 1));
    }

    /*-------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        Queue_DS queueDs = new Queue_DS();

        // integerQueue
        queueDs.integerQueue.offer(110);
        System.out.println("The items in the integerQueue are: " + queueDs.integerQueue);

        Integer qPeek = queueDs.integerQueue.peek();
        System.out.println("The item from the integerQueue is: " + qPeek);

        queueDs.integerQueue.poll();
        System.out.println("The items in the integerQueue are: " + queueDs.integerQueue);

    }
}
