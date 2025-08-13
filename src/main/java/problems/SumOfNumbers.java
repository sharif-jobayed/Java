package problems;

public class SumOfNumbers {

    // Get the total of the digits of a number
    public Integer totalOfANumber(Integer number) {
        int total = 0;
        String numAsStr = String.valueOf(number);

        for (int i = 0; i < numAsStr.length(); i++) {
            Character chrDgt = numAsStr.charAt(i);
            total += Integer.parseInt(String.valueOf(chrDgt));
        }

        System.out.println("The total of the digits is: " + total);
        return total;
    }

}
