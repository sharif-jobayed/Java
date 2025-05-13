package javaConcepts.typeJuggling;

import com.sun.jdi.InvalidTypeException;

public class Random_0001 {
    String text_01;
    String text_02;
    Integer num_01;
    int num_02;

    public Random_0001() {
        this.text_01 = "Hello!";
        this.text_02 = "18.587";
        this.num_01 = 122;
        this.num_02 = 197;
    }

    public int strToInt(String text) {
        return Integer.parseInt(text);
    }

    public double strToDbl(String text) {
        return Double.parseDouble(text);
    }

    public long strToLng(String text) {
        return Long.parseLong(text);
    }

    public long intToLng(int number) {
        return (long) number;
    }

    public String integerToString(Integer number) {
        return String.valueOf(number);
    }

    public String doubleToString(Double number) {
        return String.valueOf(number);
    }

    public Integer intToInteger(int number) {
        Integer n = Integer.valueOf(number);
        if (n instanceof Integer) {
            return n;
        }
        try {
            throw new InvalidTypeException("Not an Integer");
        } catch (InvalidTypeException e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    public static void main(String[] args) {
        Random_0001 random0001 = new Random_0001();

        System.out.println(random0001.intToLng(12));
        System.out.println(random0001.intToInteger(random0001.num_02));
    }

}
