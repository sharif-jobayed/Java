package commonDS_01;

import java.util.*;
import java.util.stream.Stream;

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

        Stream<Integer> sortedQ_01 = queueDs.integerQueue.stream().sorted();
        System.out.println("The sorted integerQueue is now: " + Arrays.toString(sortedQ_01.toArray()));

        Stream<Integer> reverseSortedQ_01 = queueDs.integerQueue.stream().sorted(Comparator.reverseOrder());
        System.out.println("The reverse sorted integerQueue is now: " + Arrays.toString(reverseSortedQ_01.toArray()));
    }
}
