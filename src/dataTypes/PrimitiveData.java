package dataTypes;

public class PrimitiveData {
    private byte byteValue;
    private short shortValue;
    private int intValue;
    private long longValue;
    private float floatValue;
    private double doubleValue;
    private char charValue;
    private boolean booleanValue;

    public PrimitiveData() {
        this.byteValue = 100;
        this.shortValue = 10000;
        this.intValue = 100000;
        this.longValue = 10000000000L;
        this.floatValue = 20.5f;
        this.doubleValue = 123.456;
        this.charValue = 'A';
        this.booleanValue = true;
    }

    public byte getByteValue() {
        return byteValue;
    }

    public short getShortValue() {
        return shortValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public long getLongValue() {
        return longValue;
    }

    public float getFloatValue() {
        return floatValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public char getCharValue() {
        return charValue;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }
}
