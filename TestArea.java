import java.util.Scanner;
public class TestArea {
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter Length:");
		int length = o.nextInt();
		System.out.println("Enter Breadth:");
		int breadth = o.nextInt();
		
		if(length == breadth) {
			System.out.println("Area of Square: "+length*length);
		}
		else {
			System.out.println("Area of Rectangle: "+length*breadth);
		}
		o.close();
	}
}
