package intern_project;
import java.util.Scanner;

public class Switchcase {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the operator
	        System.out.print("Enter operator (+, -, *, /): ");
	        char op = scanner.next().charAt(0);

	        // Prompt the user to enter two integer values
	        System.out.print("Enter first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int num2 = scanner.nextInt();

	        // Variable to store the result
	        int result;

	        // Perform the operation based on the operator using switch
	        switch (op) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Sum of two number is: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Subtraction of two number is: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Multiplication of two number is: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Division of two number is: " + result);
	                } else {
	                    System.out.println("Error! Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Error! Invalid operator.");
	        }

	       
	        scanner.close();
	    }
	}



