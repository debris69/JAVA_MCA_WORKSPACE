import java.util.Scanner;
class NotMultipleOfHundredException extends Exception{
	NotMultipleOfHundredException(String s){
		super(s);
	}
}
class CheckedException{
	CheckedException() throws Exception{
		throw new Exception("Checked Exception");
	}
}
class ATM{
	ATM() throws NotMultipleOfHundredException{ 
		Scanner o = new Scanner(System.in);
		System.out.println("Enter amount to withdraw in multiples of 100:");
		int am = o.nextInt();
		if(am%100 != 0) {
			throw new NotMultipleOfHundredException("Invalid Entry - Unchecked Exception");
		}
		else {
			System.out.println("Thank You");
		}
	}
}
public class ThrowThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			new ATM();
		}
		catch(Exception e){
			System.out.println(e.getMessage()); 
		}
		
	}

}
