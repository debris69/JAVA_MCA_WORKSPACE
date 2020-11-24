package frameProgramming;

import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;


@SuppressWarnings("serial")
class Calculator extends Frame implements ActionListener{
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
	Button braceOpen = new Button("(");
	Button braceClose = new Button(")");
	
	
	Calculator(){
		setTitle("Calculator");
		setSize(500,700);
		setVisible(true);
		setLayout(null);
		setBackground(Color.DARK_GRAY);
		
		
		
		//customize components
		title.setFont(new Font("CALIBRI",Font.PLAIN,34));
		title.setForeground(Color.WHITE);
		textbar.setFont(new Font("CALIBRI",Font.PLAIN,28));
		backspace.setFont(new Font("CALIBRI",Font.PLAIN,26));
		braceOpen.setFont(new Font("CALIBRI",Font.PLAIN,26));
		braceClose.setFont(new Font("CALIBRI",Font.PLAIN,26));
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
		
		//disable user from editing textbar
		textbar.setEditable(false);
		
		
		//set components
		title.setBounds(170, 60, 300, 30);
		textbar.setBounds(35, 120, 430, 60);
		
		//row 1
		backspace.setBounds(35,230, 80, 60);
		braceOpen.setBounds(145, 230, 80, 60);
		braceClose.setBounds(265, 230, 80, 60);
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
		add(braceOpen);
		add(braceClose);
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
		braceOpen.addActionListener(this);
		braceClose.addActionListener(this);
		dec.addActionListener(this);
		reset.addActionListener(this);
		backspace.addActionListener(this);
		
		//window listener to closing button
		addWindowListener(new Win()); //inside package
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==num1) {
			textbar.setText(textbar.getText()+"1");
		}
		else if(ae.getSource()==num2) {
			textbar.setText(textbar.getText()+"2");
		}
		else if(ae.getSource()==num3) {
			textbar.setText(textbar.getText()+"3");
		}
		else if(ae.getSource()==num4) {
			textbar.setText(textbar.getText()+"4");
		}
		else if(ae.getSource()==num5) {
			textbar.setText(textbar.getText()+"5");
		}
		else if(ae.getSource()==num6) {
			textbar.setText(textbar.getText()+"6");
		}
		else if(ae.getSource()==num7) {
			textbar.setText(textbar.getText()+"7");
		}
		else if(ae.getSource()==num8) {
			textbar.setText(textbar.getText()+"8");
		}
		else if(ae.getSource()==num9) {
			textbar.setText(textbar.getText()+"9");
		}
		else if(ae.getSource()==num0) {
			textbar.setText(textbar.getText()+"0");
		}
		else if(ae.getSource()==opAdd) {
			textbar.setText(textbar.getText()+"+");
		}
		else if(ae.getSource()==opSub) {
			textbar.setText(textbar.getText()+"-");
		}
		else if(ae.getSource()==opMul) {
			textbar.setText(textbar.getText()+"*");
		}
		else if(ae.getSource()==opDiv) {
			textbar.setText(textbar.getText()+"/");
		}
		else if(ae.getSource()==dec) {
			textbar.setText(textbar.getText()+".");
		}
		else if(ae.getSource()==braceOpen) {
			textbar.setText(textbar.getText()+"(");
		}
		else if(ae.getSource()==braceClose) {
			textbar.setText(textbar.getText()+")");
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
		else {
			ScriptEngineManager mgr = new ScriptEngineManager();
		    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		    
		    try {
		    	String s = engine.eval(textbar.getText()).toString();
		    	textbar.setText(s);
		    	
			} catch (Exception e) {
				textbar.setText("Invalid Operation");
			}
		}
			
	}
	
}

public class TestCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

}
