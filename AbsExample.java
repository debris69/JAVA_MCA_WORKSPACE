abstract class Car{
	Car(){
		System.out.println("Car created");
	}
	abstract void brand();
	
	void vehicleType() {
		System.out.println("Vehicle Type: Car");
	}
}

class Hyundai extends Car{
	void brand() {
		System.out.println("Brand Name: Hyundai");
	}
}
public class AbsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c;
		Hyundai h = new Hyundai();
		h.brand();
		h.vehicleType();
	}

}
