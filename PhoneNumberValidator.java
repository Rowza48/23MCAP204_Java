package javaprogram;

import java.util.Scanner; 
class InvalidPhoneNumberException extends Exception {
public InvalidPhoneNumberException(String message) {
super(message);
}
}
public class PhoneNumberValidator {
public static void validatePhoneNumber(String phoneNumber) throws
InvalidPhoneNumberException {
if (!phoneNumber.matches("\\d{10}")) { // Checks if it has exactly 10 digits
throw new InvalidPhoneNumberException("Invalid phone number! It must contain exactly 10 digits.");
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your phone number: ");
String phoneNumber = scanner.nextLine();
scanner.close();
try {
validatePhoneNumber(phoneNumber);
System.out.println("Phone number is valid.");
} catch (InvalidPhoneNumberException e) {
System.out.println("Error: " + e.getMessage());
}
}
}
