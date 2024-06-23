package dataTypes;

import java.util.List;

public class JavaNonPrimitives {
    private final String stringValue;
    private final List<Integer> integerList;

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

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        JavaNonPrimitives javaNonPrimitives = new JavaNonPrimitives("Example String", integers);
        javaNonPrimitives.displayNonPrimitiveValues();
    }
}
