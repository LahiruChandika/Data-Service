package PerformancePanelPackage;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import InsertPanels_Dashboard.InsertInfo_Dashboard;
import LayerPanel.Dash_CardLayoutPanel;
import PerformancePanelPackage.Achivement.AchivmentPanel;
import PerformancePanelPackage.Quality.QualityPanel;
import PerformancePanelPackage.WorkTime.WorkTimePanel;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

@SuppressWarnings("serial")
public class DashboardPanel extends JPanel {
	private InsertInfo_Dashboard insertInfo;
	private JPanel panel;
	private Dash_CardLayoutPanel dashCardLayout;
	public DashboardPanel() {
		insertInfo = new InsertInfo_Dashboard();
		insertInfo.setBorder(new LineBorder(Color.GRAY, 3, true));
		dashCardLayout = new Dash_CardLayoutPanel();
		dashCardLayout.setBorder(new LineBorder(Color.GRAY, 3, true));
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		IconFontSwing.register(FontAwesome.getIconFont());
		//add back icon
        ImageIcon iconBack = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_LEFT, 60.0f, Color.BLACK);
		
		//add next icon
		ImageIcon iconNext= (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_RIGHT, 60.0f, Color.BLACK);
		
//		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(15, 10, 5, 10);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		add(dashCardLayout, gbc_panel);
		
		GridBagConstraints gbc_panel_CardLayout1 = new GridBagConstraints();
		gbc_panel_CardLayout1.insets = new Insets(5, 10, 10, 10);
		gbc_panel_CardLayout1.fill = GridBagConstraints.BOTH;
		gbc_panel_CardLayout1.gridx = 1;
		gbc_panel_CardLayout1.gridy = 2;
		add(insertInfo, gbc_panel_CardLayout1);

	}

}
