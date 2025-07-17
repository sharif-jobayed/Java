package problems;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("X----------------------------------StringManipulations starts----------------------------------X");

        StringManipulations rs1 = new StringManipulations();
        rs1.sortString("How are you?");
        rs1.reverseSortAString("Hey there!");
        rs1.reverseString("Hello!");
        rs1.makeRandomStrings("Hello!");


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

        stAPI1.sortByValues(fruits);


        System.out.println("X-----------------------------------StreamAPI ends-----------------------------------X");


        System.out.println("X----------------------------------PlayWithArrays starts----------------------------------X");

        PlayWithArrays pwA1 = new PlayWithArrays();

        int[] anArr0001 = {5,8,76,3,75,3};
        pwA1.findLargestNum(anArr0001);
        pwA1.sortArray(anArr0001);
        pwA1.reverseArray(anArr0001);

        System.out.println("X-----------------------------------PlayWithArrays ends-----------------------------------X");


        System.out.println("X----------------------------------PlayWithLists starts----------------------------------X");



        System.out.println("X-----------------------------------PlayWithLists ends-----------------------------------X");

    }

}
