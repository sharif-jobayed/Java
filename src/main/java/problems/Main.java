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

        StreamAPI sa1 = new StreamAPI();
        Map<Integer, String> fruits = new HashMap<>(Map.of(
                1, "Apple",
                2, "Banana",
                3, "Orange",
                4, "Pineapple"
        ));
        fruits.put(5, "Lemon");

        sa1.sortByValues(fruits);


        System.out.println("X-----------------------------------StreamAPI ends-----------------------------------X");

    }

}
