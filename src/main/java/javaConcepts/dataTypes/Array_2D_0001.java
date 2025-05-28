package javaConcepts.dataTypes;

import java.util.Arrays;

public class Array_2D_0001 {
    private String[] fruits;
    private String[] vegetables;
    private String[] meats;

    public Array_2D_0001() {
        this.fruits = new String[]{"Apple", "Orange", "Banana", "Grape", "Watermelon"};
        this.vegetables = new String[]{"Potato", "Onion", "Carrot", "Tomato"};
        this.meats = new String[]{"Beef", "Mutton", "Chicken", "Fish"};
    }

    public String[][] get2DArray() {
        return new String[][]{this.fruits, this.vegetables, this.meats};
    }

    public String[] getArray() {
        for (String[] arr1 : this.get2DArray()) {
            System.out.println("Current Array is: " + Arrays.toString(arr1));

            for (String arr2 : arr1) {
                System.out.println("Current String is: " + arr2);
            }

//            return arr1;
        }
        return null;
    }
}
