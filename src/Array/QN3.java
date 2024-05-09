package Array;

public class QN3 {
	static void oddnumbers() {
		int odd[] = new int[100];
		for(int i=0; i<odd.length; i++) {
			if(i%2!=0) {
				odd[i]=i;
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
