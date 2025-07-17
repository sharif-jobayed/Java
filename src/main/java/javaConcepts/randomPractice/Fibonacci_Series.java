package javaConcepts.randomPractice;

public class Fibonacci_Series {
    public void generateFibonacciSeries(int count) {
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci Series of " + count + " numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
}
