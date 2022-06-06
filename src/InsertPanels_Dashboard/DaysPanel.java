package InsertPanels_Dashboard;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JSeparator;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class DaysPanel extends JPanel {

	
	public DaysPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridheight = 8;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 1;
		add(separator_1, gbc_separator_1);
		
		JLabel lblDays = new JLabel("25");
		lblDays.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblDays = new GridBagConstraints();
		gbc_lblDays.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDays.insets = new Insets(0, 0, 5, 5);
		gbc_lblDays.gridx = 1;
		gbc_lblDays.gridy = 1;
		add(lblDays, gbc_lblDays);
		
		JLabel lblTotalDays = new JLabel("Total Days");
		lblTotalDays.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblTotalDays = new GridBagConstraints();
		gbc_lblTotalDays.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblTotalDays.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalDays.gridx = 1;
		gbc_lblTotalDays.gridy = 2;
		add(lblTotalDays, gbc_lblTotalDays);
		
		JLabel lblRemainingDays_cunt = new JLabel("15");
		lblRemainingDays_cunt.setForeground(Color.RED);
		lblRemainingDays_cunt.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblRemainingDays_cunt = new GridBagConstraints();
		gbc_lblRemainingDays_cunt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblRemainingDays_cunt.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemainingDays_cunt.gridx = 1;
		gbc_lblRemainingDays_cunt.gridy = 4;
		add(lblRemainingDays_cunt, gbc_lblRemainingDays_cunt);
		
		JLabel lblRemainingDays = new JLabel("Remaining Days");
		lblRemainingDays.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblRemainingDays = new GridBagConstraints();
		gbc_lblRemainingDays.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblRemainingDays.insets = new Insets(0, 0, 5, 5);
		gbc_lblRemainingDays.gridx = 1;
		gbc_lblRemainingDays.gridy = 5;
		add(lblRemainingDays, gbc_lblRemainingDays);
		
		JLabel lblExtraDays_cunt = new JLabel("5");
		lblExtraDays_cunt.setFont(new Font("Tahoma", Font.BOLD, 25));
		GridBagConstraints gbc_lblExtraDays_cunt = new GridBagConstraints();
		gbc_lblExtraDays_cunt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblExtraDays_cunt.insets = new Insets(0, 0, 5, 5);
		gbc_lblExtraDays_cunt.gridx = 1;
		gbc_lblExtraDays_cunt.gridy = 7;
		add(lblExtraDays_cunt, gbc_lblExtraDays_cunt);
		
		JLabel lblExtraDays = new JLabel("Extra Days");
		lblExtraDays.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblExtraDays = new GridBagConstraints();
		gbc_lblExtraDays.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblExtraDays.insets = new Insets(0, 0, 5, 5);
		gbc_lblExtraDays.gridx = 1;
		gbc_lblExtraDays.gridy = 8;
		add(lblExtraDays, gbc_lblExtraDays);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 9;
		add(separator, gbc_separator);

	}

}
