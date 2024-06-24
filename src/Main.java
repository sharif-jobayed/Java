import conditionals.IfElse;
import conditionals.SwitchCase;
import dataTypes.JavaNonPrimitives;
import dataTypes.JavaPrimitives;

public class Main {
    public static void main(String[] args) {
        // Java Primitives
        JavaPrimitives myPrimitives = new JavaPrimitives();
        System.out.println(myPrimitives.getInt_0001());
        System.out.println(myPrimitives.getFloat_0001());
        System.out.println(myPrimitives.getDouble_0001());
        System.out.println(myPrimitives.isBoolean_0001());

        // Java Non-Primitives
        JavaNonPrimitives myNonPrimitives = new JavaNonPrimitives();
        System.out.println(myNonPrimitives.getString_0002());
        System.out.println(myNonPrimitives.getInteger_0002());
        System.out.println(myNonPrimitives.getFloat_0002());
        System.out.println(myNonPrimitives.getDouble_0002());
        System.out.println(myNonPrimitives.isBoolean_0002());
        System.out.println(myNonPrimitives.getList_0002());
        System.out.println(myNonPrimitives.getArrayList_0002());

        // If Else
        IfElse ifElse = new IfElse();
        System.out.println(ifElse.isSame());
        System.out.println(ifElse.getDifference());

        // Switch Case
        SwitchCase switchCase = new SwitchCase();
        System.out.println(switchCase.isEqualTo(12));
    }
}
