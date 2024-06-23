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
    }
}
