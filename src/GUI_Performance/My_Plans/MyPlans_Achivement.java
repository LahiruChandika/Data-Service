package GUI_Performance.My_Plans;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import GUI_Performance.Dashboard.AchivmentDataPanel;
import java.awt.Dimension;

@SuppressWarnings("serial")
public class MyPlans_Achivement extends JPanel {

	private AchivmentDataPanel dataPanel;
	private TargetAchivementDataPanel dataPanelTarget;
	
	public MyPlans_Achivement() {
		
		dataPanel = new AchivmentDataPanel();
		dataPanelTarget = new TargetAchivementDataPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel_4 = new JLabel("100%");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(15, 10, 5, 5);
		gbc_lblNewLabel_4.gridx = 3;
		gbc_lblNewLabel_4.gridy = 1;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"0", "10%", "20%", "30%", "40%", "50%", "60%", "70%", "80%", "90%", "100%", "110%"}));
		comboBox.setMaximumRowCount(15);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.VERTICAL;
		gbc_comboBox.insets = new Insets(15, 0, 5, 5);
		gbc_comboBox.gridx = 6;
		gbc_comboBox.gridy = 1;
		add(comboBox, gbc_comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(80, 2));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 2;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 1;
		add(separator, gbc_separator);
		
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTH;
		gbc_panel_1.insets = new Insets(0, 10, 0, 5);
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 2;
		add(dataPanelTarget, gbc_panel_1);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.anchor = GridBagConstraints.NORTH;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.gridx = 6;
		gbc_panel.gridy = 2;
		add(dataPanel, gbc_panel);

	}

}
