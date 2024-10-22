import conditionals.IfElse;
import dataTypes.GenericData_01;
import dataTypes.NonPrimitiveData;
import dataTypes.PrimitiveData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Primitive data types
        PrimitiveData primitiveData = new PrimitiveData();
        System.out.println("The byte value is: " + primitiveData.getByteValue());
        System.out.println("The short value is: " + primitiveData.getShortValue());
        System.out.println("The int value is: " + primitiveData.getIntValue());
        System.out.println("The long value is: " + primitiveData.getLongValue());
        System.out.println("The float value is: " + primitiveData.getFloatValue());
        System.out.println("The double value is: " + primitiveData.getDoubleValue());
        System.out.println("The char value is: " + primitiveData.getCharValue());
        System.out.println("The boolean value is: " + primitiveData.isBooleanValue());

        System.out.println("X---------------------X---------------------X");

        // Non-Primitive data types
        NonPrimitiveData nonPrimitiveData = new NonPrimitiveData();
        System.out.println("The String value is: " + nonPrimitiveData.getStringValue());
        System.out.println("The Integer value is: " + nonPrimitiveData.getIntegerValue());
        System.out.println("The Double value is: " + nonPrimitiveData.getDoubleValue());
        System.out.println("The Boolean value is: " + nonPrimitiveData.getBooleanValue());
        System.out.println("The intArray value is: " + Arrays.toString(nonPrimitiveData.getIntArray()));
        System.out.println("The ArrayList value is: " + nonPrimitiveData.getArrayList());
        System.out.println("The HashSet value is: " + nonPrimitiveData.getHashSet());
        System.out.println("The ArrayListGeneric value is: " + nonPrimitiveData.getArrayListGeneric());
        System.out.println("The LinkedList value is: " + nonPrimitiveData.getLinkedList());
        System.out.println("The HashMapGeneric value is: " + nonPrimitiveData.getHashMapGeneric());
        System.out.println("The HashMap value is: " + nonPrimitiveData.getHashMap());
        nonPrimitiveData.is829InTheList();
        System.out.println("The Set of predefined Integer is: "+nonPrimitiveData.getSetOfPreDefinedIntegers());

        System.out.println("X---------------------X---------------------X");

        IfElse ifElse = new IfElse();
        ifElse.checkDataType(nonPrimitiveData.getStringValue());
        System.out.println("Current Data Type: " + ifElse.getCurrentDataType());

        System.out.println("X---------------------X---------------------X");

        GenericData_01<List<Integer>> genericData_01 = new GenericData_01<>(new ArrayList<>(5));

        genericData_01.getGData().add(1);
        genericData_01.getGData().add(2);
        genericData_01.getGData().add(3);
        genericData_01.getGData().add(4);
        genericData_01.getGData().add(5);

        List<Integer> dataList = genericData_01.getGData();
        System.out.println("Data in the list: " + dataList);

        dataList.add(6);
        genericData_01.setGData(dataList);

        System.out.println("Modified data in the list: " + genericData_01.getGData());
    }
}
