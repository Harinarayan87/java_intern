package Array;

import java.util.Scanner;

public class QN1 {
	
	static void calculateaverage() {
		int[] books = new int[10];
		int total = 0;
		int average = 0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<books.length; i++) {
		System.out.println("Enter the price of  Book"+i );
		books[i] =sc.nextInt();
		}
		for(int i=0; i<books.length; i++) {
	    total=total+books[i];
	    average=total/books.length;
	    sc.close();
		}
		System.out.println("The total price of 10 books is: "+total);
	    System.out.println("The average price of 10 books is: "+average);
		}
	
public static void main(String[] args) {
	calculateaverage();
}
}
