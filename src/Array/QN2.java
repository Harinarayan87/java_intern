package Array;
import java.util.Scanner;
public class QN2 {
	static void cities() {
		String[] cities = new String[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of 6 cities");
		for(int i=0;i<cities.length;i++) {
			cities[i]=sc.nextLine();
		
		}
		System.out.println("The name of 6 Cities are:");
	    for(int i=0;i<cities.length;i++) {
	    	System.out.println(cities[i]);
	    	sc.close();
	    }
	}
		
	public static void main(String[] args) {
	cities();
			
	}
}
