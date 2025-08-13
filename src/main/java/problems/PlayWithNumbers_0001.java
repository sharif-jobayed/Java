package problems;

public class PlayWithNumbers_0001 {

    // Get the total of the digits of a number
    public Integer totalOfDigits(Integer number) {
        int total = 0;
        String numAsStr = String.valueOf(number);

        for (int i = 0; i < numAsStr.length(); i++) {
            char chrDgt = numAsStr.charAt(i);
            total += Integer.parseInt(String.valueOf(chrDgt));
        }

        System.out.println("The total of the digits is: " + total);
        return total;
    }

}
