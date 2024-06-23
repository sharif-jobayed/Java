package dataTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaNonPrimitives {
    private String string_0002;
    private Integer integer_0002;
    private Float float_0002;
    private Double double_0002;
    private Boolean boolean_0002;
    private List<Integer> list_0001;
    private ArrayList<String> arrayList_0002;

    public JavaNonPrimitives() {
        this.string_0002 = "Sharif Banda codes Java";
        this.integer_0002 = 999999999;
        this.float_0002 = 999999.999999999F;
        this.double_0002 = 999999.999999999;
        this.boolean_0002 = false;
        this.list_0001 = List.of(5, 46, 49, 18, 27, 78, 69);
        this.arrayList_0002 = new ArrayList<>(Arrays.asList("Nissan", "Toyota", "Mazda", "Mitsubishi"));
    }

    public String getString_0002() {
        return string_0002;
    }

    public Integer getInteger_0002() {
        return integer_0002;
    }

    public Float getFloat_0002() {
        return float_0002;
    }

    public Double getDouble_0002() {
        return double_0002;
    }

    public Boolean isBoolean_0002() {
        return boolean_0002;
    }

    public Integer getList_0001() {
        for (int i : list_0001) {
            System.out.println(i);
        }
        return 0;
    }

    public String getArrayList_0002() {
        for (int i = 0; i < arrayList_0002.size(); i++) {
            System.out.println(arrayList_0002.get(i));
        }
        return "";
    }
}
