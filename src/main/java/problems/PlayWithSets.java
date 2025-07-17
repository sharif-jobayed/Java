package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PlayWithSets {

    public Integer[] listAsUnique(Integer[] arr) {

        Set<Integer> intSet = new HashSet<>(Arrays.asList(arr));

        System.out.println("The unique values are: "+ Arrays.toString(intSet.toArray()));
        return intSet.toArray(Integer[]::new);
    }

}
