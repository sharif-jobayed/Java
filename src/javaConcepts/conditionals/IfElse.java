package conditionals;


import dataTypes.NonPrimitiveData;
import dataTypes.PrimitiveData;

public class IfElse {
    private PrimitiveData primitives;
    private NonPrimitiveData nonPrimitives;
    private String currentDataType;

    public IfElse() {
        this.primitives = new PrimitiveData();
        this.nonPrimitives = new NonPrimitiveData();
        this.currentDataType = "";
    }

    public void checkDataType(Object value) {
        if (value instanceof Byte) {
            this.currentDataType = "Byte";
        } else if (value instanceof Short) {
            this.currentDataType = "Short";
        } else if (value instanceof Integer) {
            this.currentDataType = "Integer";
        } else if (value instanceof Long) {
            this.currentDataType = "Long";
        } else if (value instanceof Float) {
            this.currentDataType = "Float";
        } else if (value instanceof Double) {
            this.currentDataType = "Double";
        } else if (value instanceof Character) {
            this.currentDataType = "Character";
        } else if (value instanceof Boolean) {
            this.currentDataType = "Boolean";
        } else if (value instanceof String) {
            this.currentDataType = "String";
        } else {
            throw new RuntimeException("Not a valid data type");
        }
    }

    public String getCurrentDataType() {
        return this.currentDataType;
    }
}
