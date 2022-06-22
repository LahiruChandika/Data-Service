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
import PerformancePanelPackage.Achivement.MyPlans_Achivement;
import PerformancePanelPackage.Quality.MyPlane_QualityPanel;

@SuppressWarnings("serial")
public class MyPlans extends JPanel {
	private JSeparator separator_2;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private Insertinfo_myPlans insertinfo;
	private MyPlans_Achivement achivement;
	private MyPlane_QualityPanel quality;
	private JSeparator separator_3;
	private JSeparator separator_4;
	
	public MyPlans() {
		
		insertinfo = new Insertinfo_myPlans();
		achivement = new MyPlans_Achivement();
		quality = new MyPlane_QualityPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		separator_4 = new JSeparator();
		separator_4.setPreferredSize(new Dimension(10, 2));
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 1;
		gbc_separator_4.gridy = 1;
		add(separator_4, gbc_separator_4);
		
		separator_3 = new JSeparator();
		separator_3.setPreferredSize(new Dimension(10, 2));
		separator_3.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.gridheight = 5;
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 2;
		add(separator_3, gbc_separator_3);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 2;
		add(tabbedPane, gbc_tabbedPane);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		panel = new JPanel();
		tabbedPane.addTab("Achivement", null, achivement, null);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		tabbedPane.addTab("Quality", null, quality, null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(10, 2));
		separator_1.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridheight = 5;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 3;
		gbc_separator_1.gridy = 2;
		add(separator_1, gbc_separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setPreferredSize(new Dimension(0, 10));
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 4;
		add(separator_2, gbc_separator_2);
		
		GridBagConstraints gbc_insertInfo_myplans = new GridBagConstraints();
		gbc_insertInfo_myplans.insets = new Insets(0, 0, 5, 5);
		gbc_insertInfo_myplans.fill = GridBagConstraints.BOTH;
		gbc_insertInfo_myplans.gridx = 1;
		gbc_insertInfo_myplans.gridy = 6;
		add(insertinfo, gbc_insertInfo_myplans);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridx = 4;
		gbc_separator.gridy = 7;
		add(separator, gbc_separator);

	}

}
