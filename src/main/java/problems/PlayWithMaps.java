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

}
