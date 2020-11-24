import java.io.*;
public class TestFileOutput {
	
	//write to new file
	static void fileWrite(String s) {
		try {
			FileOutputStream f = new FileOutputStream("fileOutput2.txt");
			
			byte[] b = s.getBytes();
			f.write(b);
			
			System.out.println("File Write Operation :-> Success");
			f.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//copy content of existing file
	static String fileRead() {
		String s = "";
		try {
			FileInputStream f = new FileInputStream("fileOutput.txt");
			System.out.println("File Read Operation :-> Success");
			while(f.available()>0) {
				int x = f.read();
				s+=(char)x;
			}
			f.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = fileRead();
		fileWrite(s);
	}

}
