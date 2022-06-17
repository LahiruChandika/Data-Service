package MyPlansTab;

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

import PerformancePanelPackage.AchivmentPanel;
import PerformancePanelPackage.InsertInfo_Dashboard;
import PerformancePanelPackage.QualityPanel;
import PerformancePanelPackage.WorkTimePanel;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

public class MyPlans_Panel extends JPanel  {

	private InsertInfo_Dashboard insertInfo;
	private JSeparator separator_2;
	private JButton btnBack;
	private JButton btnNext;
	private QualityPanel qualityPanel;
	private AchivmentPanel achivmentPanel;
	private WorkTimePanel workTimePanel;
	private JPanel panel_CardLayout;

	public MyPlans_Panel() {
		insertInfo = new InsertInfo_Dashboard();
		qualityPanel = new QualityPanel();
		achivmentPanel = new AchivmentPanel();
		workTimePanel = new WorkTimePanel();
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		panel_CardLayout = new JPanel();
		GridBagConstraints gbc_panel_CardLayout = new GridBagConstraints();
		gbc_panel_CardLayout.insets = new Insets(0, 0, 5, 5);
		gbc_panel_CardLayout.fill = GridBagConstraints.BOTH;
		gbc_panel_CardLayout.gridx = 1;
		gbc_panel_CardLayout.gridy = 1;
		add(panel_CardLayout, gbc_panel_CardLayout);
		
		CardLayout cardLayout = new CardLayout();
		panel_CardLayout.setLayout(cardLayout);
		
		panel_CardLayout.add(achivmentPanel, "name_693980589535600");
		
		panel_CardLayout.add(qualityPanel, "name_694002174168800");
		
//		panel_2 = new JPanel();
		panel_CardLayout.add(workTimePanel, "name_694026369505200");
		
		IconFontSwing.register(FontAwesome.getIconFont());
		//add back icon
        ImageIcon iconBack = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_LEFT, 60.0f, Color.BLACK);
		btnBack = new JButton(iconBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.previous(panel_CardLayout);
			}
		});
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.fill = GridBagConstraints.VERTICAL;
		gbc_btnBack.insets = new Insets(0, 0, 5, 5);
		gbc_btnBack.gridx = 0;
		gbc_btnBack.gridy = 1;
		add(btnBack, gbc_btnBack);
		
		//add next icon
		ImageIcon iconNext= (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_RIGHT, 60.0f, Color.BLACK);
		
		btnNext = new JButton(iconNext);
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(panel_CardLayout);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 1;
		add(btnNext, gbc_btnNewButton);
		
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
		
		GridBagConstraints gbc_panel_CardLayout1 = new GridBagConstraints();
		gbc_panel_CardLayout1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_CardLayout1.fill = GridBagConstraints.BOTH;
		gbc_panel_CardLayout1.gridx = 1;
		gbc_panel_CardLayout1.gridy = 5;
		add(insertInfo, gbc_panel_CardLayout1);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridx = 4;
		gbc_separator.gridy = 6;
		add(separator, gbc_separator);

	}
	
}
