import java.io.FileInputStream;
import java.io.FileOutputStream;


public class OddEvenSeperator {
	
	//removes garbage
	static String[] removeElement(String a[], int index[], int count) {
		String[] proxy = new String[a.length-count];
		for(int i = 0, k=0; i<a.length; i++) {
			if(index[i]==1) {
				continue;
			}
			else {
				proxy[k++] = a[i];
			}
		}
		return proxy;
	}
	
	//separates odd and even in different file
	static void separator(String a[]) {
		try {
			FileOutputStream fEven = new FileOutputStream("intEven.txt");
			FileOutputStream fOdd = new FileOutputStream("intOdd.txt");
			for(int i=0; i<a.length; i++) {
				if(Integer.parseInt(a[i])%2==0) {
					String d = a[i]+" ";
					byte b[] = d.getBytes();
					fEven.write(b);
				}
				else {
					String d = a[i]+" ";
					byte b[] = d.getBytes();
					fOdd.write(b);
				}
			}
			fEven.close();
			fOdd.close();
		}
		catch (Exception e) {
		
			e.printStackTrace();
		}
	}
	
	
	//copy content of existing file
	static String[] fileRead() {
		String s = "";
		try {
			FileInputStream f = new FileInputStream("IntInput.txt");
			while(f.available()>0) {
				s += (char)f.read();
			}
			
			f.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		//removing garbage
		String a[]  = s.split(" ");
		int d[] = new int[a.length];
		int count = 0;
		for(int i=0; i<a.length; i++) {
			try {
				Integer.parseInt(a[i]);
				d[i] = 0;
			}
			catch(NumberFormatException e) {
				System.out.println("Garbage Values: "+a[i]);
				d[i] = 1;
				count++;
			}
		}
		
		a = removeElement(a,d,count);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = fileRead();
		separator(s);

	}

}
