package problems;

import java.util.HashMap;
import java.util.Map;

public class PlayWithMaps {

    // Count the characters in the given String
    public Map<Character, Integer> countCharacters(String text) {

        Map<Character, Integer> charsCount = new HashMap<>();

        if(text.isEmpty()) {
            return null;
        }

        for(char k : text.toCharArray()) {
            charsCount.put(k, charsCount.getOrDefault(k, 0) + 1);
        }

        System.out.println("The characters count is: "+charsCount.toString());
        return charsCount;
    }

    public Map<Integer, Integer> countRepeatations(Integer[] arr) {

        Integer[] intArr = new Integer[arr.length];
        Map<Integer, Integer> elCount = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            intArr[i] = arr[i];
            if (intArr[i] == arr[i]) {
                elCount.put(intArr[i], elCount.getOrDefault(intArr[i], 0) + 1);
            }
        }

        System.out.println("Item repeatation counts are: "+ elCount.toString());
        return elCount;

    }

}
