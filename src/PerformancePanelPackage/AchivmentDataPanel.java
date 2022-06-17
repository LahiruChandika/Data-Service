package PerformancePanelPackage;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

@SuppressWarnings("serial")
public class AchivmentDataPanel extends JPanel {

	
	public AchivmentDataPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 0;
		add(separator, gbc_separator);
		
		JLabel lblNewLabel = new JLabel("Total Target =");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
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
		
		JLabel lblTarget = new JLabel("17500");
		lblTarget.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTarget = new GridBagConstraints();
		gbc_lblTarget.anchor = GridBagConstraints.WEST;
		gbc_lblTarget.insets = new Insets(0, 0, 5, 0);
		gbc_lblTarget.gridx = 3;
		gbc_lblTarget.gridy = 1;
		add(lblTarget, gbc_lblTarget);
		
		JLabel lblNewLabel_2 = new JLabel("Total Attributes =");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblAttributes = new JLabel("17150");
		lblAttributes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblAttributes = new GridBagConstraints();
		gbc_lblAttributes.anchor = GridBagConstraints.WEST;
		gbc_lblAttributes.insets = new Insets(0, 0, 5, 0);
		gbc_lblAttributes.gridx = 3;
		gbc_lblAttributes.gridy = 2;
		add(lblAttributes, gbc_lblAttributes);
		
		JLabel lblNewLabel_1 = new JLabel("Total Arrears =");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lbl_Arrears = new JLabel("350");
		lbl_Arrears.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lbl_Arrears = new GridBagConstraints();
		gbc_lbl_Arrears.anchor = GridBagConstraints.WEST;
		gbc_lbl_Arrears.insets = new Insets(0, 0, 5, 0);
		gbc_lbl_Arrears.gridx = 3;
		gbc_lbl_Arrears.gridy = 3;
		add(lbl_Arrears, gbc_lbl_Arrears);
		
		JSeparator separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.gridwidth = 2;
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 2;
		gbc_separator_3.gridy = 5;
		add(separator_3, gbc_separator_3);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 2;
		gbc_separator_2.gridy = 6;
		add(separator_2, gbc_separator_2);
		
		JCheckBox chckbxMonthly = new JCheckBox("Monthly");
		chckbxMonthly.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_chckbxMonthly = new GridBagConstraints();
		gbc_chckbxMonthly.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxMonthly.anchor = GridBagConstraints.WEST;
		gbc_chckbxMonthly.gridx = 2;
		gbc_chckbxMonthly.gridy = 7;
		add(chckbxMonthly, gbc_chckbxMonthly);

	}

}
