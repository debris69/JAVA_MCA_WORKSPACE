import java.io.*;
class Occur{
  String s1 = "Hello , my name is Shreyasi Chatterjee and my hobby is singing .";
  String s2 = "my";
  String s3 = "is";
  public int display(){
    String s[] = s1.split(" ");
    int count = 0;
    for(int i = 0; i < s.length; i++){
      if(s2.equals(s[i]))
        count++;
       if(s3.equals(s[i]))
        count++;
    }
    return count;
   }
    
}
public class DemoText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Occur ob = new Occur();
	      int result;
	      result = ob.display();
	      System.out.println("occurance of 'my' word = " + count);
	      System.out.println("position of 'my' word = " + s1.indexOf('m') + " and " + s1.lastIndexOf('m'));
	      System.out.println("occurance of 'is' word = " + count);
	      System.out.println("position of 'is' word = " + s1.indexOf('i') + " and " + s1.lastIndexOf('i', 52));
	}

}
