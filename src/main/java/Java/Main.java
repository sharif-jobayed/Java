package Java;

import Java.dataTypes.TheArrays;
import Java.dataTypes.Primitives;

public class Main {
    public static void main(String[] args) {

        // Primitives
        Primitives primitives = new Primitives();
        System.out.println(primitives.getFloat_01());
        System.out.println(primitives.getDouble_01());
        System.out.println(primitives.getDouble_02());
        System.out.println(primitives.isBoolean_01());

        // TheArrays
        TheArrays theArrays = new TheArrays();
        System.out.println(java.util.Arrays.toString(theArrays.getNumbersArray_01()));
        System.out.println(java.util.Arrays.toString(theArrays.getNumbersArray_02()));
    }
}
