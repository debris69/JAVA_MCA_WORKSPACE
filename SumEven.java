import java.util.Scanner;
public class SumEven {
	static void evenSum() {
		@SuppressWarnings("resource")
		Scanner o = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = o.nextInt();
		int s = 0;
		int c = 2;
		if(n!=1) {
			for(int i=1; i<=n; i++) {
				s = s+c;
				c = c+2;
			}
		}
		System.out.println("Sum of "+n+"th even numbers: "+s);	
		
	}
	public static void main(String args[]) {
		int att = 0;
		int maxAtt=3;
		boolean check = true;
		while(check==true) {
			try {		
				att+=1;
				evenSum();
				check = false; 
				
			}
			catch(Exception e) {
				if(att==maxAtt) {
					System.out.println("Maxed out on attempts");
					check = false;
				}
				else {
					System.out.println("Attempt: "+(att+1));
				}
			}
		}				
	}
}
