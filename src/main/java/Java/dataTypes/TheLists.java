package Java.dataTypes;

import java.util.Arrays;
import java.util.List;

public class TheLists {

    private List<Integer> integerList_01;
    public TheLists() {
        integerList_01 = Arrays.asList(1, 2, 3, 4, 5);
    }

    public List<Integer> getIntegersFromList () {
        return integerList_01;
    }

}
