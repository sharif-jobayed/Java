package problems;

import java.util.Map;

public class StreamAPI {

    // Sort the given Map by Values
    public Map<Integer, String> sortByValues(Map<Integer, String> aMap) {
        aMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(v -> System.out.println("The fruit is: "+v.getKey() + " " + v.getValue()));

        return aMap;
    }

}
