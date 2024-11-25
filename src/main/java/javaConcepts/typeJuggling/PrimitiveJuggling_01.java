package javaConcepts.typeJuggling;

public class PrimitiveJuggling_01 {
    private byte byte_01;
    private short short_01;
    private int int_01;
    private long long_01;
    private float float_01;
    private double double_01;

    public PrimitiveJuggling_01() {
        this.byte_01 = 99;
        this.short_01 = 9999;
        this.int_01 = 999999999;
        this.long_01 = 999999999999999999L;
        this.float_01 = 9999999999.999999999F;
        this.double_01 = 999999999999.9999999999999999999999;
    }

    public byte getByte_01() {
        return this.byte_01;
    }

    public short getShort_01() {
        return this.short_01;
    }

    public int getInt_01() {
        return this.int_01;
    }

    public long getLong_01() {
        return this.long_01;
    }

    public float getFloat_01() {
        return this.float_01;
    }

    public double getDouble_01() {
        return this.double_01;
    }

    /*------------------------------------------------------------------------------------*/

    public short getByteToShort() {
        return (short) getByte_01();
    }

    public int getShortToInt() {
        return (int) getShort_01();
    }

    public long getIntToLong() {
        return (long) getInt_01();
    }

    public float getLongToFlt() {
        return (float) getLong_01();
    }

    public double getFloatToDbl() {
        return (double) getFloat_01();
    }

    public int dblToInt() {
        return (int) getDouble_01();
    }
}
