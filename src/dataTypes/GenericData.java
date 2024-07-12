package dataTypes;

public class GenericData<T> {
    private T gData;

    public GenericData(T gData) {
        this.gData = gData;
    }

    public T getGData() {
        return this.gData;
    }

    public void setGData(T gData) {
        this.gData = gData;
    }
}
