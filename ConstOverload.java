class J{
	//default constructor
	J(){
		System.out.println(">> Blank Constructor Initialized!!");
	}
	//parameterized constructors
	J(int x){
		System.out.println(">> Initialized Constructor with x = "+x);
	}
	J(int x, int y){
		System.out.println(">> Initialized Constructor with x and y = "+x+" and "+y);
	}
	J(int x, float f){
		System.out.println(">> Initialized Constructor with x and f = "+x+" and "+f);
	}
	J(String s){
		System.out.println(">> Initialized Constructor with String: "+s);
	}
	
	//overloaded method show
	void show(int x) {
		System.out.println("Int: "+x);
	}
	void show(float f) {
		System.out.println("float: "+f);
	}
	void show(String s) {
		System.out.println("String: "+s);
	}
	void show(int x,int y) {
		System.out.println("Sum: "+(x+y));
	}
}
class K extends J{
	//overridden method show(int x)
	void show(int x) {
		System.out.println("K's Int: "+x);
	}
}
public class ConstOverload {

	public static void main(String[] args) {
		
		//runner code for constructor overloading
		J obj = new J();
		
		
		//overriding show
		obj = new K();
		obj.show(55);
	}

}
