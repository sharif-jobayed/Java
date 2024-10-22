package oop;

public interface Interface_001 {
    String myStringInInterface_001 = "A String";
    Integer myIntegerInInterface_001 = 22;
    Long myLongInInterface_001 = 111L;

    default String getMyStringInInterface_001() {
        return myStringInInterface_001;
    };

    Integer getMyIntegerInInterface_001();

    Long setMyLongInInterface_001(Long newLong);
}
