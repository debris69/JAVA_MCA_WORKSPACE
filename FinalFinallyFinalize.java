class F{
	final int x = 200;
	F(){
		try {
			//x = 100;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Hola!");
		}
	}
}
public class FinalFinallyFinalize {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new F();
		FinalFinallyFinalize s = new FinalFinallyFinalize();
		s = null;
		System.gc();
		System.out.println("Main completes");
	}
	public void finalize(){
		System.out.println("finalize method overridden");
	}

}
