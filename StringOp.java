import java.util.Scanner;
import java.util.Arrays;
public class StringOp {
	
	static void upperCase(String s) {
		s = s.toUpperCase();
		System.out.println(s);
	}
	static void alphaSort(String s) {
		char tArr[] = s.toCharArray();
		Arrays.sort(tArr);
		s = new String(tArr);
		System.out.println(s);
	}
	static void checkSub(String s) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter Substring:");
		String sub = o.nextLine();
		if(s.contains(sub)) {
			System.out.println("Substring found!");
		}
		else {
			System.out.println("Substring not found!");
		}
		o.close();
	}
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = o.nextLine();
		
		System.out.println("Available operations:");
		System.out.println("1. Convert Uppercase");
		System.out.println("2. Alphabetically sort");
		System.out.println("3. Check Substring");
		System.out.println("Enter Choice:");
		
		int option = o.nextInt();
		switch(option) {
		case 1:
			upperCase(s);
			break;
		case 2:
			alphaSort(s);
			break;
		case 3:
			checkSub(s);
			break;
		default:
			System.out.println("Invalid input1");
		}	
		o.close();
	}
	
}
