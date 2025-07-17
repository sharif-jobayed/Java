package problems;

import java.util.Arrays;

public class PlayWithArrays {

    // Find the largest number in the given Array
    public int findLargestNum(int[] intArr) {
        int max = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        System.out.println("The largest number in the Arrays is: " + max);
        return max;
    }

    // Sort the given Array
    public int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("The Arrays now is: " + Arrays.toString(arr));
        return arr;
    }

    // Reverse the given Array
    public int[] reverseArray(int[] arr) {
        if(arr == null) {
            return null;
        }

        int[] reversed = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Current index is: "+(arr.length - 1 - i));
            reversed[i] = arr[arr.length - 1 - i];
        }

        System.out.println("The reversed Array is: "+ Arrays.toString(reversed));
        return reversed;
    }

}
