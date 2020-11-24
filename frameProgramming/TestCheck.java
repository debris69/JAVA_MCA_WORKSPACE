package frameProgramming;

import java.awt.*;
import java.awt.event.*;

class WinCheck extends Frame implements ActionListener{
	Checkbox c1 = new Checkbox("C++"); 
	WinCheck(){
		
		
		
		addWindowListener(new Win());
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
public class TestCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
