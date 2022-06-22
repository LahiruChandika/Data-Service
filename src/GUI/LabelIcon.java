package GUI;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LabelIcon extends JPanel {
	
	public LabelIcon(Icon icon) {
		setLayout(new GridBagLayout());
		
		JLabel lblIcon = new JLabel(icon);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		add(lblIcon, gbc_lblNewLabel_1);
	}
	
	public LabelIcon(String name, Icon icon) {

		setLayout(new GridBagLayout());
		JLabel lblName = new JLabel(name);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblName, gbc_lblNewLabel);
		
		JLabel lblIcon = new JLabel(icon);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		add(lblIcon, gbc_lblNewLabel_1);
		
	}
}
