package conditionals;

public class IfElse {
    Values values;

    public IfElse() {
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

    public Boolean isSame() {
        return this.values.string_0003.equals(this.values.string_0004);
    }

    public Integer getDifference() {
        if (this.values.integer_0003.equals(this.values.integer_0004)) {
            return 0;
        } else {
            if (this.values.integer_0003 > this.values.integer_0004) {
                return this.values.integer_0003 - this.values.integer_0004;
            } else {
                return this.values.integer_0004 - this.values.integer_0003;
            }
        }
    }
}
