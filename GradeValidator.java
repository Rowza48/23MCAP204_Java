package javaprogram;

import java.util.Scanner;
// Custom exception for invalid grades
class InvalidGradeException extends Exception {
public InvalidGradeException(String message) {
super(message);
}
}
public class GradeValidator {
public static void validateGrade(char grade) 
 throws InvalidGradeException {
// Check if grade is between 'A' and 'F'
if (grade < 'A' || grade > 'F') {
throw new InvalidGradeException("Invalid grade! Grade must be between 'A' and 'F'.");
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter student's grade (A-F): ");
char grade = scanner.next().charAt(0);
scanner.close();
try
{
validateGrade(grade);
System.out.println("Grade '" + grade + "' is valid.");
} catch (InvalidGradeException e) {

System.out.println("Error: " + e.getMessage());
}
}

