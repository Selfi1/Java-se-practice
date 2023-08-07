package pl.globallogic.excercises.basic;

import java.util.Scanner;

public class DigitCounter {
    /*
    * Count the digits in the rational number
    * 13456 - 5
    * 89 -2
    * -45 - -1
    *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to count its digits: ");
        int number = scanner.nextInt();
        System.out.println("digit count for " + number + " is equal to " + numberOfDigits(number));
/*        System.out.println(numberOfDigits(13456) == 5);
        System.out.println(numberOfDigits(89662435) == 8);
        System.out.println(numberOfDigits(80000435) == 7);
        System.out.println(numberOfDigits(-189) == -1);*/
    }
    private static int numberOfDigits(int targetNumber) {
        if ( targetNumber < 0 )
            return -1;
        int counter = 0;
        while (targetNumber > 0){
            targetNumber = targetNumber / 10;
            counter++;

        }
        return counter;
    }

}
