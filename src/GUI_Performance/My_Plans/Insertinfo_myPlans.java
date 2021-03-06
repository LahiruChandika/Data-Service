package GUI_Performance.My_Plans;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import GUI_Performance.Dashboard.DaysPanel;
import GUI_Performance.Dashboard.projectInfopanel_MyPlans;

@SuppressWarnings("serial")
public class Insertinfo_myPlans extends JPanel {
	
	private projectInfopanel_MyPlans projectInfoPanel_Myplans;
	private DaysPanel daysPanel;

	public Insertinfo_myPlans() {
		
		projectInfoPanel_Myplans = new projectInfopanel_MyPlans();
		daysPanel = new  DaysPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(10, 0, 10, 10);
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 1;
		add(projectInfoPanel_Myplans, gbc_panel_2);
		
		
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.HORIZONTAL;
		gbc_panel.insets = new Insets(10, 30, 10, 10);
		gbc_panel.gridx = 3;
		gbc_panel.gridy = 1;
		add(daysPanel, gbc_panel);

	}

}
