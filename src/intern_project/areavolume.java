package intern_project;

public class areavolume {
static int getArea(int length,int breadth) {
int area= length*breadth;	
return area;
}
public static void main(String[] args) {
	int length= 5;
	int breadth= 3;
	int area = getArea(length, breadth);
	System.out.println("Area of the given is: "+area);
}


}
