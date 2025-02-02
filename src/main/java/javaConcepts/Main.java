package javaConcepts;


import javaConcepts.conditionals.IfElse;
import javaConcepts.dataTypes.*;
import javaConcepts.typeJuggling.PrimitiveJuggling_01;

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
        System.out.println("The Set of predefined Integer is: " + nonPrimitiveData.getSetOfPreDefinedIntegers());

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
        System.out.println(dataList.getClass()); // Checks the data type

        dataList.add(6);
        genericData_01.setGData(dataList);

        System.out.println("Modified data in the list: " + genericData_01.getGData());

        System.out.println("X---------------------X---------------------X");

        Array_1D array1D = new Array_1D();
        array1D.getIntegerArray_01(1, 2, 3, 4, 5);
        array1D.getIntegerArray_02();

        System.out.println("X---------------------X---------------------X");

        Array_2D array2D = new Array_2D();
        array2D.getIntegerArray_03();

        System.out.println("X---------------------X---------------------X");

        List_01 list01 = new List_01();
        list01.getUnSpecificList_01();
        list01.getIntList_01(5, 547, 8, 563, 4, 4658, 3, 51, 78);

        System.out.println("X---------------------X---------------------X");

        Stack_01 stack01 = new Stack_01();
        stack01.pushToStack();
        stack01.peekFromStack();
        stack01.popFromStack();
        stack01.isStackEmpty();

        System.out.println("X---------------------X---------------------X");

        PrimitiveJuggling_01 typeJugglingSet01 = new PrimitiveJuggling_01();

        System.out.println("The byte is: " + typeJugglingSet01.getByte_01());
        System.out.println("The short is: " + typeJugglingSet01.getShort_01());
        System.out.println("The int is: " + typeJugglingSet01.getInt_01());
        System.out.println("The long is: " + typeJugglingSet01.getLong_01());
        System.out.println("The float is: " + typeJugglingSet01.getFloat_01());
        System.out.println("The double is: " + typeJugglingSet01.getDouble_01());

        System.out.println("The byte to short is: " + typeJugglingSet01.getByteToShort());
        System.out.println("The short to int is: " + typeJugglingSet01.getShortToInt());
        System.out.println("The int to long is: " + typeJugglingSet01.getIntToLng());
        System.out.println("The long to float is: " + typeJugglingSet01.getLongToFlt());
        System.out.println("The float to double is: " + typeJugglingSet01.getFloatToDbl());

        System.out.println("The double to int is:" + typeJugglingSet01.dblToInt());

        System.out.println("X---------------------X---------------------X");

        Set_01 set_01 = new Set_01();
        set_01.setSetWithNoDefaults();

        System.out.println("The set with default values is: " + set_01.getSetWithDefaultValues_01());
        System.out.println("The sorted set with default values is: " + set_01.getSortedSetWithDefaultValues());

        set_01.setSetWithDefaultValues_01(500);
        System.out.println("New setWithDefaultValues_01 is: "+set_01.getSetWithDefaultValues_01());

        System.out.println("X---------------------X---------------------X");


    }
}
