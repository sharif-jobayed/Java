// Problem: Given a list of double values, calculate their average.

package javaConcepts.randomPractice;

import java.util.List;

public class ListAverage_0001 {
    private List<Double> dblValues_01;

    public ListAverage_0001(List<Double> dblValues_01) {
        this.dblValues_01 = dblValues_01;
    }

    public Double getAverage() {
        Double total = 0.00;

        for(Double dbl:this.dblValues_01) {
            total+=dbl;
        }

        return total / this.dblValues_01.size();
    }
}
