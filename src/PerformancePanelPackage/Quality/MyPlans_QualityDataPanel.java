package PerformancePanelPackage.Quality;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class MyPlans_QualityDataPanel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	public MyPlans_QualityDataPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(0, 5));
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 0;
		add(separator, gbc_separator);
		
		JLabel lblNewLabel = new JLabel("Clip Count       :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridheight = 8;
		gbc_separator_1.insets = new Insets(0, 0, 0, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 1;
		add(separator_1, gbc_separator_1);
		
		JLabel lblClipCount = new JLabel("17");
		lblClipCount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblClipCount = new GridBagConstraints();
		gbc_lblClipCount.anchor = GridBagConstraints.WEST;
		gbc_lblClipCount.insets = new Insets(0, 0, 5, 0);
		gbc_lblClipCount.gridx = 3;
		gbc_lblClipCount.gridy = 1;
		add(lblClipCount, gbc_lblClipCount);
		
		JLabel lblNewLabel_2 = new JLabel("0 Clip Count    :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lbl0ClipCount = new JLabel("07");
		lbl0ClipCount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lbl0ClipCount = new GridBagConstraints();
		gbc_lbl0ClipCount.anchor = GridBagConstraints.WEST;
		gbc_lbl0ClipCount.insets = new Insets(0, 0, 5, 0);
		gbc_lbl0ClipCount.gridx = 3;
		gbc_lbl0ClipCount.gridy = 2;
		add(lbl0ClipCount, gbc_lbl0ClipCount);
		
		JLabel lblNewLabel_1 = new JLabel("IQ = 100% Clip count (input)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 4;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 4;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("IQ = \"input\" Clip count");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 5;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 5;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 2;
		gbc_separator_2.gridy = 7;
		add(separator_2, gbc_separator_2);

	}
	
}

