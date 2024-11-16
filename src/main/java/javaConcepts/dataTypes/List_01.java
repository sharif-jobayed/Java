package javaConcepts.dataTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_01 {
    private List unSpecificList_01 = new ArrayList<>();
    private List<Integer> intList_01 = new ArrayList<>();

    public List getUnSpecificList_01() {
        unSpecificList_01.add('c');
        unSpecificList_01.add("abcd");
        unSpecificList_01.add(11);
        unSpecificList_01.add(111.19);
        unSpecificList_01.add(true);
        unSpecificList_01.add(false);
        unSpecificList_01.add(Arrays.toString(new int[] {11, 5, 78, 80}));

        System.out.println("The IntList is: "+ unSpecificList_01);
        return unSpecificList_01;
    }

    public List<Integer> getIntList_01(Integer... myIntegers) {
        for(int myInt:myIntegers) {
            intList_01.add(myInt);
        }
        System.out.println("The current integer list is: "+ intList_01);
        return intList_01;
    }
}
