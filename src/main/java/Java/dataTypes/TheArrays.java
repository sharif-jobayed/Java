package Java.dataTypes;

public class TheArrays {

    private int[] numbersArray_01;
    private int[] numbersArray_02;

    public TheArrays() {
        numbersArray_01 = new int[5];
        numbersArray_02 = new int[]{1, 2, 3, 4, 5};
    }

    private void makeArray_01 () {
        numbersArray_01[0] = 1;
        numbersArray_01[1] = 2;
        numbersArray_01[2] = 3;
        numbersArray_01[3] = 4;
        numbersArray_01[4] = 5;
    }
    public int[] getNumbersArray_01 () {
        makeArray_01();
        return numbersArray_01;
    }
    public int[] getNumbersArray_02 () {
        return numbersArray_02;
    }

}
