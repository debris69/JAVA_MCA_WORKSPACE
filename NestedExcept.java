import java.util.Scanner;
public class NestedExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.println("Enter Numerator:");
		int i = o.nextInt();
		System.out.println("Enter Denominator:");
		int j=1;
		String s = o.next();
		try {
			j = Integer.parseInt(s);
			try {
				System.out.println(i/j);
			}
			catch(ArithmeticException e) {
				System.out.println("Exception Found: "+e.getMessage());
			}
		}
		catch(NumberFormatException e) {
			System.out.println("Exception Found: "+e.getMessage());
		}
		finally {
			o.close();
			System.out.println("Thank You");
		}
		
		
	}

}
