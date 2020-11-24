class Table{
	synchronized static void printTable(int n) {
		for (int i=1; i<11; i++) {
			try {
				Thread.sleep(500);
				System.out.println(n+" x "+i+" = "+i*n);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Th1 extends Thread{
	public void run(){
		Table.printTable(10);
	}
}

class Th2 extends Thread{
	public void run(){
		Table.printTable(9);
	}
}

class Th3 extends Thread{
	public void run(){
		Table.printTable(8);
	}
}

public class StaticSynchro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		Th3 t3 = new Th3();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
