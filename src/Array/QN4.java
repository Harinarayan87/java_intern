package Array;

public class QN4 {
	static void evennumbers() {
		int even[] = new int[50];
		int n=0;
		for(int i=0; i<100; i++) {
			if(i%2==0) {
				even[n]=i;
				n++;
			}}
		System.out.println("Even Numbers from 0 to 100 are:");	
		for(int i=0; i<even.length; i++) {
			System.out.println(even[i]);
		}
	}
	
	public static void main(String[] args) {
		evennumbers();
	}

}
