package intern_project;

import java.util.Scanner;

public class simpleinterest {
	static void input() {
		int p=0,t=0,r=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vlaue of Principle(p):");
		 p = sc.nextInt();
		 System.out.println("Enter the vlaue of Time(t):");
		 t = sc.nextInt();
		 System.out.println("Enter the vlaue of Rate(r):");
		 r = sc.nextInt();
	
	}
	static void processing(int p, int t, int r) {
		int si= (p*t*r)/100;
		int a= p+si;
		
	}
	static void output(int si, int a) {
		System.out.println("The value of Simple Interest is:"+si);
		System.out.println("The value of Amount is:"+a);
	}
	
public static void main(String[] args) {
	
	//calling input method
    
	input();
	
	
}
}
