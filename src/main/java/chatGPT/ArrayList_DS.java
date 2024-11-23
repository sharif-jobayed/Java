package chatGPT;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_DS {
    private ArrayList<Integer> integerArrayList_01;
    private ArrayList<Integer> integerArrayList_02;

    public ArrayList_DS() {
        this.integerArrayList_01 = new ArrayList<>();
        this.integerArrayList_02 = new ArrayList<>(Arrays.asList(5,3153,1,531,351,35,135,1435,1));
    }

    private void setIntegerArrayList_01() {
        for(int i = 0; i < 25; i++) {
            this.integerArrayList_01.add(i);
        }
    }

    /*-------------------------------------------------------------------------------------------------*/

    public static void main(String[] args) {
        ArrayList_DS arrayListDs = new ArrayList_DS();

        // integerArrayList_01
        arrayListDs.setIntegerArrayList_01();
        System.out.println("The items in the integerArrayList_01 are: "+arrayListDs.integerArrayList_01);

        // integerArrayList_02
        System.out.println("The items in the integerArrayList_02 are: "+arrayListDs.integerArrayList_02);
    }
}
