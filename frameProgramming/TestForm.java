package frameProgramming;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

@SuppressWarnings("serial")
class UserForm extends Frame implements ActionListener{
	//components
	//labels
	Label title = new Label("User Form");
	Label fname = new Label("First Name:");
	Label lname = new Label("Last Name:");
	Label email = new Label("Email:");
	Label phone = new Label("Phone:");
	Label gender = new Label("Gender:");
	
	CheckboxGroup cgender = new CheckboxGroup();
	Checkbox male = new Checkbox("Male",cgender,false);
	Checkbox female = new Checkbox("Female",cgender,true);
	
	
	Label result = new Label("");
	
	//text field
	TextField tfname = new TextField();
	TextField tlname = new TextField();
	TextField temail = new TextField();
	TextField tphone = new TextField();
	
	//button
	Button submit = new Button("Submit");
	Button reset = new Button("Reset");
	
	UserForm(){
		setTitle("User Form");
		setSize(500,800);
		setVisible(true);
		setLayout(null);
		setBackground(Color.ORANGE);
		
		//add component
		add(title);
		add(fname);
		add(tfname);
		add(lname);
		add(tlname);
		add(email);
		add(temail);
		add(phone);
		add(tphone);
		add(submit);
		add(reset);
		add(gender);
		add(male);
		add(female);
		
		//set component
		title.setBounds(169, 80, 300, 30);
		
		//row 1
		fname.setBounds(30, 180, 135, 30);
		tfname.setBounds(180, 180, 290, 40);
		
		//row 2
		lname.setBounds(30, 250, 135, 30);
		tlname.setBounds(180, 250, 290, 40);
		
		//row 3
		email.setBounds(30, 320, 135, 30);
		temail.setBounds(180, 320, 290, 40);
		
		//row 4
		phone.setBounds(30, 390, 135, 30);
		tphone.setBounds(180, 390, 290, 40);
		
		//row 5
		gender.setBounds(30, 460, 135, 30);
		male.setBounds(180, 460, 90, 30);
		female.setBounds(290, 460, 120, 30);
		
		//row 6
		submit.setBounds(90, 560, 120, 50);
		reset.setBounds(280, 560, 120, 50);
		
		//customize component
		Font tt = new Font("CALIBRI",Font.PLAIN,34);
		Font lb = new Font("CALIBRI",Font.PLAIN,24);
		title.setFont(tt);
		fname.setFont(lb);
		tfname.setFont(lb);
		lname.setFont(lb);
		tlname.setFont(lb);
		email.setFont(lb);
		temail.setFont(lb);
		phone.setFont(lb);
		tphone.setFont(lb);
		submit.setFont(lb);
		reset.setFont(lb);
		gender.setFont(lb);
		male.setFont(lb);
		female.setFont(lb);
		
		reset.setBackground(Color.RED);
		submit.setBackground(Color.GREEN);
		
		reset.setForeground(Color.WHITE);
		//submit.setForeground(Color.white);
		
		
		//add action listeners
		submit.addActionListener(this);
		reset.addActionListener(this);
		
		//add window listener
		addWindowListener(new Win());
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==reset) {
			tfname.setText("");
			tlname.setText("");
			temail.setText("");
			tphone.setText("");
		}
		else {
			try {
				String FName = "First Name: "+tfname.getText()+"\n";
				String LName = "Last Name: "+tlname.getText()+"\n";
				String Email = "Email: "+temail.getText()+"\n";
				String Phone = "Phone: "+tphone.getText()+"\n";
				String Gender = "";
				
				if(male.getState()==true) {
					Gender = "Gender: Male\n";
				}
				else {
					Gender = "Gender: Female\n";
				}
				
				
				FileOutputStream f = new FileOutputStream("UserData.txt", true);
				String lineBreak = "--------------------------------------\n";
				
				f.write(FName.getBytes());
				f.write(LName.getBytes());
				f.write(Email.getBytes());
				f.write(Phone.getBytes());
				f.write(Gender.getBytes());
				f.write(lineBreak.getBytes());
				
				f.close();
				
				result.setText("Record Inserted");
				add(result);
				result.setBounds(155,680,180,30);
				result.setFont(new Font("CALIBRI",Font.PLAIN,24));
				result.setForeground(Color.GREEN);
				result.setBackground(Color.white);
			}
			catch(Exception e) {
				result.setText(e.getMessage());
				add(result);
				result.setBounds(95,680,180,30);
				result.setFont(new Font("CALIBRI",Font.PLAIN,24));
				result.setForeground(Color.RED);
				result.setBackground(Color.white);
			}
		}
	}
	
}
public class TestForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserForm();
	}

}
