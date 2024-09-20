package dataTypes;

public class GenericData_01<T> {
    private T gData;

    // Constructor
    public GenericData_01(T gData) {
        this.gData = gData;
    }

    // Setter
    public void setGData(T gData) {
        this.gData = gData;
    }

    // Getter
    public T getGData() {
        return this.gData;
    }
}
