package frameProgramming;
import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
class SquareCalculator extends Frame implements ActionListener{
	
	//components of Frame SquareCalculator
	Label l1 = new Label("Square Calculator");
	Label l2 = new Label("Enter Number:");
	Label l3 = new Label("Result:");
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	Button b = new Button("Calculate");
	
	SquareCalculator(){
		
		//setting Components
		setTitle("Square Calculator");
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		setBackground(Color.cyan);
		l1.setFont(new Font("Lucida",Font.CENTER_BASELINE,24));
		l2.setFont(new Font("Lucida",Font.CENTER_BASELINE,16));
		l3.setFont(new Font("Lucida",Font.CENTER_BASELINE,16));
		
		l1.setBounds(150, 90, 300, 30);
		l2.setBounds(95, 150, 300, 50);
		t1.setBounds(95, 200, 300, 30);
		b.setBounds(95, 240, 300, 30);
		l3.setBounds(95,280, 300, 50);
		t2.setBounds(95, 320, 300, 30);
		
		//adding Components
		add(t1);
		add(t2);
		add(b);
		add(l1);
		add(l2);
		add(l3);
		addWindowListener(new Win());
		b.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		int v = Integer.parseInt(t1.getText());
		t2.setText(Integer.toString(v*v));
	}
	
	
	
}
public class TestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SquareCalculator();
	}

}
