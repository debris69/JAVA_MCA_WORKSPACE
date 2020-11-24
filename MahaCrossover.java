import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileOutputStream;

public class MahaCrossover {

	static void fileWrite(int x) {
		try {
			FileOutputStream f = new FileOutputStream("fileOutput.txt");
			
			String s = Integer.toString(x);
			byte b[] = s.getBytes();
			f.write(b);
			
			System.out.println("File Write Operation :-> Success");
			f.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//copy content of existing file
	static int fileRead() {
		String s = "";
		int x = 0;
		try {
			FileInputStream f = new FileInputStream("fileInput.txt");
			while(f.available()>0) {
				s += (char)f.read();
			}
			x = Integer.parseInt(s);
			f.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1 = Integer.parseInt(args[0]); //20
		int c2 = fileRead();
		
		Scanner o = new Scanner(System.in);
		System.out.println("Enter c3: ");
		int c3 = o.nextInt();
		
		fileWrite((c1*c2*c3));
		o.close();
		
	}

}
