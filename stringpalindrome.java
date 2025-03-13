package labcycle;

import java.util.Scanner;

public class stringpalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        
        String rev = new StringBuilder(str).reverse().toString();
        
        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
