package problems;

import java.util.Arrays;

public class StringManipulations {

    // Sort the given String
    public String sortString(String aString) {
        if (aString == null || aString.isEmpty()) {
            System.out.println("The sentence is empty");
            return aString;
        }

        char[] aStringArr = aString.toCharArray();
        Arrays.sort(aStringArr);
        System.out.println("The sorted word/sentence is: " + Arrays.toString(aStringArr));
        return Arrays.toString(aStringArr);
    }

    // Reverse sort the given String
    public String reverseSortAString(String aString) {
        if (aString == null || aString.isEmpty()) {
            System.out.println("The sentence is empty");
            return aString;
        }

        char[] aStringArr = aString.toCharArray();
        Arrays.sort(aStringArr);

        StringBuilder aStrBuilder = new StringBuilder();

        for (int i = aStringArr.length - 1; i >= 0; i--) {
            aStrBuilder.append(aStringArr[i]);
        }

        System.out.println("The reversed String is: " + aStrBuilder);
        return aStrBuilder.toString();

    }

    // Reverse the given String manually
    public String reverseString(String aString) {
        if (aString == null || aString.isEmpty()) {
            System.out.println("The sentence is empty");
            return aString;
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = aString.length() - 1; i >= 0; i--) {
            reversed.append(aString.charAt(i));
        }

        System.out.println("The manual reversed string is: " + reversed);
        return reversed.toString();
    }

    // Make a random word/sentence from the given String
    public String makeRandomStrings(String aString) {
        StringBuilder randomString = new StringBuilder();
        int randNum = (int) Math.round(Math.random() * aString.length());

        for (int i = 0; i < randNum; i++) {
            randomString.append(aString.charAt(randNum));
        }

        System.out.println("The random word/sentence is: " + randomString.toString());
        return aString;
    }


}
