package GUI_Utills;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class LabelIcon extends JPanel {
	
	
	public LabelIcon(String name, Icon icon) {

//		setLayout(new GridBagLayout());
//		JLabel lblName = new JLabel(name);
//		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
//		gbc_lblNewLabel.insets = new Insets(5, 5, 5, 5);
//		gbc_lblNewLabel.gridx = 0;
//		gbc_lblNewLabel.gridy = 0;
//		add(lblName, gbc_lblNewLabel);
//		
//		JLabel lblIcon = new JLabel(icon);
//		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
//		gbc_lblNewLabel_1.insets = new Insets (5,5,5,5);
//		gbc_lblNewLabel_1.gridx = 1;
//		gbc_lblNewLabel_1.gridy = 0;
//		add(lblIcon, gbc_lblNewLabel_1);
		
		setPreferredSize( new Dimension(120, 30) );
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		JLabel lblName = new JLabel(name);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		springLayout.putConstraint(SpringLayout.WEST, lblName, 10, SpringLayout.WEST, this);
		springLayout.putConstraint(SpringLayout.NORTH, lblName, 5, SpringLayout.WEST, this);
		lblName.setHorizontalTextPosition(SwingConstants.LEFT);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblName);
		
		
		JLabel lblIcon = new JLabel(icon);
		springLayout.putConstraint(SpringLayout.EAST, lblIcon, -10, SpringLayout.EAST, this);
		lblIcon.setVerticalAlignment(SwingConstants.BOTTOM);
		lblIcon.setHorizontalAlignment(SwingConstants.LEFT);
		add(lblIcon);
		
	}
	
	public LabelIcon (String name , Component com) {
		
		setLayout(new GridBagLayout());
		JLabel lblName = new JLabel(name);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(5, 5, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblName, gbc_lblNewLabel);
	
		Component cpn = com;
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets (5,5,5,5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		add(cpn, gbc_lblNewLabel_1);
		
	}
}
