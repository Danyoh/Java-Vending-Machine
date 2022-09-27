package cp213;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

/**
 * Handles the GUI portion of the vending machine. May use other GUI classes for
 * individual elements of the vending machine. Should use the VendModel for all
 * control logic.
 *
 * @author Daniel Nguyen
 * @version 2021-03-19
 */
@SuppressWarnings("serial")
public class VendView extends JPanel {
	
	// STOCK
	
	int A1 = 1;
	int A2 = 1;
	int A3 = 1;
	int B1 = 1;
	int B2 = 1;
	int B3 = 1;
	int C1 = 1;
	int C2 = 1;
	int C3 = 1;

    private VendModel model = null;
    static double total_c = 0.00;
    double change_due = 0.00;
    private static DecimalFormat df = new DecimalFormat("#0.00");
	JTextField txt = new JTextField("$" + df.format(total_c), 10);
	String input1 = "X";
	String input2 = "X";
	JTextField txtinput2 = new JTextField(input1 + input2);
	double total_due = 0.00;
	JTextField txtinput = new JTextField("Total: $" + df.format(total_due), 10);
	double prev_total = total_due;

    public VendView(VendModel model) {
	this.model = model;
	// your code here 	
	

	
	//Panels
	final JPanel panelChoco = new JPanel();
	panelChoco.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(10, 10, 10, 10),BorderFactory.createLineBorder(Color.black)));
	final JPanel panelNum = new JPanel();
	panelNum.setBorder(new EmptyBorder(10,10,10,10));
	
	// Chocolate Image
	ImageIcon chocolate = new ImageIcon("chocolate-bar-small.png");
	JLabel a1 = new JLabel("A1", chocolate, JLabel.CENTER);
	a1.setVerticalTextPosition(JLabel.BOTTOM);
	a1.setHorizontalTextPosition(JLabel.CENTER);

	JLabel a2 = new JLabel("A2", chocolate, JLabel.CENTER);
	a2.setVerticalTextPosition(JLabel.BOTTOM);
	a2.setHorizontalTextPosition(JLabel.CENTER);
	
	JLabel a3 = new JLabel("A3", chocolate, JLabel.CENTER);
	a3.setVerticalTextPosition(JLabel.BOTTOM);
	a3.setHorizontalTextPosition(JLabel.CENTER);
	
	JLabel b1 = new JLabel("B1", chocolate, JLabel.CENTER);
	b1.setVerticalTextPosition(JLabel.BOTTOM);
	b1.setHorizontalTextPosition(JLabel.CENTER);
	
	JLabel b2 = new JLabel("B2", chocolate, JLabel.CENTER);
	b2.setVerticalTextPosition(JLabel.BOTTOM);
	b2.setHorizontalTextPosition(JLabel.CENTER);
	
	JLabel b3 = new JLabel("B3", chocolate, JLabel.CENTER);
	b3.setVerticalTextPosition(JLabel.BOTTOM);
	b3.setHorizontalTextPosition(JLabel.CENTER);
	
	JLabel c1 = new JLabel("C1", chocolate, JLabel.CENTER);
	c1.setVerticalTextPosition(JLabel.BOTTOM);
	c1.setHorizontalTextPosition(JLabel.CENTER);
	
	JLabel c2 = new JLabel("C2", chocolate, JLabel.CENTER);
	c2.setVerticalTextPosition(JLabel.BOTTOM);
	c2.setHorizontalTextPosition(JLabel.CENTER);
	
	JLabel c3 = new JLabel("C3", chocolate, JLabel.CENTER);
	c3.setVerticalTextPosition(JLabel.BOTTOM);
	c3.setHorizontalTextPosition(JLabel.CENTER);
	


	// A Buttons
	JButton numA = new JButton("A");	JButton numB = new JButton("B");	JButton numC = new JButton("C");
	JButton num7 = new JButton("7");	JButton num8 = new JButton("8");	JButton num9 = new JButton("9");
	JButton num4 = new JButton("4");	JButton num5 = new JButton("5");	JButton num6 = new JButton("6");
	JButton num1 = new JButton("1");	JButton num2 = new JButton("2");	JButton num3 = new JButton("3");
	JButton numEnter = new JButton("Enter");	JButton numCancel = new JButton("Cancel");
	
	JButton cash5C = new JButton("5¢");	JButton cash10C = new JButton("10¢");	JButton cash25C = new JButton("25¢");
	JButton cash1 = new JButton("$1");	JButton cash2 = new JButton("$2");	JButton cash5 = new JButton("$5");
	JButton cash10 = new JButton("$10");
	
	JButton finish = new JButton("Finish");
	
	//GridBag
	panelChoco.setLayout(new GridBagLayout());
	GridBagConstraints gb = new GridBagConstraints();
	gb.insets = new Insets(10,10,10,10);
	
	// Images of Merchandise
	JLabel top = new JLabel("---------------$0.50---------------");
	top.setHorizontalAlignment(JLabel.CENTER);
	gb.fill = GridBagConstraints.HORIZONTAL;
	gb.gridx = 0;
	gb.gridy = 1;
	gb.gridwidth = 3;
	panelChoco.add(top, gb);
	
	JLabel top1 = new JLabel("---------------$1.25---------------");
	top1.setHorizontalAlignment(JLabel.CENTER);
	gb.fill = GridBagConstraints.HORIZONTAL;
	gb.gridx = 0;
	gb.gridy = 3;
	gb.gridwidth = 3;
	panelChoco.add(top1, gb);
	
	JLabel top2 = new JLabel("---------------$2.00---------------");
	top2.setHorizontalAlignment(JLabel.CENTER);
	gb.fill = GridBagConstraints.HORIZONTAL;
	gb.gridx = 0;
	gb.gridy = 5;
	gb.gridwidth = 3;
	panelChoco.add(top2, gb);
	
	gb.gridx = 0;
	gb.gridy = 2;
	gb.gridwidth = 1;
	panelChoco.add(a1, gb);
	
	gb.gridx = 0;
	gb.gridy = 4;
	panelChoco.add(a2, gb);
	
	
	gb.gridx = 0;
	gb.gridy = 6;
	gb.gridwidth = 1;
	panelChoco.add(a3, gb);
	
	
	
	gb.gridx = 1;
	gb.gridy = 2;
	panelChoco.add(b1, gb);
	
	gb.gridx = 1;
	gb.gridy = 4;
	panelChoco.add(b2, gb);
	
	gb.gridx = 1;
	gb.gridy = 6;
	panelChoco.add(b3, gb);
	
	gb.gridx = 2;
	gb.gridy = 2;
	panelChoco.add(c1, gb);
	
	gb.gridx = 2;
	gb.gridy = 4;
	panelChoco.add(c2, gb);
	
	gb.gridx = 2;
	gb.gridy = 6;
	panelChoco.add(c3, gb);
	
	JLabel titlelabel = new JLabel("Machine that Vends");
	titlelabel.setHorizontalAlignment(JTextField.CENTER);
	gb.fill = GridBagConstraints.HORIZONTAL;
	gb.gridx = 0;
	gb.gridy = 0;
	gb.gridwidth = 3;
	panelChoco.add(titlelabel, gb);
	
	JLabel opening = new JLabel("");
	opening.setBackground(Color.black);
	opening.setOpaque(true);
	opening.setHorizontalAlignment(JTextField.CENTER);
	opening.setBorder(BorderFactory.createLineBorder(Color.black));
	gb.fill = GridBagConstraints.HORIZONTAL;
	gb.ipady = 60; 
	gb.gridx = 0;
	gb.gridy = 7;
	gb.gridwidth = 3;
	panelChoco.add(opening, gb);
	
	this.add(panelChoco);
	
	// Numpad
	
	panelNum.setLayout(new GridBagLayout());
	GridBagConstraints gbnum = new GridBagConstraints();
	gbnum.insets = new Insets(1,1,1,1);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 1;
	panelNum.add(numA, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 1;
	gbnum.gridy = 1;
	panelNum.add(numB, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 2;
	gbnum.gridy = 1;
	panelNum.add(numC, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 2;
	panelNum.add(num7, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 1;
	gbnum.gridy = 2;
	panelNum.add(num8, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 2;
	gbnum.gridy = 2;
	panelNum.add(num9, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 3;
	panelNum.add(num4, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 1;
	gbnum.gridy = 3;
	panelNum.add(num5, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 2;
	gbnum.gridy = 3;
	panelNum.add(num6, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 4;
	panelNum.add(num1, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 1;
	gbnum.gridy = 4;
	panelNum.add(num2, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 2;
	gbnum.gridy = 4;
	panelNum.add(num3, gbnum);
	
	
	//Textfield 

	txtinput.setEditable(false);
	txtinput.setBackground(Color.white);
	txtinput.setHorizontalAlignment(JTextField.RIGHT);
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 0;
	gbnum.gridwidth = 2;
	panelNum.add(txtinput, gbnum);
	

	
	txtinput2.setEditable(false);
	txtinput2.setBackground(Color.white);
	txtinput2.setHorizontalAlignment(JTextField.RIGHT);
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 2;
	gbnum.gridy = 0;
	gbnum.gridwidth = 1;
	panelNum.add(txtinput2, gbnum);
	
	JLabel totallabel = new JLabel("Money Inserted: ");
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 1;
	gbnum.gridy = 5;
	gbnum.gridwidth = 3;
	panelNum.add(totallabel, gbnum);
	
	txt.setEditable(false);
	txt.setBackground(Color.white);
	txt.setHorizontalAlignment(JTextField.RIGHT);
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 6;
	gbnum.gridwidth = 3;
	panelNum.add(txt, gbnum);
	
	// Payment
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 7;
	gbnum.gridwidth = 3;
	panelNum.add(numEnter, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 8;
	gbnum.gridwidth = 3;
	panelNum.add(numCancel, gbnum);
	
	
	// Coins
	JLabel paylabel = new JLabel("Payment: ");
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 9;
	gbnum.gridwidth = 3;
	panelNum.add(paylabel, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 10;
	gbnum.gridwidth = 1;
	panelNum.add(cash5C, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 1;
	gbnum.gridy = 10;
	gbnum.gridwidth = 1;
	panelNum.add(cash10C, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 2;
	gbnum.gridy = 10;
	gbnum.gridwidth = 1;
	panelNum.add(cash25C, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 11;
	gbnum.gridwidth = 1;
	panelNum.add(cash1, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 1;
	gbnum.gridy = 11;
	gbnum.gridwidth = 1;
	panelNum.add(cash2, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 2;
	gbnum.gridy = 11;
	gbnum.gridwidth = 1;
	panelNum.add(cash5, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 12;
	gbnum.gridwidth = 1;
	panelNum.add(cash10, gbnum);
	
	JLabel blank1 = new JLabel(" ");
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 13;
	gbnum.gridwidth = 3;
	panelNum.add(blank1, gbnum);
	
	JLabel blank2 = new JLabel(" ");
	gbnum.gridy = 14;
	panelNum.add(blank2, gbnum);
	
	JLabel blank3 = new JLabel("Press to Vend After Payment");
	gbnum.gridy = 15;
	panelNum.add(blank3, gbnum);
	
	gbnum.fill = GridBagConstraints.HORIZONTAL;
	gbnum.gridx = 0;
	gbnum.gridy = 16;
	gbnum.gridwidth = 3;
	gbnum.ipady = 30; 
	panelNum.add(finish, gbnum);
	
	this.add(panelNum);	
	
	numCancel.addActionListener(new Reset());
	cash5C.addActionListener(new cash5C());
	cash10C.addActionListener(new cash10C());
	cash25C.addActionListener(new cash25C());
	cash1.addActionListener(new cash1());
	cash2.addActionListener(new cash2());
	cash5.addActionListener(new cash5());
	cash10.addActionListener(new cash10());
	
	numA.addActionListener(new numINPUTA());
	numB.addActionListener(new numINPUTB());
	numC.addActionListener(new numINPUTC());
	
	num1.addActionListener(new numINPUT1());
	num2.addActionListener(new numINPUT2());
	num3.addActionListener(new numINPUT3());
	num4.addActionListener(new numINPUT4());
	num5.addActionListener(new numINPUT5());
	num6.addActionListener(new numINPUT6());
	num7.addActionListener(new numINPUT7());
	num8.addActionListener(new numINPUT8());
	num9.addActionListener(new numINPUT9());
	
	numEnter.addActionListener(new numENTER());

	finish.addActionListener(new FINISH());

    }
    
    // input
    

    
	public class numINPUTA implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input1 = "A";
			txtinput2.setText(input1 + input2);
		}
	}
	
	public class numINPUTB implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input1 = "B";
			txtinput2.setText(input1 + input2);
		}
	}
	
	public class numINPUTC implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input1 = "C";
			txtinput2.setText(input1 + input2);
		}
	}
	
	public class numINPUT1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input2 = "1";
			txtinput2.setText(input1 + input2);
		}
	}
	
	public class numINPUT2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input2 = "2";
			txtinput2.setText(input1 + input2);
		}
	}
	
	public class numINPUT3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input2 = "3";
			txtinput2.setText(input1 + input2);
		}
	}
	
	
	public class numINPUT4 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input2 = "4";
			txtinput2.setText(input1 + input2);
		}
	}
	
	public class numINPUT5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input2 = "5";
			txtinput2.setText(input1 + input2);
		}
	}
	
	public class numINPUT6 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input2 = "6";
			txtinput2.setText(input1 + input2);
		}
	}
	
	
	public class numINPUT7 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input2 = "7";
			txtinput2.setText(input1 + input2);
		}
	}
	
	public class numINPUT8 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input2 = "8";
			txtinput2.setText(input1 + input2);
		}
	}
	
	public class numINPUT9 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			input2 = "9";
			txtinput2.setText(input1 + input2);
		}
	}
	
	// ENTER
	

    
    // add money
	public static void infoBox(String infoMessage, String titleBar)    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
	public class cash5C implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (total_c + 0.05 < 10.01) {
			total_c += 0.05;
			txt.setText("$" + df.format(total_c));
			}
			else {
				infoBox("Machine Only Accepts Maximum of $10.00", "ERROR");
			}
		}
	}
	
	public class cash10C implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (total_c + 0.10 < 10.01) {
			total_c += 0.10;
			txt.setText("$" + df.format(total_c));
			}
			else {
				infoBox("Machine Only Accepts Maximum of $10.00", "ERROR");
			}
		}
	}
	public class cash25C implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (total_c + 0.25 < 10.01) {
			total_c += 0.25;
			txt.setText("$" + df.format(total_c));
			}
			else {
				infoBox("Machine Only Accepts Maximum of $10.00", "ERROR");
			}
		}
	}
	public class cash1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (total_c + 1.00 < 10.01) {
			total_c += 1.00;
			txt.setText("$" + df.format(total_c));
			}
			else {
				infoBox("Machine Only Accepts Maximum of $10.00", "ERROR");
			}
		}
	}
	public class cash2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (total_c + 2.00 < 10.01) {
			total_c += 2.00;
			txt.setText("$" + df.format(total_c));
			}
			else {
				infoBox("Machine Only Accepts Maximum of $10.00", "ERROR");
			}
		}
	}
	
	public class cash5 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (total_c + 5.00 < 10.01) {
			total_c += 5.00;
			txt.setText("$" + df.format(total_c));
			}
			else {
				infoBox("Machine Only Accepts Maximum of $10.00", "ERROR");
			}
		}
	}
	
	public class cash10 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (total_c + 10.00 < 10.01) {
			total_c += 10.00;
			txt.setText("$" + df.format(total_c));
			}
			else {
				infoBox("Machine Only Accepts Maximum of $10.00", "ERROR");
			}
		}
	}
	
	public class numENTER implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (input1 != "X" && input2 != "X") {
				if (input1 == "A") {
					if (input2 == "1") {
						if (A1 > 0) {
						total_due += 0.50;
						A1 -= 1;
						}
						else {
							infoBox("Out of stock", "Sorry");
						}
					}
					else if (input2 == "2") {
						if (A2 > 0) {
						total_due += 1.25;
						A2 -= 1;
						}
						else {
							infoBox("Out of stock", "Sorry");
						}
					}
					else if (input2 == "3") {
						if (A3 > 0) {
						total_due += 2.00;
						A3 -= 1;
						}
						else {
							infoBox("Out of stock", "Sorry");
						}
					}
					else {
						infoBox("Please Input Valid Code", "Invalid Goody Selected");
					}
				}
				else if (input1 == "B") {
					if (input2 == "1") {
						if (B1 > 0) {
						total_due += 0.50;
						B1 -= 1;
						}
						else {
							infoBox("Out of stock", "Sorry");
						}
					}
					else if (input2 == "2") {
						if (B2 > 0) {
						total_due += 1.25;
						B2 -= 1;
						}
						else {
							infoBox("Out of stock", "Sorry");
						}
					}
					else if (input2 == "3") {
						if (B3 > 0) {
						total_due += 2.00;
						B3 -= 1;
						}
						else {
							infoBox("Out of stock", "Sorry");
						}
					}
					else {
						infoBox("Please Input Valid Code", "Invalid Goody Selected");
					}
				}
				else if (input1 == "C") {
					if (input2 == "1") {
						if (C1 > 0) {
						total_due += 0.50;
						C1 -= 1;
						}
						else {
							infoBox("Out of stock", "Sorry");
						}
					}
					else if (input2 == "2") {
						if (C2 > 0) {
						total_due += 1.25;
						C2 -= 1;
						}
						else {
							infoBox("Out of stock", "Sorry");
						}
					}
					else if (input2 == "3") {
						if (C3 > 0) {
						total_due += 2.00;
						C3 -= 1;
						}
						else {
							infoBox("Out of stock", "Sorry");
						}
					}
					else {
						infoBox("Please Input Valid Code", "Invalid Goody Selected");
					}
				}
				
			else {
				infoBox("Please Input Goody Codes", "No Goody Selected");
			}
			input1 = "X";
			input2 = "X";
			txtinput2.setText(input1 + input2);
			
			if (total_due > 10) {
				total_due = prev_total;
				infoBox("Please do not exceed $10.00", "ERROR");
			} else {
				prev_total = total_due;
			}
			txtinput.setText("Total: $" + df.format(total_due));
		}
		}
	}
	
    
    //
    
	public void reset() {
	    total_c = 0.00;
	    change_due = 0.00;
		txt.setText("$" + df.format(total_c));
		input1 = "X";
		input2 = "X";
		txtinput2.setText(input1+input2);
		total_due = 0.00;
		txtinput.setText("Total: $" + df.format(total_due));
		prev_total = total_due;
	}
	
	public class Reset implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			reset();
		}
	}
	
	
	public class FINISH implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (total_due != 0.00 && total_c != 0.00 && total_due <= total_c) {
				change_due = total_c - total_due;
				infoBox("Thank you! Change due: $" + df.format(change_due), "Enjoy!");
			}
			else {
				infoBox("Please review the balance", "ERROR");
			}
		}
	}
}