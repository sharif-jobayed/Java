package dataTypes;

public class GenericData_02<T extends Number> {
    private T gData;

    public GenericData_02(T gData) {
        this.gData = gData;
    }

    public void setData(T data) {
        this.gData = data;
    }

    public T getGData() {
        return this.gData;
    }
}
