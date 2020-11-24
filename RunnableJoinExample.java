
class PrintValue implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("1");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}

class PrintValue2 implements Runnable{
	public void run() {
		for(int j=0; j<5; j++) {
			try {
				Thread.sleep(1000);
				System.out.println("2");
			}
			catch(Exception e) {
				e.printStackTrace();			}
		}
	}
}

class PrintValue3 implements Runnable{
	public void run() {
		for(int k=0; k<5; k++) {
			try {
				Thread.sleep(1000);
				System.out.println("3");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}


public class RunnableJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintValue s = new PrintValue();
		PrintValue2 p = new PrintValue2();
		PrintValue3 q = new PrintValue3();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(q);
		
		t1.setPriority(8); //print 1
		t2.setPriority(1); //print 2
		t3.setPriority(2); //print 3
		
		t1.start();
		t2.start();
		t3.start();
	}

}
