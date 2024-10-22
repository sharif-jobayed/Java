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
    private List<Integer> listOfPreDefinedIntegers = new ArrayList<>(Arrays.asList(11, 15, 18, 880, 721, 572, 97, 83, 111));
    private Set<Integer> setOfPreDefinedIntegers = new HashSet<>(Arrays.asList(5153, 165, 1635, 15, 1351, 631, 51, 351, 531, 58, 4658, 9784, 87));




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

        this.hashMapGeneric.put(1, "Four");
        this.hashMapGeneric.put(2, "Five");
        this.hashMapGeneric.put(3, "Six");

        this.hashMap.put("One", 1);
        this.hashMap.put("Two", 2);
        this.hashMap.put("Three", 3);

        this.listOfPreDefinedIntegers.add(521);
        this.listOfPreDefinedIntegers.add(628);
        this.listOfPreDefinedIntegers.add(58);
        this.listOfPreDefinedIntegers.add(92);

        this.setOfPreDefinedIntegers.add(511);
        this.setOfPreDefinedIntegers.add(83);
    }




    public String getStringValue() {
        return this.stringValue;
    }

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    public int[] getIntArray() {
        return this.intArray;
    }

    public ArrayList<String> getArrayList() {
        return this.arrayList;
    }

    public Set<String> getHashSet() {
        return this.hashSet;
    }

    public List<Integer> getArrayListGeneric() {
        return this.arrayListGeneric;
    }

    public LinkedList<String> getLinkedList() {
        return this.linkedList;
    }

    public Map<Integer, String> getHashMapGeneric() {
        return this.hashMapGeneric;
    }

    public HashMap<String, Integer> getHashMap() {
        return this.hashMap;
    }

    public Boolean is829InTheList() {
        if (this.listOfPreDefinedIntegers.contains(829)) {
            System.out.println("The ListOfPreDefinedIntegers has the value 829.");
            return true;
        }
        System.out.println("The ListOfPreDefinedIntegers does not have the value 829");
        return false;
    }

    public Set<Integer> getSetOfPreDefinedIntegers() {
        return this.setOfPreDefinedIntegers;
    }
}
