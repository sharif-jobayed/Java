package dataTypes;

public class GenericData<T> {
    private T gData;

    // Constructor
    public GenericData(T gData) {
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
