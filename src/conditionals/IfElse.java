package conditionals;

import dataTypes.NonPrimitiveData;
import dataTypes.PrimitiveData;

public class IfElse {
    private PrimitiveData primitives;
    private NonPrimitiveData nonPrimitives;
    private Object currentDataType;

    public IfElse() {
        this.primitives = new PrimitiveData();
        this.nonPrimitives = new NonPrimitiveData();
        this.currentDataType = "";
    }

    public Object checkDataType(Object value) {
        if (value instanceof String) {
            return ((String) value).getBytes();
        } else {
            System.out.println("The "+value+" is not a String");
        }
        return null;
    }

    public Object getCurrentDataType() {
        return currentDataType;
    }
}
