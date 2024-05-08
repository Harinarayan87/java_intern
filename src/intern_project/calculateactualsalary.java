package intern_project;

public class calculateactualsalary {
    // Method to calculate total salary based on basic salary and bonus percentage
    public static void calculateTotalSalary(double basicSalary, double bonusPercentage) {
        double totalSalary = basicSalary * (1 + bonusPercentage / 100); // Calculate total salary
        System.out.println("Total salary: " + totalSalary); // Print total salary
    }

    public static void main(String[] args) {
        // Define arrays for post names, basic salaries, and bonus percentages
        String[] posts = {"MD", "CEO", "MANAGER", "HELPER"};
        double[] basicSalaries = {230000, 250000, 176000, 145900};
        double[] bonusPercentages = {20, 25.79, 16, 9};

        // using loop to pass the value automatically according to post
        for (int i = 0; i < posts.length; i++) {
            System.out.print("Total salary for " + posts[i] + ": "); // Print post name
            calculateTotalSalary(basicSalaries[i], bonusPercentages[i]); // Call method to calculate total salary
        }
    }
}
