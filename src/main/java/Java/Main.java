package Java;

import Java.dataTypes.TheArrays;
import Java.dataTypes.ThePrimitives;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // ThePrimitives
        ThePrimitives thePrimitives = new ThePrimitives();
        System.out.println(thePrimitives.getFloat_01());
        System.out.println(thePrimitives.getDouble_01());
        System.out.println(thePrimitives.getDouble_02());
        System.out.println(thePrimitives.isBoolean_01());

        // TheArrays
        TheArrays theArrays = new TheArrays();
        for (int i = 0; i < theArrays.getNumbersArray_01().length; i++) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(theArrays.getNumbersArray_02()));
    }
}
