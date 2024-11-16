package javaConcepts.dataTypes;

import java.util.Arrays;

public class Array_1D {
    private Integer[] integerArray_01 = new Integer[5];
    private Integer[] integerArray_02 = {6, 7, 8, 9, 10};

    public Integer[] getIntegerArray_01(Integer... myIntegers) {
        // Set values to integerArray_01
        try {
            for (int i = 0; i < myIntegers.length; i++) {
                integerArray_01[i] = myIntegers[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Array_1D "+e.getMessage());
        }

        // Display & return the integerArray_01
        System.out.println("The IntegerArray_01 is: " + Arrays.toString(integerArray_01));
        return integerArray_01;
    }

    public Integer[] getIntegerArray_02() {
        System.out.println("The IntegerArray_02 is: " + Arrays.toString(integerArray_02));
        return integerArray_02;
    }
}
