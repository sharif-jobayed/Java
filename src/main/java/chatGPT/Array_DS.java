package chatGPT;

import java.util.Arrays;

public class Array_DS {
    private Integer[] arrayDS_01;
    private Integer[][] twoDArrayDS_01;
    private Integer[] arrayDS_02;
    private Integer[][] twoDArrayDS_02;

    public Array_DS() {
        this.arrayDS_01 = new Integer[5];
        this.twoDArrayDS_01 = new Integer[2][3];

        this.arrayDS_02 = new Integer[]{15, 5, 435, 3, 13, 51, 535, 54, 3, 514};
        this.twoDArrayDS_02 = new Integer[][]{
                new Integer[]{1, 2, 3, 4},
                new Integer[]{5, 6, 7, 8},
                new Integer[]{9, 10, 11, 12}
        };
    }

    private void setArrayDS_01(Integer a, Integer b, Integer c, Integer d, Integer e) {
        this.arrayDS_01[0] = a;
        this.arrayDS_01[1] = b;
        this.arrayDS_01[2] = c;
        this.arrayDS_01[3] = d;
        this.arrayDS_01[4] = e;
    }

    private void setTwoDArrayDS_01(Integer a, Integer b, Integer c, Integer d, Integer e, Integer f) {
        this.twoDArrayDS_01[0][0] = a;
        this.twoDArrayDS_01[0][1] = b;
        this.twoDArrayDS_01[0][2] = c;
        this.twoDArrayDS_01[1][0] = d;
        this.twoDArrayDS_01[1][1] = e;
        this.twoDArrayDS_01[1][2] = f;
    }

    /*-------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        Array_DS arrayDs = new Array_DS();

        // arrayDS_01
        arrayDs.setArrayDS_01(135, 153, 153, 153, 1);
        System.out.println("The items in the arrayDS_01 are: " + Arrays.toString(arrayDs.arrayDS_01));

        // twoDArrayDS_01
        arrayDs.setTwoDArrayDS_01(53, 153, 143, 13, 51, 351);
        for (int k = 0; k < arrayDs.twoDArrayDS_01.length; k++) {
            Integer[] na_02 = arrayDs.twoDArrayDS_01[k];
            System.out.println("The items in the na_02 are: " + Arrays.toString(na_02));

            for (int l = 0; l < na_02.length; l++) {
                System.out.println("The item in the na_02[l] is: " + na_02[l]);
            }
        }

        // arrayDS_02
        System.out.println("The items in the arrayDS_02 are: " + Arrays.toString(arrayDs.arrayDS_02));

        // twoDArrayDS_02
        for (int i = 0; i < arrayDs.twoDArrayDS_02.length; i++) {
            Integer[] na_01 = arrayDs.twoDArrayDS_02[i];
            System.out.println("The items in the twoDArrayDS_02[i] are: " + Arrays.toString(na_01));

            for (int j = 0; j < na_01.length; j++) {
                System.out.println("The item in the na_01[j] is: " + na_01[j]);
            }
        }
    }
}
