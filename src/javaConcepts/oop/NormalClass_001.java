package oop;

public class NormalClass_001 extends AbstructClass_001 implements Interface_001 {
    public NormalClass_001(String str, Integer integer) {
        super(str, integer);
    }

    @Override
    public String getMyStringInInterface_001() {
        System.out.println(myStringInInterface_001);
        return Interface_001.super.getMyStringInInterface_001();
    }

    @Override
    public Integer getMyIntegerInInterface_001() {
        return myIntegerInInterface_001;
    }

    @Override
    public Long setMyLongInInterface_001(Long newLong) {
//        return myLongInInterface_001 = newLong;
        return newLong;
    }

    @Override
    public void setMyStringInAbstructClass_001(String myStringInAbstructClass_001) {

    }

    @Override
    public void setMyIntegerInAbstructClass_001(Integer myIntegerInAbstructClass_001) {

    }
}
