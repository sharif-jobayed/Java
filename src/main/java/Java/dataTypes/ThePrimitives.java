package Java.dataTypes;

public class ThePrimitives {

    private int number_01;
    private float float_01;
    private double double_01;
    private double double_02;
    private boolean boolean_01;
    private boolean isBoolean_02;

    public ThePrimitives() {
        this.number_01 = 2;
        this.float_01 = 99999.99f;
        this.double_01 = 9999999;
        this.double_02 = 9999999.99;
        this.boolean_01 = true;
        this.isBoolean_02 = false;
    }

    public int getNumber_01() {
        return this.number_01;
    }
    // You may want to add getter methods for other variables if needed
    public float getFloat_01() {
        return this.float_01;
    }
    public double getDouble_01() {
        return this.double_01;
    }
    public double getDouble_02() {
        return this.double_02;
    }
    public boolean isBoolean_01() {
        return this.boolean_01;
    }
    public boolean isBoolean_02() {
        return this.isBoolean_02;
    }
}
