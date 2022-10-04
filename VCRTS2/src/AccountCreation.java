import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.*;

public class AccountCreation {

	JFrame frame = new JFrame();

	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 500;

	private JLabel test;
	private JLabel confirmLabel;
	private JPanel panel;
	private JTextField nameField;
	private JButton enterName;
	private JTextField emailField;
	private JButton enterEmail;
	private JTextField phoneNumField;
	private JButton enterPhoneNum;
	private JButton createAccount;
	private JCheckBox c1;
	private JCheckBox c2;
	private Color lav = new Color(221, 160, 221);

	public AccountCreation() {
		test = new JLabel("Create Account Here");
		test.setBounds(200, 10, 400, 50);

		test.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

		nameField = new JTextField("Name: ");
		nameField.setBounds(225, 100, 150, 25);
		emailField = new JTextField("Email: ");
		emailField.setBounds(225, 230, 150, 25);
		phoneNumField = new JTextField("Phone Number: ");
		phoneNumField.setBounds(225, 360, 150, 25);
		c1 = new JCheckBox("Vehicle Owner");
		c1.setBounds(45, 150, 150, 25);
		c2 = new JCheckBox("Vehicle Renter");
		c2.setBounds(45, 300, 150, 25);

		//createButtonName();
		//createButtonEmail();
		//createButtonPhoneNum();
		createButtonCreateAccount();
		createPanel();

		frame.setTitle("VCRTS"); // setting Title on top left corner of GUI

		ImageIcon CloudComputingIcon = new ImageIcon("Cloud Computing.jpg");
		frame.setIconImage(CloudComputingIcon.getImage()); // Changing Frame Icon to cloud computing icon

		// INPUTTING SIZE OF GUI from VARIABLES
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private void createButtonCreateAccount() {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		String name = nameField.getText();
		confirmLabel.setText(name);
		String email = emailField.getText();
		confirmLabel.setText(email);
		String phoneNum = phoneNumField.getText();
		confirmLabel.setText(phoneNum);
		
	}

	//private void createButtonName() {
		//enterName = new JButton("Enter Name");
		//enterName.setBounds(225, 125, 150, 25);
		//enterName.setBackground(lav);
	//}

	//private void createButtonEmail() {
		//enterEmail = new JButton("Enter Email");
		//enterEmail.setBounds(225, 255, 150, 25);
		//enterEmail.setBackground(lav);
	//}

	//private void createButtonPhoneNum() {
		//enterPhoneNum = new JButton("Enter Phone Number");
		//enterPhoneNum.setBounds(225, 385, 150, 25);
		//enterPhoneNum.setBackground(lav);

	//}

	private void createPanel() {
		panel = new JPanel();

		panel.setLayout(null);
		panel.setBackground(Color.CYAN);
		panel.add(test);
		panel.add(nameField);
		panel.add(emailField);
		panel.add(phoneNumField);
		//panel.add(enterName);
		//panel.add(enterEmail);
		//panel.add(enterPhoneNum);
		panel.add(c1);
		panel.add(c2);

		// adds to current object
		frame.add(panel);
	}

}
