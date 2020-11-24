package frameProgramming;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class SmpFrame extends Frame implements ActionListener{
	Button b1 = new Button("Red");
	Button b2 = new Button("Cyan");
	Button b3 = new Button("Reset");
	SmpFrame(){
		setTitle("New Frame");
	    setSize(400,400);
	    setVisible(true);
	    setBackground(Color.yellow);
	    setLayout(new FlowLayout());
	    addWindowListener(new Win());
	    add(b1);
	    add(b2); 
	    add(b3);
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) {
			setBackground(Color.red);
		}
		else if(ae.getSource()==b2) {
			setBackground(Color.cyan);
		}     
		else {
			setBackground(Color.yellow);
		}
		      
	}
}

class Win extends WindowAdapter{
	public void windowClosing(WindowEvent we){
	    System.exit(0);
	  }
}

public class SimpleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SmpFrame();
	}

}
