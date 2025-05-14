package javaConcepts.typeJuggling;

import com.sun.jdi.InvalidTypeException;

public class Random_0001 {
    String text_01;
    String text_02;
    String text_03;
    Integer num_01;
    int num_02;

    public Random_0001() {
        this.text_01 = "Hello!";
        this.text_02 = "18.587";
        this.text_03 = "712";
        this.num_01 = 122;
        this.num_02 = 197;
    }

    public String getText_01() {
        return text_01;
    }

    public String getText_02() {
        return text_02;
    }

    public String getText_03() {
        return text_03;
    }

    public Integer getNum_01() {
        return num_01;
    }

    public int getNum_02() {
        return num_02;
    }

    public int strToInt(String text) {
        try{
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Can not parse an int from the String");
        }
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
}
