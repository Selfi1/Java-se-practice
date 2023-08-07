package pl.globallogic.excercises.basic;

import java.util.Scanner;





public class NumberSum {

    public static int SumOfDigits(int number) {
        int temp = 0;
        int sumOfDigits = 0;
        if (number < 0) {
            temp = -number;
        } else {
            temp = number;
        }
        if (temp == 0) {
            return 0;
        }
        while (temp > 9) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        sumOfDigits += temp;

        // temp = 555
        // sum += 5, suma+=5


        return sumOfDigits;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pass an number: ");
        int num = scanner.nextInt();
        System.out.println(SumOfDigits( num ));



    }
}
