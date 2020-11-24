class Fauna{
	String color = "Blue";
	Fauna(){
		System.out.println("Fauna Called");
	}
	void eat() {
		System.out.println("Eating...");
	}
}

class Giraffe extends Fauna{
	String color = "Black";
	Giraffe(){
		super(); //super call to constructor
		System.out.println(color);
		System.out.println(super.color); //super call to variable
	}
	void eat() {
		System.out.println("eating fish...");
		super.eat(); //super call to method
	}
}
public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Giraffe g = new Giraffe();
		g.eat();
	}

}
