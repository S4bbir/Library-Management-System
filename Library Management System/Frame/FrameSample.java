package Frame;
import Entity.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//Main Frame 
public class FrameSample extends JFrame implements ActionListener {
	// Element Adding
	private JPanel panel;
	private JLabel headerLabel, labelImg_1, labelImg_2, labelImg_3, labelImg_4, labelName, labelID, labelGender,
			borrowLabel, massageLabel, infomationLabel;
	private JTextField textFieldName, textFieldID;
	private JPasswordField passwordFieldID;
	private JButton showButtonID, submitButton, exitButton;
	private ImageIcon bookImg_1, bookImg_2, bookImg_3, bookImg_4;
	private JRadioButton radioButtonMale, radioButtonFemale;
	private ButtonGroup buttonGroupMaleFemale;
	private JCheckBox checkBox_1, checkBox_2, checkBox_3, checkBox_4;
	private JComboBox comboBoxBorrow;
	private JTextArea inputMassageTextArea, userInformationShowArea;

	// Styling (color and font)
	private Color colorBlack, colorWhite;
	private Font fontPx15, fontPx18, fontPx20, fontPx30;

	// Adding Details in Frame
	public FrameSample() {

		// adding panal
		super("Library Management System");
		super.setBounds(600, 200, 1400, 920);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// font style
		fontPx15 = new Font("cambria", Font.BOLD, 15);
		fontPx18 = new Font("cambria", Font.PLAIN, 18);
		fontPx20 = new Font("cambria", Font.BOLD, 20);
		fontPx30 = new Font("Cambria", Font.BOLD, 30);

		// color for black and white
		colorBlack = new Color(0, 0, 0);
		colorWhite = new Color(255, 255, 255);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(colorWhite);

		// Adding header Label Text
		headerLabel = new JLabel("Library Management System");
		headerLabel.setBounds(500, 30, 400, 50);
		headerLabel.setFont(fontPx30);
		headerLabel.setForeground(colorBlack);
		headerLabel.setBackground(colorWhite);
		headerLabel.setOpaque(true);
		panel.add(headerLabel);

		// adding book images
		bookImg_1 = new ImageIcon("Picture/Become_a_better_you.png");
		labelImg_1 = new JLabel(bookImg_1);
		labelImg_1.setBounds(140, 100, 200, 300);
		panel.add(labelImg_1);

		bookImg_2 = new ImageIcon("Picture/Book_cover_design.png");
		labelImg_2 = new JLabel(bookImg_2);
		labelImg_2.setBounds(440, 100, 200, 300);
		panel.add(labelImg_2);

		bookImg_3 = new ImageIcon("Picture/Create_your_own_business.png");
		labelImg_3 = new JLabel(bookImg_3);
		labelImg_3.setBounds(740, 100, 200, 300);
		panel.add(labelImg_3);

		bookImg_4 = new ImageIcon("Picture/The_bike_guy.png");
		labelImg_4 = new JLabel(bookImg_4);
		labelImg_4.setBounds(1040, 100, 200, 300);
		panel.add(labelImg_4);

		// adding checkboxes for the book images
		checkBox_1 = new JCheckBox("Become A Better You");
		checkBox_1.setBounds(140, 400, 250, 30);
		checkBox_1.setFont(fontPx18);
		checkBox_1.setBackground(colorWhite);
		checkBox_1.setForeground(colorBlack);
		panel.add(checkBox_1);

		checkBox_2 = new JCheckBox("Book Cover Design");
		checkBox_2.setBounds(440, 400, 250, 30);
		checkBox_2.setFont(fontPx18);
		checkBox_2.setBackground(colorWhite);
		checkBox_2.setForeground(colorBlack);
		panel.add(checkBox_2);

		checkBox_3 = new JCheckBox("Create Your Own Business");
		checkBox_3.setBounds(740, 400, 250, 30);
		checkBox_3.setFont(fontPx18);
		checkBox_3.setBackground(colorWhite);
		checkBox_3.setForeground(colorBlack);
		panel.add(checkBox_3);

		checkBox_4 = new JCheckBox("The Bike Guy");
		checkBox_4.setBounds(1040, 400, 250, 30);
		checkBox_4.setFont(fontPx18);
		checkBox_4.setBackground(colorWhite);
		checkBox_4.setForeground(colorBlack);
		panel.add(checkBox_4);

		// Information section
		// Name text
		labelName = new JLabel("Name: ");
		labelName.setBounds(140, 450, 250, 30);
		labelName.setFont(fontPx20);
		panel.add(labelName);

		// ID text
		labelID = new JLabel("ID: ");
		labelID.setBounds(140, 490, 250, 30);
		labelID.setFont(fontPx20);
		panel.add(labelID);

		// Gender Text
		labelGender = new JLabel("Gender: ");
		labelGender.setBounds(140, 530, 250, 30);
		labelGender.setFont(fontPx20);
		panel.add(labelGender);

		// Name input field
		textFieldName = new JTextField();
		textFieldName.setBounds(240, 450, 250, 30);
		textFieldName.setFont(fontPx15);
		panel.add(textFieldName);

		// ID input field
		passwordFieldID = new JPasswordField();
		passwordFieldID.setBounds(240, 490, 150, 28);
		passwordFieldID.setEchoChar('*');
		passwordFieldID.setFont(fontPx15);
		panel.add(passwordFieldID);
		passwordFieldID.addActionListener(this);

		// ID show button
		showButtonID = new JButton("Show");
		showButtonID.setBounds(399, 490, 90, 28);
		showButtonID.setFont(fontPx15);
		showButtonID.setBackground(colorWhite);
		panel.add(showButtonID);
		showButtonID.addActionListener(this);

		// Gender radio button
		// Male buttom
		radioButtonMale = new JRadioButton("Male");
		radioButtonMale.setBounds(240, 530, 100, 30); // (x, y, width, height)
		radioButtonMale.setFont(fontPx18);
		radioButtonMale.setBackground(colorWhite);
		panel.add(radioButtonMale);

		// Female Button
		radioButtonFemale = new JRadioButton("Female");
		radioButtonFemale.setBounds(340, 530, 120, 30); // (x, y, width, height)
		radioButtonFemale.setFont(fontPx18);
		radioButtonFemale.setBackground(colorWhite);
		panel.add(radioButtonFemale);

		// Grouping the male and female button
		buttonGroupMaleFemale = new ButtonGroup();
		buttonGroupMaleFemale.add(radioButtonMale);
		buttonGroupMaleFemale.add(radioButtonFemale);

		// Borrow slider or dropdown slider
		borrowLabel = new JLabel("Borrowing for: ");
		borrowLabel.setBounds(140, 570, 250, 30);
		borrowLabel.setFont(fontPx20);
		panel.add(borrowLabel);

		// Borrow combo list slide
		String comboList[] = new String[] { "", "1 days", "3 days", "5 days", "7 days" };
		comboBoxBorrow = new JComboBox(comboList);
		comboBoxBorrow.setBounds(290, 570, 200, 28);
		comboBoxBorrow.setFont(fontPx15);
		comboBoxBorrow.setForeground(colorBlack);
		comboBoxBorrow.setBackground(colorWhite);
		panel.add(comboBoxBorrow);

		// Leave a massage box
		massageLabel = new JLabel("Leave a massage: ");
		massageLabel.setBounds(240, 610, 250, 30);
		massageLabel.setFont(fontPx20);
		// massageLabel.setOpaque(true);
		panel.add(massageLabel);

		// leave a massage text box
		inputMassageTextArea = new JTextArea();
		JScrollPane scrollMassage = new JScrollPane(inputMassageTextArea);
		scrollMassage.setBounds(140, 650, 350, 150); // (x, y, width, height)
		inputMassageTextArea.setFont(fontPx15);
		panel.add(scrollMassage);

		// Submit button
		submitButton = new JButton("Submit");
		submitButton.setBounds(220, 820, 90, 28);
		submitButton.setBackground(colorWhite);
		submitButton.setFont(fontPx15);
		panel.add(submitButton);
		submitButton.addActionListener(this);

		// exit button
		exitButton = new JButton("Exit");
		exitButton.setBounds(320, 820, 90, 28);
		exitButton.setBackground(colorWhite);
		exitButton.setFont(fontPx15);
		panel.add(exitButton);
		exitButton.addActionListener(this);

		// Information label text
		infomationLabel = new JLabel("User Information: ");
		infomationLabel.setBounds(880, 460, 200, 28);
		infomationLabel.setFont(fontPx20);
		infomationLabel.setForeground(colorBlack);
		infomationLabel.setBackground(colorWhite);
		infomationLabel.setOpaque(true);
		panel.add(infomationLabel);

		// user's inputed informations show box
		userInformationShowArea = new JTextArea();
		JScrollPane scrollInfo = new JScrollPane(userInformationShowArea);
		scrollInfo.setBounds(690, 500, 550, 300);
		userInformationShowArea.setFont(fontPx15);
		panel.add(scrollInfo);

		super.add(panel);
	}

	public void actionPerformed(ActionEvent eventAction) {

		// showing the ID field
		if (eventAction.getSource() == showButtonID) {
			passwordFieldID.setEchoChar((char) 0);
		}

		// for closing the window
		else if (eventAction.getSource() == exitButton) {
			System.exit(0);
		}

		// submit button action
		else if (eventAction.getSource() == submitButton) {
			String bookList, name, id, gender, borrowingFor, leaveAMassage;

			// geting name and id from input
			name = textFieldName.getText();
			id = new String(passwordFieldID.getPassword());

			// geting gender for input
			if (radioButtonMale.isSelected()) {
				gender = radioButtonMale.getText();
			} 
			else if (radioButtonFemale.isSelected()) {
				gender = radioButtonFemale.getText();
			} 
			else {
				gender = "No Gender Selected";
			}

			// getting booklist from checkbox
			// book 1,2,3,4
			if (checkBox_1.isSelected() && checkBox_2.isSelected() && checkBox_3.isSelected()
					&& checkBox_4.isSelected()) {
				bookList = checkBox_1.getText() + ", " + checkBox_2.getText() + ", " + checkBox_3.getText() + ", " + checkBox_4.getText();
			}
			// book 1,2,3
			else if (checkBox_1.isSelected() && checkBox_2.isSelected() && checkBox_3.isSelected()) {
				bookList = checkBox_1.getText() + ", " + checkBox_2.getText() + ", " + checkBox_3.getText();
			}
			// book 1,2,4
			else if (checkBox_1.isSelected() && checkBox_2.isSelected() && checkBox_4.isSelected()) {
				bookList = checkBox_1.getText() + ", " + checkBox_2.getText() + ", " + checkBox_4.getText();
			}
			// book 1,3,4
			else if (checkBox_1.isSelected() && checkBox_2.isSelected() && checkBox_3.isSelected()) {
				bookList = checkBox_1.getText() + ", " + checkBox_2.getText() + ", " + checkBox_3.getText();
			}
			// book 2,3,4
			else if (checkBox_2.isSelected() && checkBox_3.isSelected() && checkBox_4.isSelected()) {
				bookList = checkBox_2.getText() + ", " + checkBox_3.getText() + ", " + checkBox_4.getText();
			}
			// book 1,2
			else if (checkBox_1.isSelected() && checkBox_2.isSelected()) {
				bookList = checkBox_1.getText() + ", " + checkBox_2.getText();
			}
			// book 1,3
			else if (checkBox_1.isSelected() && checkBox_3.isSelected()) {
				bookList = checkBox_1.getText() + ", " + checkBox_3.getText();
			}
			// book 1,4
			else if (checkBox_1.isSelected() && checkBox_4.isSelected()) {
				bookList = checkBox_1.getText() + ", " + checkBox_4.getText();
			}
			// book 2,3
			else if (checkBox_2.isSelected() && checkBox_3.isSelected()) {
				bookList = checkBox_2.getText() + ", " + checkBox_3.getText();
			}
			// book 2,4
			else if (checkBox_2.isSelected() && checkBox_4.isSelected()) {
				bookList = checkBox_2.getText() + ", " + checkBox_4.getText();
			}
			// book 3,4
			else if (checkBox_3.isSelected() && checkBox_4.isSelected()) {
				bookList = checkBox_3.getText() + ", " + checkBox_4.getText();
			}
			// book 1
			else if (checkBox_1.isSelected()) {
				bookList = checkBox_1.getText();
			}
			// book 2
			else if (checkBox_2.isSelected()) {
				bookList = checkBox_2.getText();
			}
			// book 3
			else if (checkBox_3.isSelected()) {
				bookList = checkBox_3.getText();
			}
			// book 4
			else if (checkBox_4.isSelected()) {
				bookList = checkBox_4.getText();
			}
			// no text selected
			else {
				bookList = "No book selected";
			}

			// getting borrowing for days input
			borrowingFor = comboBoxBorrow.getSelectedItem().toString();

			// getting leave a massage input
			leaveAMassage = inputMassageTextArea.getText();

			// if any input field is not filled
			if (name.isEmpty() || id.isEmpty() || gender.equals("No Gender Selected") || borrowingFor.isEmpty() || leaveAMassage.isEmpty() || bookList.equals("No book selected")) {
				JOptionPane.showMessageDialog(this, "Please fill-up all the information!");
			}

			// showing that all the information is entered and saved
			else {
				FileManage manageObjectOne = new FileManage(bookList, name, id, gender, borrowingFor, leaveAMassage);
				manageObjectOne.insertValues();
				JOptionPane.showConfirmDialog(this, "Information saved!");
				showing();
			}
		}
	}

	private void showing() {
		try {
			// reading the file
			File file = new File("./Data/userdata.txt");

			if (file.exists()) {
				FileReader fReader = new FileReader(file);
				BufferedReader bReader = new BufferedReader(fReader);

				String line;
				while ((line = bReader.readLine()) != null) {
						userInformationShowArea.append(line + "\n");
				}
				bReader.close();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this, "Error File");
		}
	}

}
