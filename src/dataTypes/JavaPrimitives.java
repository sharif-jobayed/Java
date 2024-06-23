package dataTypes;

public class JavaPrimitives {
    private int intValue;
    private double doubleValue;
    private boolean booleanValue;
    private char charValue;

    public JavaPrimitives(int intValue, double doubleValue, boolean booleanValue, char charValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.booleanValue = booleanValue;
        this.charValue = charValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void displayPrimitiveValues() {
        System.out.println("Primitive Data Types:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("boolean: " + booleanValue);
        System.out.println("char: " + charValue);
    }
}
