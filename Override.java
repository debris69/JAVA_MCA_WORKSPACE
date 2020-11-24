class As {
  int a, b;
  As(){
	  //blank constructor needed since u r calling A();
  }
  As(int i, int j){
    System.out.println("Inside A's constructor : ");
    a = i;
    b = j;
  }
  int add(){
    return a + b;
  }
  void show(){
    System.out.println( "Value of a and b : " + a + " , " + b);
  }
}
class Bs extends As{
  int c, d, e;
  Bs(int i, int j, int k){
	c = i;
	d = j;
	e = k;
    System.out.println("Inside B's constructor : ");
  }
  int add(){
    return c + d + e;
  }
  void show(){
    System.out.println("Value of c, d, and e are : " + c + "," + d + "," + e);
  }
}
public class Override{
  public static void main(String args[]){
    As superob = new As(4,8);
    int result;
    result = superob.add();
    System.out.println("Result for a + b is : " + result);
    superob.show();
    System.out.println();

    Bs subob = new Bs(2,5,6);
    subob.show();
    result = subob.add();
    System.out.println("Result for c + d + e is : " + result); 
    }
}