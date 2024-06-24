package conditionals;

public class IfElse {
    Values values;

    public IfElse() {
        this.values = new Values(
                "Hello",
                12,
                true,
                "OK",
                58,
                false
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
