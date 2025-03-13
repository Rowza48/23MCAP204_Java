package labcycle;

import java.util.Scanner;

public class amstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int a = number;
        int numDigits = 0;
        while (a > 0) {
            a /= 10;
            numDigits++;
        }
        a = number;
        int sum = 0;
        while (a > 0) {
            int digit = a % 10;
            sum += Math.pow(digit, numDigits);
            a /= 10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
