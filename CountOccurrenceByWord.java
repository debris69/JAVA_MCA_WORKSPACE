import java.util.Scanner;
public class CountOccurrenceByWord {
	
	 static int countOccurrence(String s, String w) {
		String a[]  = s.split(" ");
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			//System.out.println(a[i]);
			if(w.equals(a[i])) {
				System.out.println(w+" found at position " + i);
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = o.nextLine();
		System.out.println("Enter Word:");
		String wrd = o.next();
		System.out.println("Total occurrence: "+countOccurrence(str,wrd));
		o.close();
	}

}
