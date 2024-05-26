package Java;

import Java.dataTypes.Arrays;
import Java.dataTypes.Primitives;

public class Main {
    public static void main(String[] args) {

        // Primitives
        Primitives primitives = new Primitives();
        System.out.println(primitives.getFloat_01());
        System.out.println(primitives.getDouble_01());
        System.out.println(primitives.getDouble_02());
        System.out.println(primitives.isBoolean_01());

        // Arrays
        Arrays arrays = new Arrays();
        System.out.println(java.util.Arrays.toString(arrays.getNumbersArray_01()));
    }
}
