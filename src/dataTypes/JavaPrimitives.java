package dataTypes;

public class JavaPrimitives {
    private final int intValue;
    private final double doubleValue;
    private final boolean booleanValue;
    private final char charValue;

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

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public void displayPrimitiveValues() {
        System.out.printf("Primitive Data Types:%nint: %d%ndouble: %.2f%nboolean: %b%nchar: %c%n",
                intValue, doubleValue, booleanValue, charValue);
    }

    public static void main(String[] args) {
        JavaPrimitives primitives = new JavaPrimitives(10, 20.5, true, 'A');
        primitives.displayPrimitiveValues();
    }
}
