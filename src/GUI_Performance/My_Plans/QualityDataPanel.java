package GUI_Performance.My_Plans;

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

@SuppressWarnings("serial")
public class QualityDataPanel extends JPanel {

	public QualityDataPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 0;
		add(separator, gbc_separator);
		
		JLabel lblNewLabel = new JLabel("Total Clip Count ");
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
		gbc_separator_1.gridheight = 7;
		gbc_separator_1.insets = new Insets(0, 0, 0, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 1;
		add(separator_1, gbc_separator_1);
		
		JLabel label_2 = new JLabel(":");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 3;
		gbc_label_2.gridy = 1;
		add(label_2, gbc_label_2);
		
		JLabel lbltotClipCunt = new JLabel("20");
		lbltotClipCunt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lbltotClipCunt = new GridBagConstraints();
		gbc_lbltotClipCunt.anchor = GridBagConstraints.WEST;
		gbc_lbltotClipCunt.insets = new Insets(0, 0, 5, 0);
		gbc_lbltotClipCunt.gridx = 4;
		gbc_lbltotClipCunt.gridy = 1;
		add(lbltotClipCunt, gbc_lbltotClipCunt);
		
		JLabel lblNewLabel_2 = new JLabel("Total 0 IQ Clip Count ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel(":");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 3;
		gbc_lblNewLabel_6.gridy = 2;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblTotIQClipCunt = new JLabel("3");
		lblTotIQClipCunt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTotIQClipCunt = new GridBagConstraints();
		gbc_lblTotIQClipCunt.anchor = GridBagConstraints.WEST;
		gbc_lblTotIQClipCunt.insets = new Insets(0, 0, 5, 0);
		gbc_lblTotIQClipCunt.gridx = 4;
		gbc_lblTotIQClipCunt.gridy = 2;
		add(lblTotIQClipCunt, gbc_lblTotIQClipCunt);
		
		JLabel lblNewLabel_1 = new JLabel("Internal Bounce ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel label = new JLabel(":");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 3;
		add(label, gbc_label);
		
		JLabel lblInternalBouncecunt = new JLabel("98.3%");
		lblInternalBouncecunt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblInternalBouncecunt = new GridBagConstraints();
		gbc_lblInternalBouncecunt.anchor = GridBagConstraints.WEST;
		gbc_lblInternalBouncecunt.insets = new Insets(0, 0, 5, 0);
		gbc_lblInternalBouncecunt.gridx = 4;
		gbc_lblInternalBouncecunt.gridy = 3;
		add(lblInternalBouncecunt, gbc_lblInternalBouncecunt);
		
		JLabel lblNewLabel_3 = new JLabel("Quality Bonus ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 4;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel label_1 = new JLabel(":");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 3;
		gbc_label_1.gridy = 4;
		add(label_1, gbc_label_1);
		
		JLabel lblNewLabel_4 = new JLabel("Not Eligible");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_4.gridx = 4;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 2;
		gbc_separator_2.gridy = 6;
		add(separator_2, gbc_separator_2);
		
		JCheckBox chckbxMonthly = new JCheckBox("Monthly");
		chckbxMonthly.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_chckbxMonthly = new GridBagConstraints();
		gbc_chckbxMonthly.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxMonthly.anchor = GridBagConstraints.WEST;
		gbc_chckbxMonthly.gridx = 2;
		gbc_chckbxMonthly.gridy = 7;
		add(chckbxMonthly, gbc_chckbxMonthly);

	}
	
}
