package GUI_Performance.Dashboard;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class WorktimeDataPanel extends JPanel {

	public WorktimeDataPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 0;
		add(separator, gbc_separator);
		
		JLabel lblNewLabel = new JLabel("Req Work Time ");
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
		gbc_separator_1.gridheight = 6;
		gbc_separator_1.insets = new Insets(0, 0, 0, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 1;
		add(separator_1, gbc_separator_1);
		
		JLabel lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 3;
		gbc_lblNewLabel_3.gridy = 1;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblReqWT = new JLabel("56h");
		lblReqWT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblReqWT = new GridBagConstraints();
		gbc_lblReqWT.anchor = GridBagConstraints.WEST;
		gbc_lblReqWT.insets = new Insets(0, 0, 5, 0);
		gbc_lblReqWT.gridx = 4;
		gbc_lblReqWT.gridy = 1;
		add(lblReqWT, gbc_lblReqWT);
		
		JLabel lblNewLabel_2 = new JLabel("Active Work Time ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel(":");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 3;
		gbc_lblNewLabel_4.gridy = 2;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblActiveWT = new JLabel("47h");
		lblActiveWT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblActiveWT = new GridBagConstraints();
		gbc_lblActiveWT.anchor = GridBagConstraints.WEST;
		gbc_lblActiveWT.insets = new Insets(0, 0, 5, 0);
		gbc_lblActiveWT.gridx = 4;
		gbc_lblActiveWT.gridy = 2;
		add(lblActiveWT, gbc_lblActiveWT);
		
		JLabel lblNewLabel_1 = new JLabel("Arrears Work Time ");
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
		
		JLabel lblArrearsWT = new JLabel("9h");
		lblArrearsWT.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblArrearsWT = new GridBagConstraints();
		gbc_lblArrearsWT.anchor = GridBagConstraints.WEST;
		gbc_lblArrearsWT.insets = new Insets(0, 0, 5, 0);
		gbc_lblArrearsWT.gridx = 4;
		gbc_lblArrearsWT.gridy = 3;
		add(lblArrearsWT, gbc_lblArrearsWT);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 2;
		gbc_separator_2.gridy = 5;
		add(separator_2, gbc_separator_2);
		
		JCheckBox chckbxMonthly = new JCheckBox("Monthly");
		chckbxMonthly.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_chckbxMonthly = new GridBagConstraints();
		gbc_chckbxMonthly.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxMonthly.anchor = GridBagConstraints.WEST;
		gbc_chckbxMonthly.gridx = 2;
		gbc_chckbxMonthly.gridy = 6;
		add(chckbxMonthly, gbc_chckbxMonthly);

	}
	
}
