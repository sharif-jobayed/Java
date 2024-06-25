package dataTypes;

import java.util.*;

public class NonPrimitiveData {
    private String stringValue;
    private Integer integerValue;
    private Double doubleValue;
    private Boolean booleanValue;
    private int[] intArray;
    private ArrayList<String> arrayList;
    private Set<String> hashSet;
    private List<Integer> arrayListGeneric;
    private LinkedList<String> linkedList;
    private Map<Integer, String> hashMapGeneric = new HashMap<>();
    private HashMap<String, Integer> hashMap = new HashMap<>();

    public NonPrimitiveData() {
        this.stringValue = "Hello, World!";
        this.integerValue = 999999999;
        this.doubleValue = 999999999.9999999;
        this.booleanValue = false;
        this.intArray = new int[]{1, 2, 3, 4, 5};
        this.arrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        this.hashSet = new HashSet<>(Arrays.asList("One", "Two", "Three"));
        this.arrayListGeneric = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        this.linkedList = new LinkedList<>(Arrays.asList("Linked", "List", "Example"));
        this.hashMap.put("One", 1);
        this.hashMap.put("Two", 2);
        this.hashMap.put("Three", 3);
        this.hashMapGeneric.put(4, "Four");
        this.hashMapGeneric.put(5, "Five");
        this.hashMapGeneric.put(6, "Six");
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
