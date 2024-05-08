package intern_project;

import java.util.Scanner;

public class calculatetotalsalary {

    // Method to calculate total salary based on basic salary and bonus percentage
    public static double calculateTotalSalary(double basicSalary, double bonusPercentage) {
        // Calculate bonus amount
        double bonus = (basicSalary * bonusPercentage) / 100;
        // Calculate total salary
        return basicSalary + bonus;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Array containing different job positions
        String[] posts = {"MD", "CEO", "MANAGER", "HELPER"};

        // using loop for taking input of basic salary and percentage from different post
        //loop is initiated according to post
        for (int i = 0; i < posts.length; i++) {
           //for basic salary
            System.out.println("Enter basic salary for " + posts[i] + ":");
            double basicSalary = scanner.nextDouble();

            // for bonus percentage
            System.out.println("Enter bonus percentage for " + posts[i] + ":");
            double bonusPercentage = scanner.nextDouble();

            // Calculate and Print the total salary for the current runnning loop 
            double totalSalary = calculateTotalSalary(basicSalary, bonusPercentage);
            System.out.println("Total salary for " + posts[i] + ": " + totalSalary);
        }

        
        scanner.close();
    }
}
