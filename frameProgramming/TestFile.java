package frameProgramming;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;


public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    String foo = "23+2";
	    try {
	    	
			String s =  engine.eval(foo).toString();
			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid Operation"+e.getMessage());
		}
	}

}
