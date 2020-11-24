class A{
	void m1() {
		System.out.println(">>M1");
	}
	void m2() {
		System.out.println(">>M2");
	}
}

class B extends A{
	void m3() {
		System.out.println(">>M3");
	}
}
public class SimpInh {

	public static void main(String[] args) {
		
		A o = new A();
		o.m1();
		B p = new B();
		p.m1();
		p.m3();
		o = new B(); //restricts from using explicit functions of derived class
		
		
	}

}
