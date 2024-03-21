package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a natural number:");
            int num = scanner.nextInt();

            if (isnNaturalNumbers(num)) {
                System.out.printf("""
                                Properties of %d
                                        even: %b
                                         odd: %b
                                        buzz: %b
                                        duck: %b""",
                        num, !isOdd(num), isOdd(num),
                        isBuzzNumber(num), isDuck(num));
            } else {
                System.out.println("This number is not natural!");
            }
        }
    }

    private static boolean isDuck(int num) {
        int numTrim = num;
        for (int i = 10; i <= num; i *= 10) {
            if (numTrim % 10 == 0) {
                return true;
            }
            numTrim /= 10;
        }
        return false;
    }

    private static boolean isnNaturalNumbers(int num) {
        return num > 0;
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    private static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}
