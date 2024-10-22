package oop;

public abstract class AbstructClass_001 {
    private String myStringInAbstructClass_001;
    private Integer myIntegerInAbstructClass_001;

    public AbstructClass_001(String str, Integer integer) {
        this.myStringInAbstructClass_001 = str;
        this.myIntegerInAbstructClass_001 = integer;
    }

    public String getMyStringInAbstructClass_001() {
        return myStringInAbstructClass_001;
    }

    public abstract void setMyStringInAbstructClass_001(String myStringInAbstructClass_001);

    public Integer getMyIntegerInAbstructClass_001() {
        return myIntegerInAbstructClass_001;
    }

    public abstract void setMyIntegerInAbstructClass_001(Integer myIntegerInAbstructClass_001);
}
