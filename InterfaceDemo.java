interface Animal{
  public static final String s = "This is the animal category.";
  public void list();
}
class Dog implements Animal{
  public void list(){
    System.out.println(s);
    System.out.println("dog is human's best freind");
  }
}
abstract class Cat implements Animal{
  public void show(){
    System.out.println("cat belongs to the big cat family.");
  }
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c;
	    Dog d = new Dog();
	    d.list();
	   // d.show();
	}

}
