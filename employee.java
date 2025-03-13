package labcycle;
import java.util.Scanner;

	public class employee {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter job role (Manager/Developer/Intern): ");
	        String role = scanner.nextLine().trim();
	        
	      
	        System.out.print("Enter years of experience: ");
	        int experience = scanner.nextInt();
	        
	        double salary = 0;
	        
	       
	        switch (role.toLowerCase()) {
	            case "manager":
	                salary = 50000;
	                break;
	            case "developer":
	                salary = 30000;
	                break;
	            case "intern":
	                salary = 15000;
	                break;
	            default:
	                System.out.println("Invalid role entered.");
	                scanner.close();
	                return;
	        }
	        
	        
	        double bonus = 0;
	        if (experience >= 3 && experience <= 5) {
	            bonus = salary * 0.10; 
	        } else if (experience > 5) {
	            bonus = salary * 0.20; 
	        }
	        
	        double totalSalary = salary + bonus;
	        
	        System.out.println("Base Salary: " + salary);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Total Salary: " + totalSalary);
	        
	        scanner.close();
	    }
	}
