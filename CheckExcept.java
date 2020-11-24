import java.util.Scanner;
public class CheckExcept {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		
		System.out.println("Enter Numerator:");
		int i = o.nextInt();
		System.out.println("Enter Denominator:");
		int j=1;
		String s = o.next();
		try {
			j = Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println("Exception Found: "+e);
		}
		try {
			System.out.println(i/j);
		}
		catch(Exception e) {
			System.out.println("Exception Found: "+e);
		}
		
		o.close();
		System.out.println("Thank You");
	}

}
