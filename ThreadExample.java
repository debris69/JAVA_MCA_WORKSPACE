class Parking extends Thread{
	static int carCount = 0;
	static int bikeCount = 0;
}

class CarEntry extends Parking{
	public void run() {
		for (int i=1; i<10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Car Entered");
				carCount += 1;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class BikeEntry extends Parking{
	public void run() {
		for (int k=1; k<10; k++) {
			try {
				Thread.sleep(1000);
				System.out.println("Bike Entered");
				bikeCount += 1;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ParkStatus extends Parking{
	public void run() {
		for (int j=1; j<6; j++) {
			try {
				Thread.sleep(2000);
				System.out.println("------------------------");
				System.out.println("Total Bike -> "+bikeCount);
				System.out.println("Total Car -> "+carCount);
				System.out.println("------------------------");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		ParkStatus p = new ParkStatus();
		BikeEntry b = new BikeEntry();
		CarEntry c = new CarEntry();
		
		System.out.println("Main thread:"+t);
		b.start();
		c.start();
		p.start();
	}

}
