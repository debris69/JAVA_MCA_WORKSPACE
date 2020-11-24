package frameProgramming;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class MultCalculator extends Frame implements ActionListener{
	
	//components of Frame MultCalculator
	Label l1 = new Label("Mult/Div Calculator");
	Label l2 = new Label("Enter Number 1:");
	Label l3 = new Label("Enter Number 2:");
	Label l4 = new Label("Result:");
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	Button b1 = new Button("Multiply");
	Button b2 = new Button("Division");
	
	MultCalculator(){
		
		//setting Components
		setTitle("Mult/Div Calculator");
		setSize(500,700);
		setVisible(true);
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		b1.setBackground(Color.white); //Button - Multiply
		b2.setBackground(Color.white); //Button - Divide
		l1.setFont(new Font("Lucida",Font.CENTER_BASELINE,24)); //Title
		l2.setFont(new Font("Lucida",Font.CENTER_BASELINE,16)); //Label - first number
		l3.setFont(new Font("Lucida",Font.CENTER_BASELINE,16)); //Label - second number
		l4.setFont(new Font("Lucida",Font.CENTER_BASELINE,16)); //Label - Result
		
		//placing components
		l1.setBounds(125, 90, 300, 30); //Title 
		l2.setBounds(95, 150, 300, 30); //Label - first number
		t1.setBounds(95, 200, 300, 30); //Text box - first number
		l3.setBounds(95, 240, 300, 30); //Label - second number
		t2.setBounds(95, 290, 300, 30); //Text box - second number
		b1.setBounds(95, 340, 300, 30); //Button - Multiply
		b2.setBounds(95, 390, 300, 30); //Button - Divide
		l4.setBounds(95, 440, 300, 30); //Label - Result
		t3.setBounds(95, 490, 300, 30); //Text box - Result
		
		//adding Components
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		addWindowListener(new Win()); //inside package
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		try {
			float f1 = Float.parseFloat(t1.getText());
			float f2 = Float.parseFloat(t2.getText());
			
			if(ae.getSource()==b1) {
				t3.setText(Float.toString(f1*f2));
			}
			else {
				t3.setText(Float.toString(f1/f2));
			}
		}
		catch(Exception e) {
			t3.setText("Non-numeric value entered, change value!");
		}
	}	
}

public class TestMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultCalculator();
	}

}
