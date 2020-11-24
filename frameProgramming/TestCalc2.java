package frameProgramming;

import java.awt.*;
import java.awt.event.*;



@SuppressWarnings("serial")
class Calculator2 extends Frame implements ActionListener{
	//components of Frame Calculator
	Label title = new Label("Calculator");
	TextField textbar = new TextField();
	
	//numeric keys
	Button num1 = new Button("1");
	Button num2 = new Button("2");
	Button num3 = new Button("3");
	Button num4 = new Button("4");
	Button num5 = new Button("5");
	Button num6 = new Button("6");
	Button num7 = new Button("7");
	Button num8 = new Button("8");
	Button num9 = new Button("9");
	Button num0 = new Button("0");
	
	//operation keys
	Button opAdd = new Button("+");
	Button opSub = new Button("-");
	Button opMul = new Button("*");
	Button opDiv = new Button("/");
	Button opCom = new Button("=");
	
	//decimal key and others
	Button dec = new Button(".");
	Button reset = new Button("CE");
	Button backspace = new Button("<=");
	Button mode = new Button("Light Mode");
	
	//calculator variable
	Double number1 = 0.00;
	Double number2 = 0.00;
	String op = "Unset";
	String currMode = "dark";
	
	
	Calculator2(){
		setTitle("Calculator2");
		setSize(500,700);
		setVisible(true);
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		
		
		//customize components
		title.setFont(new Font("CALIBRI",Font.PLAIN,34));
		title.setForeground(Color.WHITE);
		textbar.setFont(new Font("CALIBRI",Font.PLAIN,28));
		backspace.setFont(new Font("CALIBRI",Font.PLAIN,26));
		mode.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opDiv.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num7.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num8.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num9.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opMul.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num4.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num5.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num6.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opSub.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num1.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num2.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num3.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opAdd.setFont(new Font("CALIBRI",Font.PLAIN,26));
		reset.setFont(new Font("CALIBRI",Font.PLAIN,26));
		num0.setFont(new Font("CALIBRI",Font.PLAIN,26));
		dec.setFont(new Font("CALIBRI",Font.PLAIN,26));
		opCom.setFont(new Font("CALIBRI",Font.PLAIN,26));
		
		//disable user from editing text bar
		textbar.setEditable(false);
		
		
		//set components
		title.setBounds(170, 60, 300, 30);
		textbar.setBounds(35, 120, 430, 60);
		
		//row 1
		backspace.setBounds(35,230, 80, 60);
		mode.setBounds(145, 230, 200, 60);
		
		opDiv.setBounds(385, 230, 80, 60);
		
		//row 2
		num7.setBounds(35, 320, 80, 60);
		num8.setBounds(145, 320, 80, 60);
		num9.setBounds(265, 320, 80, 60);
		opMul.setBounds(385, 320, 80, 60);
		
		//row 3
		num4.setBounds(35, 410, 80, 60);
		num5.setBounds(145, 410, 80, 60);
		num6.setBounds(265, 410, 80, 60);
		opSub.setBounds(385, 410, 80, 60);
		
		//row 4
		num1.setBounds(35, 500, 80, 60);
		num2.setBounds(145, 500, 80, 60);
		num3.setBounds(265, 500, 80, 60);
		opAdd.setBounds(385, 500, 80, 60);
		
		//row 5
		reset.setBounds(35, 590, 80, 60);
		num0.setBounds(145, 590, 80, 60);
		dec.setBounds(265, 590, 80, 60);
		opCom.setBounds(385, 590, 80, 60);
		
		
		//add components
		add(title);
		add(textbar);
		//add row 1
		add(backspace);
		add(mode);
		
		add(opDiv);
		//add row 2
		add(num7);
		add(num8);
		add(num9);
		add(opMul);
		//add row 3
		add(num4);
		add(num5);
		add(num6);
		add(opSub);
		//add row 4
		add(num1);
		add(num2);
		add(num3);
		add(opAdd);
		//add row 5
		add(reset);
		add(num0);
		add(dec);
		add(opCom);
		
		
		//add Action listeners to buttons
		num1.addActionListener(this);
		num2.addActionListener(this);
		num3.addActionListener(this);
		num4.addActionListener(this);
		num5.addActionListener(this);
		num6.addActionListener(this);
		num7.addActionListener(this);
		num8.addActionListener(this);
		num9.addActionListener(this);
		num0.addActionListener(this);
		opAdd.addActionListener(this);
		opSub.addActionListener(this);
		opDiv.addActionListener(this);
		opMul.addActionListener(this);
		opCom.addActionListener(this);
	
		mode.addActionListener(this);
		dec.addActionListener(this);
		reset.addActionListener(this);
		backspace.addActionListener(this);
		
		//window listener to closing button
		addWindowListener(new Win()); //inside package
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		if(ae.getSource()==opAdd) {
			op = "+";
			number1 = Double.parseDouble(textbar.getText());
			textbar.setText("");
		}
		else if(ae.getSource()==opSub) {
			op = "-";
			number1 = Double.parseDouble(textbar.getText());
			textbar.setText("");
		}
		else if(ae.getSource()==opMul) {
			op = "*";
			number1 = Double.parseDouble(textbar.getText());
			textbar.setText("");
		}
		else if(ae.getSource()==opDiv) {
			op = "/";
			number1 = Double.parseDouble(textbar.getText());
			textbar.setText("");
		}
		else if(ae.getSource()==dec) {
			textbar.setText(textbar.getText()+".");
		}
		else if(ae.getSource()==backspace) {
			try {
				textbar.setText(textbar.getText().substring(0,textbar.getText().length()-1));
			}
			catch(Exception e) {
				textbar.setText("0");
			}
		}
		else if(ae.getSource()==reset) {
			textbar.setText("");
		}
		else if(ae.getSource()==opCom){
			number2 = Double.parseDouble(textbar.getText());
			if(op.equals("+")) {
				Double res = number1 + number2;
				textbar.setText(res.toString());
			}
			else if(op.equals("-")) {
				Double res = number1 - number2;
				textbar.setText(res.toString());
			}
			else if(op.equals("*")) {
				Double res = number1 * number2;
				textbar.setText(res.toString());
			}
			else if(op.equals("/")) {
				Double res = number1 / number2;
				textbar.setText(res.toString());
			}
		}
		//dark mode (cause why not)
		else if(ae.getSource()==mode){
			if(currMode.equals("dark")) {
				mode.setLabel("Dark Mode");
				setBackground(Color.WHITE);
				title.setForeground(Color.BLACK);
				title.setBackground(Color.white);
				currMode = "white";
			}
			else if(currMode.equals("white")) {
				mode.setLabel("Light Mode");
				setBackground(Color.DARK_GRAY);
				title.setForeground(Color.WHITE);
				title.setBackground(Color.DARK_GRAY);
				currMode = "dark";
			}
		}
		else {
			Button b = (Button) ae.getSource();
			textbar.setText(textbar.getText()+b.getLabel());
		}
			
	}
	
}

public class TestCalc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator2();
	}

}
