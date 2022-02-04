/*******************************************
 * File    : ActionListenerDemo.java
 * Program : To create a Registration Form
 * Author  : Justin Jolly
 * Version : 1.0
 * Date    : 04-02-2022
 *******************************************/
package tutorial;
import java.awt.*;
import java.awt.event.*;
public class ActionListenerDemo extends Frame implements ActionListener{
	TextField text = new TextField(20);
	TextField text1 = new TextField(20);
	TextField text2 = new TextField(20);
	Button button;
	
	Label tName;
	Label tEmail;
	Label tdept;

	ActionListenerDemo(){
		setTitle("Registration form");
		setSize(300,300);
		setVisible(true);
		tName = new Label();
		tName.setBounds(100,100,50,50);
		tName.setText("Name:");
		add(tName);
		text.setBounds(150, 90, 160, 40);
		add(text);
		tEmail= new Label();
		tEmail.setBounds(100,100,50,50);
		tEmail.setText("Email: ");
		add(tEmail);
		text1.setBounds(150, 90, 160, 40);
		add(text1);
		tdept = new Label();
		tdept.setBounds(100,100,50,50);
		tdept.setText("Department: ");
		add(tdept);
		text2.setBounds(150, 90, 160, 40);
		add(text2);
		setLayout(new FlowLayout());
		button = new Button("Submit");
		add(button);
		button.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
			
		});
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Name    - "+text.getText());
		System.out.println("Email   - "+text1.getText());
		System.out.println("Department  - "+text2.getText());
	}
	
	public static void main(String[] args) {
		ActionListenerDemo demo = new ActionListenerDemo();
		
	}

}