package javaConcepts.randomPractice;

public class Concatinations {
    private Integer integer_0001;
    private Double double_0001;
    private String string_0001;

    public Concatinations() {
        this.integer_0001 = 100;
        this.double_0001 = 100.10;
        this.string_0001 = "Rajib";
    }

    public String concatIntegerAndString() {
        return this.integer_0001+this.string_0001;
    }

    public double concatIntegerAndDouble() {
        return this.integer_0001+this.double_0001;
    }
}
