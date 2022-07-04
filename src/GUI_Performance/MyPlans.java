package GUI_Performance;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import GUI_Performance.My_Plans.Insertinfo_myPlans;
import GUI_Performance.My_Plans.MyPlans_TabbedPane;

@SuppressWarnings("serial")
public class MyPlans extends JPanel {
	private JPanel panel;
	private Insertinfo_myPlans insertinfo;
	private MyPlans_TabbedPane myPlans_Tabbedpane;
	
	public MyPlans() {
		
		insertinfo = new Insertinfo_myPlans();
		insertinfo.setBorder(new MatteBorder(1,0,0,0,(new Color(148,148,148))));
		myPlans_Tabbedpane = new MyPlans_TabbedPane();
		myPlans_Tabbedpane.setBorder(null);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(15, 15, 5, 15);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 0;
		add(myPlans_Tabbedpane, gbc_panel_1);
		
		GridBagConstraints gbc_insertInfo_myplans = new GridBagConstraints();
		gbc_insertInfo_myplans.insets = new Insets(5, 15, 10, 15);
		gbc_insertInfo_myplans.fill = GridBagConstraints.BOTH;
		gbc_insertInfo_myplans.gridx = 1;
		gbc_insertInfo_myplans.gridy = 2;
		add(insertinfo, gbc_insertInfo_myplans);

	}

}
