package intern_project;
import java.util.Scanner;

public class calculatetotalsalary {
	
	  public static double calculateTotalSalary(String post, double basicSalary, double bonusPercentage) {
	        // Calculate bonus amount
	        double bonus = (basicSalary * bonusPercentage) / 100;
	        // Calculate total salary
	        double totalSalary = basicSalary + bonus;
	        return totalSalary;
	    }
	
	    public static void main(String[] args) {
	        // Calculate total salary for MD
	        double mdSalary = calculateTotalSalary("MD", 230000, 20);
	        System.out.println("Total salary for MD: " + mdSalary);
	        
	        // Calculate total salary for CEO
	        double ceoSalary = calculateTotalSalary("CEO", 250000, 25.79);
	        System.out.println("Total salary for CEO: " + ceoSalary);
	        
	        // Calculate total salary for MANAGER
	        double managerSalary = calculateTotalSalary("MANAGER", 176000, 16);
	        System.out.println("Total salary for MANAGER: " + managerSalary);
	        
	        // Calculate total salary for HELPER
	        double helperSalary = calculateTotalSalary("HELPER", 145900, 9);
	        System.out.println("Total salary for HELPER: " + helperSalary);
	    }
	    
	  
	}


