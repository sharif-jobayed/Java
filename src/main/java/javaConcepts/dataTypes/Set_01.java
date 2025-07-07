package javaConcepts.dataTypes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Set_01 {
    private Set<Integer> setWithDefaultValues_01;
    private Set<Integer> setWithNoDefaults;
    private Set<Integer> setWithDefaultValues_02;

    public Set_01() {
        this.setWithDefaultValues_01 = new HashSet<>(Arrays.asList(5, 9, 97, 6, 3, 1, 4, 6, 3, 5, 8, 7, 4, 6, 9, 8, 5, 8, 4));
        this.setWithNoDefaults = new HashSet<>();
        this.setWithDefaultValues_02 = new HashSet<>(Set.of(1,2,3,4));
    }

    public Set_01 setSetWithNoDefaults() {
        for (int i = 0; i < 15; i++) {
            this.setWithNoDefaults.add(i);
        }
        return this;
    }

    public Set<Integer> setSetWithDefaultValues_01(Integer number) {
        this.setWithDefaultValues_01.add(number);
        return this.setWithDefaultValues_01;
    }

    public Set<Integer> setSetWithDefaultValues_02(Integer number) {
        this.setWithDefaultValues_01.add(number);
        return this.setWithDefaultValues_01;
    }

    public Set<Integer> getSetWithDefaultValues_01() {
        return this.setWithDefaultValues_01;
    }

    public Set<Integer> getSetWithNoDefaults() {
        return this.setWithNoDefaults;
    }

    public Set<Integer> getSetWithDefaultValues_02() {
        return this.setWithDefaultValues_02;
    }

    public Set<Integer> getSortedSetWithDefaultValues_01() {
        Stream<Integer> newSet = this.setWithDefaultValues_01.stream().sorted();
        return newSet.collect(Collectors.toSet());
    }

    public Set<Integer> getSortedSetWithDefaultValues_02() {
        Stream<Integer> aStream = this.setWithDefaultValues_02.stream();
        return aStream.collect(Collectors.toSet());
    }
}
