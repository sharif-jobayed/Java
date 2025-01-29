package javaConcepts.dataTypes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Set_01 {
    private Set<Integer> setWithDefaultValues_01;
    private Set<Integer> setWithNoDefaults;

    public Set_01() {
        this.setWithDefaultValues_01 = new HashSet<>(Arrays.asList(5,9,97,6,3,1,4,6,3,5,8,7,4,6,9,8,5,8,4));
        this.setWithNoDefaults = new HashSet<>();
    }

    public Set_01 setSetWithNoDefaults() {
        for (int i = 0; i < 15; i++) {
            this.setWithNoDefaults.add(i);
        }
        return this;
    }

    public Set<Integer> getSetWithDefaultValues_01() {
        return this.setWithDefaultValues_01;
    }

    public Set<Integer> getSetWithNoDefaults() {
        return this.setWithNoDefaults;
    }

    public Set<Integer> getSortedSetWithDefaultValues() {
        Stream<Integer> newSet = this.setWithDefaultValues_01.stream().sorted();
        return newSet.collect(Collectors.toSet());
    }
}
