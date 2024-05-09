package Array;

public class QN5 {
	
	static void totalmarks() {
		int total = 0;
		float percentage = 0;
		 String	subjects[] = {"Math","English","Nepali","Computer","Science"};
		 int marks[] = {99,80,87,88,69};
		 for(int i=0; i<marks.length; i++) {
		 total += marks[i];
	}
		 System.out.println("Marks of the Subjects");
		 for(int j=1; j<marks.length; j++) {
		 System.out.println(subjects[j]+"="+marks[j]);
		 }
		 percentage = (total * 100)/500;
		 System.out.println("Total Marks of 5 Subjects:"+total);
		 System.out.println("Percentage:"+percentage+" %");
		 }
	
public static void main(String[] args) {
	totalmarks();
}
}
