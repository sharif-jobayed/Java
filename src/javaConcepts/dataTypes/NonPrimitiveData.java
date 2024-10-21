package dataTypes;

import java.util.*;

public class NonPrimitiveData {
    private final String stringValue;
    private final Integer integerValue;
    private final Double doubleValue;
    private final Boolean booleanValue;
    private final int[] intArray;
    private final ArrayList<String> arrayList;
    private final Set<String> hashSet;
    private final List<Integer> arrayListGeneric;
    private final LinkedList<String> linkedList;
    private final Map<Integer, String> hashMapGeneric = new HashMap<>();
    private final HashMap<String, Integer> hashMap = new HashMap<>();

    public NonPrimitiveData() {
        this.stringValue = "Hello, World!";

        this.integerValue = 999999999;

        this.doubleValue = 999999999.9999999;

        this.booleanValue = false;

        this.intArray = new int[] {1, 2, 3, 4, 5};

        this.arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));

        this.hashSet = new HashSet<>(Arrays.asList("One", "Two", "Three"));

        this.arrayListGeneric = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        this.linkedList = new LinkedList<>(Arrays.asList("Linked", "List", "Example"));

        this.hashMapGeneric.put(1, "Four");
        this.hashMapGeneric.put(2, "Five");
        this.hashMapGeneric.put(3, "Six");

        this.hashMap.put("One", 1);
        this.hashMap.put("Two", 2);
        this.hashMap.put("Three", 3);
    }

    public String getStringValue() {
        return stringValue;
    }

    public Integer getIntegerValue() {
        return integerValue;
    }

    public Double getDoubleValue() {
        return doubleValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public int[] getIntArray() {
        return intArray;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public Set<String> getHashSet() {
        return hashSet;
    }

    public List<Integer> getArrayListGeneric() {
        return arrayListGeneric;
    }

    public LinkedList<String> getLinkedList() {
        return linkedList;
    }

    public Map<Integer, String> getHashMapGeneric() {
        return hashMapGeneric;
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }
}
