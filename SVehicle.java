class Bus{
  void print(String msg1){
    synchronized(this){
    	for(int i=1; i<5; i++) {
    		System.out.println(msg1+" i:" + i);
    	}
    
 	}
    for(int j=1; j<5; j++) {
		 System.out.println(msg1 + " j: " + j);
		 try{
			 Thread.sleep(1000);
		 }
		 catch(InterruptedException e){
			 System.out.println("Exception is : " + e);
		 }
	 }
    
  }
}
class SCar extends Thread{
  String msg1;
  Bus targ;
  public SCar(Bus b, String s){
    targ = b;
    msg1 = s;
  }
  public void run(){
        targ.print(msg1);
      }
  }

public class SVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus targ = new Bus();
	    SCar ob1 = new SCar(targ, "Maruti Suzuki");
	    SCar ob2 = new SCar(targ, "BMW");
	    SCar ob3 = new SCar(targ, "Jaguar");
	    ob1.start();
	    ob2.start();
	    ob3.start();
	    
	}

}
