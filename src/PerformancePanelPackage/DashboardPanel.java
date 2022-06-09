package PerformancePanelPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JSeparator;

import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class DashboardPanel extends JPanel {
	
	private AchivmentPanel achivmentPanel;
	private InsertInfo_Dashboard insertInfo;
	private JSeparator separator_2;
	private JButton btnBack;
	private JButton btnNext;
	private QualityPanel qualityPanel;

	public DashboardPanel() {
		
		achivmentPanel = new AchivmentPanel();
		insertInfo = new InsertInfo_Dashboard();
		qualityPanel = new QualityPanel();
		
		//create hashmap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1,"achivmentPanel");
		hm.put(2, "qualityPanel");
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		IconFontSwing.register(FontAwesome.getIconFont());
		//add back icon
        ImageIcon iconBack = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_LEFT, 60.0f, Color.BLACK);
		btnBack = new JButton(iconBack);
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 0;
		gbc_btnBack.gridy = 1;
		add(btnBack, gbc_btnBack);
		
		//Add achievement panel 
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 1;
		add(achivmentPanel, gbc_panel_1);
		
		//add next icon
		ImageIcon iconNext= (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_RIGHT, 60.0f, Color.BLACK);
		btnNext = new JButton(iconNext);
		btnNext.addActionListener(new AbstractAction("\u22b2Prev") {
			public void actionPerformed(ActionEvent arg0) {
				add(achivmentPanel, gbc_panel_1);
			}
		});
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.insets = new Insets(0, 0, 5, 5);
		gbc_btnNext.gridx = 2;
		gbc_btnNext.gridy = 1;
		add(btnNext, gbc_btnNext);
		
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
		
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 5;
		add(insertInfo, gbc_panel);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridx = 4;
		gbc_separator.gridy = 6;
		add(separator, gbc_separator);

	}

}
