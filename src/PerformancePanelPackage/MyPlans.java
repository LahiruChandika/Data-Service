package PerformancePanelPackage;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;

import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.Font;

public class MyPlans extends JPanel {
	private JSeparator separator_2;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel insertInfo_myplans;
	private insertinfo_myPlans insertinfo;
	private MyPlans_Achivement achivement;
	private MyPlane_QualityPanel quality;
	
	public MyPlans() {
		
		insertinfo = new insertinfo_myPlans();
		achivement = new MyPlans_Achivement();
		quality = new MyPlane_QualityPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 1;
		add(tabbedPane, gbc_tabbedPane);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		panel = new JPanel();
		tabbedPane.addTab("Achivement", null, achivement, null);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_1 = new JPanel();
		tabbedPane.addTab("Quality", null, quality, null);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridheight = 5;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 3;
		gbc_separator_1.gridy = 1;
		add(separator_1, gbc_separator_1);
		
		separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 3;
		add(separator_2, gbc_separator_2);
		
		GridBagConstraints gbc_insertInfo_myplans = new GridBagConstraints();
		gbc_insertInfo_myplans.insets = new Insets(0, 0, 5, 5);
		gbc_insertInfo_myplans.fill = GridBagConstraints.BOTH;
		gbc_insertInfo_myplans.gridx = 1;
		gbc_insertInfo_myplans.gridy = 5;
		add(insertinfo, gbc_insertInfo_myplans);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridx = 4;
		gbc_separator.gridy = 6;
		add(separator, gbc_separator);

	}

}
