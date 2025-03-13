package labcycle;
import java.util.Scanner;

	public class vowels {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a line of text: ");
	        String text = scanner.nextLine().toLowerCase(); 
	        
	        int vowels = 0, consonants = 0;
	        
	      
	        String vowelsSet = "aeiou";

	        for (char ch : text.toCharArray()) {
	            if (Character.isLetter(ch)) { 
	                if (vowelsSet.indexOf(ch) != -1) {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }
	        System.out.println("Number of vowels: " + vowels);
	        System.out.println("Number of consonants: " + consonants);
	        
	        scanner.close();
	    }
	}