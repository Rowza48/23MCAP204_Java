package labcycle;

import java.util.Scanner; 

public class fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the limit for the Fibonacci sequence: ");
        int limit = scanner.nextInt();

        
        int first = 0, second = 1;

        System.out.println("Fibonacci sequence up to " + limit + ":");
        while (first <= limit) {
            System.out.print(first + " "); 

            
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
