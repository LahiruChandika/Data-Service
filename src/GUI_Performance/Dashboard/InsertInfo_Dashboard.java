package GUI_Performance.Dashboard;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

@SuppressWarnings("serial")
public class InsertInfo_Dashboard extends JPanel {
	
	private ProjectInfoPanel projectInfoPanel;
	private AlocatedAdminsPanel alocatedAdminsPanel;
	private DaysPanel daysPanel;

	public InsertInfo_Dashboard() {
		
		projectInfoPanel = new ProjectInfoPanel();
		alocatedAdminsPanel = new  AlocatedAdminsPanel();
		daysPanel = new  DaysPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.gridheight = 2;
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 0;
		gbc_separator_2.gridy = 0;
		add(separator_2, gbc_separator_2);
		
		JSeparator separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.gridwidth = 6;
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 1;
		gbc_separator_3.gridy = 0;
		add(separator_3, gbc_separator_3);
		
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(10, 10, 5, 5);
		gbc_panel_2.gridx = 2;
		gbc_panel_2.gridy = 1;
		add(projectInfoPanel, gbc_panel_2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.gridheight = 2;
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 3;
		gbc_separator_4.gridy = 1;
		add(separator_4, gbc_separator_4);
		
		
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(10, 0, 5, 5);
		gbc_panel_1.gridx = 4;
		gbc_panel_1.gridy = 1;
		add(alocatedAdminsPanel, gbc_panel_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.insets = new Insets(0, 0, 5, 5);
		gbc_separator_5.gridx = 5;
		gbc_separator_5.gridy = 1;
		add(separator_5, gbc_separator_5);
		
		
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(10, 0, 5, 10);
		gbc_panel.gridx = 6;
		gbc_panel.gridy = 1;
		add(daysPanel, gbc_panel);
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridheight = 2;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 7;
		gbc_separator_1.gridy = 0;
		add(separator_1, gbc_separator_1);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 8;
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 3;
		add(separator, gbc_separator);

	}

}
