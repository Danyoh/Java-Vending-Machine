package cp213;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Vending machine model. Contains the algorithms for vending products, handling
 * change and inventory, and working with credit. Should not perform any GUI
 * work of any kind.
 *
 * @author Daniel Nguyen
 * @version 2021-03-19
 */


public class VendModel extends JPanel {
	
	public class Action implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFrame frametest = new JFrame("Clicked");
			frametest.setVisible(true);
			frametest.setSize(100,100);
			JLabel labeltest = new JLabel("You clicked me");
			JPanel paneltest = new JPanel();
			frametest.add(paneltest);
			frametest.add(labeltest);
		}
	}

	  
}

    	