package problems;

import java.util.HashMap;
import java.util.Map;

public class PlayWithMaps {

    // Count the characters in the given String
    public Map<String, Integer> countCharacters(String text) {

        Map<String, Integer> charsCount = new HashMap<>();

        if(text.isEmpty()) {
            return null;
        }

        for(char c : text.toCharArray()) {
            charsCount.put(String.valueOf(c), charsCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("The characters count is: "+charsCount.toString());
        return charsCount;
    }

}
