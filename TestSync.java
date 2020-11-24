class PrintTable extends Thread{
	synchronized void printMethod(int n) {
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
	void printLine(int n) {
		synchronized(this){
			System.out.println("----------------");
			System.out.println("Table of "+n);
		}
		
	}
}

class Thread1 extends Thread{
	PrintTable p;
	Thread1(PrintTable p){
		this.p = p;
	}
	public void run(){
		p.printLine(10);
		p.printMethod(10);
	}
}

class Thread2 extends Thread{
	PrintTable p;
	Thread2(PrintTable p){
		this.p = p;
	}
	public void run(){
		p.printLine(7);
		p.printMethod(7);
	}
}

public class TestSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable p = new PrintTable();
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);
		
		t1.start();
		t2.start();
		
	}

}
