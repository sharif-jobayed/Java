package problems;

import java.util.*;
import java.util.stream.Collectors;

public class PlayWithLists {

    // Find the even numbers in the given List
    public List<Integer> isEven(Integer[] integerArr) {

        List<Integer> theEvensList = new ArrayList<>();

        for (int i = 0; i < integerArr.length; i++) {
            if (i % 2 == 0) {
                theEvensList.add(i);
            }
        }

        System.out.println("The evens in the list are: " + theEvensList);
        return theEvensList;
    }

    // Sort the given List
    public List<Integer> sortAList(List<Integer> integerList) {
        System.out.println("The sorted list is: " + integerList.stream().sorted().toList());
        return integerList.stream().sorted().toList();
    }

    // Reverse sort the given List
    public List<Integer> reverseSortAList(List<Integer> numList) {
        List<Integer> reversed = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("The reversed list is: " + reversed);
        return reversed;
    }

}
