package javaConcepts.dataTypes;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Map_01 {
    private final Map<Integer, String> numberMap_0001;

    public Map_01(Map<Integer, String> initialMap) {
        this.numberMap_0001 = new HashMap<>(initialMap);
    }

    public Map<Integer, String> getNumberMap_0001() {
        return Map.copyOf(this.numberMap_0001);
    }

    public void addEntry(Integer key, String value) {
        this.numberMap_0001.put(key, value);
    }

    public String getValuesAsString() {
        if (this.getNumberMap_0001().isEmpty()) {
            return "";
        }
        return this.getNumberMap_0001().values()
                .stream()
                .collect(Collectors.joining(", "));
    }

    public Boolean searchAValue(String value) {
        for(Map.Entry<Integer, String> entry:this.getNumberMap_0001().entrySet()) {
            if(entry.getValue().equals(value)) {
                System.out.println("The value is found at index: "+entry.getKey());
                return true;
            } else {
                System.out.println("The value is not found");
            }
        }
        return false;
    }
}