import java.util.Arrays;
import java.util.Scanner;
public class ConditionSt {
	static String alphaSort(String s) {
		char tArr[] = s.toCharArray();
		Arrays.sort(tArr);
		s = new String(tArr);
		return s;
	}
	
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = o.nextLine();
		
		if(s.compareTo(alphaSort(s))==0) {
			System.out.println("String is sorted");
		}
		else {
			System.out.println("String is not sorted");
		}
	}
}
