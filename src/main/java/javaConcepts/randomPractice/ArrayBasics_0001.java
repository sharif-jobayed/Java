// Problem: Given an array of integers, calculate the sum of all its elements.

package javaConcepts.randomPractice;

public class ArrayBasics_0001 {
    private int[] intArray;

    public ArrayBasics_0001(int[] intArray) {
        this.intArray = intArray;
    }

    public int getSum() {
        int total = 0;

        for(int i:this.intArray) {
            total +=i;
            System.out.println("Current total is: "+total);
        }

        return total;
    }
}

