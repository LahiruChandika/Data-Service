package PerformancePanelPackage;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import MyPlansTab.Insertinfo_myPlans;
import MyPlansTab.MyPlans_TabbedPane;
import PerformancePanelPackage.Achivement.MyPlans_Achivement;
import PerformancePanelPackage.Quality.MyPlane_QualityPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;

@SuppressWarnings("serial")
public class MyPlans extends JPanel {
	private JPanel panel;
	private Insertinfo_myPlans insertinfo;
	private MyPlans_TabbedPane myPlans_Tabbedpane;
	
	public MyPlans() {
		
		insertinfo = new Insertinfo_myPlans();
		insertinfo.setBorder(new LineBorder(Color.GRAY, 3, true));
		myPlans_Tabbedpane = new MyPlans_TabbedPane();
		myPlans_Tabbedpane.setBorder(new LineBorder(Color.GRAY, 3, true));
		
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
