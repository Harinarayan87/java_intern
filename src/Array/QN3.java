package Array;

public class QN3 {
	static void oddnumbers() {
		int odd[] = new int[50];
		int n=0;
		for(int i=0; i<100; i++) {
			if(i%2!=0) {
				odd[n]=i;
				n++;
			}}
		System.out.println("Odd Numbers from 0 to 100 are:");	
		for(int i=0; i<odd.length; i++) {
			System.out.println(odd[i]);
		}
	}
	
	public static void main(String[] args) {
		oddnumbers();
	}

}

