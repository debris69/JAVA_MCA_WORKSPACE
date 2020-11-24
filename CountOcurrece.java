import java.util.Scanner;
public class CountOcurrece {

	@SuppressWarnings("resource")
	static void countOccurrence() throws Exception {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter Character");
		String c = o.nextLine();
		if(c.length()!=1) {
			throw new Exception("Invalid length!! Enter single character");
		}
		System.out.println("Enter String:");
		String s = o.nextLine();
		
		int count = 0;
		int len = s.length();
		
		for(int i=0; i<len; i++) {
			if(c.charAt(0)==s.charAt(i)) {
				System.out.println(c+" found at position "+i);
				count += 1;
			}
		}
		
		System.out.println("Total occurence: "+count);
		o.close();
	}
	public static void main(String[] args) {
	boolean check = true;
	int att = 0;
	int maxAtt = 3;
	while(check == true) {
		try {
			att += 1;
			countOccurrence();
			check = false;
		}
		catch(Exception e) {
			if(att==maxAtt) {
				System.out.println("Maxed out on attempts");
				check = false;
			}
			else {
				System.out.println(e.getMessage());
				System.out.println("Attempt Number: "+(att+1)+"(Max "+maxAtt+" attempts)");
			}
				
		}
	}
}
}
