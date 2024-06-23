import dataTypes.JavaNonPrimitives;
import dataTypes.JavaPrimitives;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JavaPrimitives javaPrimitives = new JavaPrimitives(42, 3.14, true, 'A');
        javaPrimitives.displayPrimitiveValues();

        JavaNonPrimitives javaNonPrimitives = new JavaNonPrimitives("Hello, World!", Arrays.asList(1, 2, 3, 4, 5));
        javaNonPrimitives.displayNonPrimitiveValues();
    }
}
