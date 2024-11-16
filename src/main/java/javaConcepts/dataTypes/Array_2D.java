package javaConcepts.dataTypes;

import java.util.Arrays;

public class Array_2D {
    private Integer[][] integerArray_03 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
    };

    public Integer[][] getIntegerArray_03() {
        for(int i = 0; i< integerArray_03.length; i++) {
            Integer[] integerArray_03_01 = integerArray_03[i];
            System.out.println("The current sub array is: "+ Arrays.toString(integerArray_03_01));

            for(int j = 0; j < integerArray_03_01.length; j++) {
                Integer currentValue = integerArray_03_01[j];
                System.out.println("The current value in the sub array is: "+currentValue);
            }
        }

        return integerArray_03;
    }
}
