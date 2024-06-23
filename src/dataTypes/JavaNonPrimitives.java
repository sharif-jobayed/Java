package dataTypes;

import java.util.List;

public class JavaNonPrimitives {
    private String stringValue;
    private List<Integer> integerList;

    public JavaNonPrimitives(String stringValue, List<Integer> integerList) {
        this.stringValue = stringValue;
        this.integerList = integerList;
    }

    public String getStringValue() {
        return stringValue;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void displayNonPrimitiveValues() {
        System.out.println("Non-Primitive Data Types:");
        System.out.println("String: " + stringValue);
        System.out.println("List of Integers: " + integerList);
    }
}
