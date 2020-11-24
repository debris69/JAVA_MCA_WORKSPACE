interface Polygon{
	public void getArea(int length, int breadth);
}

class Rectangle implements Polygon{
	public void getArea(int length, int breadth) {
		System.out.println("Area: "+(length*breadth));
	}
}
public class InterfaceExample2 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.getArea(5,6);
	}
}
