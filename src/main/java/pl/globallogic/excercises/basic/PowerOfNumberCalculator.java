package pl.globallogic.excercises.basic;

import java.util.Scanner;

public class PowerOfNumberCalculator {

    // calculate number in certain power
    // num = 10, power = 3 -> 1000
    // num = -5, power = 4 -> 625
    // num = 7,  power = 0 -> 1

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target base: ");
        int base = scanner.nextInt();
        System.out.println("Enter target power: ");
        int power = scanner.nextInt();
        System.out.println("Number " + base + " in power " + power + " is equal to " + calculatePower(base,power));


    }

    public static long calculatePower(int base, int power) {
        if(power < 0) return 0;
        if(power == 0) return 1;
        int result = 1;
        for (int i =1;i <= power; i++) {
            result *= base;

        }
        return result;

    }
}
