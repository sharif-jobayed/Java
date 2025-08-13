package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("X----------------------------------StringManipulations starts----------------------------------X");

        StringManipulations sm1 = new StringManipulations();
        sm1.sortString("How are you?");
        sm1.reverseSortAString("Hey there!");
        sm1.reverseString("Hello!");
        sm1.makeRandomStrings("Hello!");
        sm1.getAPartOfAString("Hello World");


        System.out.println("X-----------------------------------StringManipulations ends-----------------------------------X");


        System.out.println("X----------------------------------StreamAPI starts----------------------------------X");

        // StreamAPI

        StreamAPI stAPI1 = new StreamAPI();
        Map<Integer, String> fruits = new HashMap<>(Map.of(
                1, "Apple",
                2, "Banana",
                3, "Orange",
                4, "Pineapple"
        ));
        fruits.put(5, "Lemon");

        System.out.println("The sorted fruites are: " + stAPI1.sortByValues(fruits));
        System.out.println("The reversed sorted fruites are: " + stAPI1.reverseSortByValues(fruits));


        System.out.println("X-----------------------------------StreamAPI ends-----------------------------------X");


        System.out.println("X----------------------------------PlayWithArrays starts----------------------------------X");

        PlayWithArrays pwA1 = new PlayWithArrays();

        int[] anArr0001 = {5, 8, 76, 3, 75, 3};
        pwA1.findLargestNum(anArr0001);
        pwA1.sortArray(anArr0001);
        pwA1.reverseArray(anArr0001);

        System.out.println("X-----------------------------------PlayWithArrays ends-----------------------------------X");


        System.out.println("X----------------------------------PlayWithLists starts----------------------------------X");

        // PlayWithLists

        PlayWithLists pl0001 = new PlayWithLists();

        Integer[] anIntegerArr0001 = {1, 2, 3, 4, 5};
        List<Integer> aList0001 = List.of(68, 7, 6341, 634, 313, 213, 1);
        pl0001.isEven(anIntegerArr0001);
        pl0001.sortAList(aList0001);
        pl0001.reverseSortAList(aList0001);


        System.out.println("X-----------------------------------PlayWithLists ends-----------------------------------X");


        System.out.println("X----------------------------------PlayWithMaps starts----------------------------------X");

        // PlayWithMaps

        PlayWithMaps pwM1 = new PlayWithMaps();
        pwM1.countCharacters("Hello World!");


        Integer[] anIntegerArr0002 = {1, 2, 3, 4, 5, 1, 3, 5};
        pwM1.countRepeatations(anIntegerArr0002);

        System.out.println("X-----------------------------------PlayWithMaps ends-----------------------------------X");


        System.out.println("X----------------------------------PlayWithSets starts----------------------------------X");

        // PlayWithSets

        PlayWithSets pwS1 = new PlayWithSets();

        Integer[] intArr0001 = {1, 1, 2, 2, 3, 4, 5, 6, 6};
        pwS1.listAsUnique(intArr0001);

        System.out.println("X-----------------------------------PlayWithSets ends-----------------------------------X");

        System.out.println("X-----------------------------------PlayWithNumbers_0001 ends-----------------------------------X");

        PlayWithNumbers_0001 pWN01 = new PlayWithNumbers_0001();
        pWN01.totalOfDigits(1234);

        System.out.println("X-----------------------------------PlayWithNumbers_0001 ends-----------------------------------X");

    }

}
