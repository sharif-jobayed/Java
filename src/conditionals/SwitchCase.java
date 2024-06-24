package conditionals;

public class SwitchCase {
    Values values;

    public SwitchCase() {
        this.values = new Values(
                "Hello!",
                12,
                true,
                "OK",
                58,
                false,
                100.00,
                'R',
                172.54f,
                65435131L,
                (short) 54131,
                (byte) 54135
        );
    }

    public Boolean isEqualTo(int value) {
        return switch (value) {
            case 12 -> values.getInteger_0003().equals(value);
            case 58 -> values.getInteger_0004().equals(value);
            case 100 -> values.getDouble_0005().intValue() == value;
            case 172 -> (int) values.getFloat_0007().floatValue() == value;
            case 65435131 -> values.getLong_0008().intValue() == value;
            case 54131 -> values.getShort_0009().equals((short) value);
            case 123 -> values.getByte_0010().equals((byte) value);
            default -> false;
        };
    }
}
