interface inputString{
	public void getString(String s);
}

class ProgLang implements inputString{
	public void getString(String s) {
		System.out.println("Programming Language: "+s);
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgLang p = new ProgLang();
		p.getString("Java");
	}

}
