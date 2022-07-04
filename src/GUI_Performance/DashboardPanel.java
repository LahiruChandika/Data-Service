package GUI_Performance;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;
import javax.swing.border.MatteBorder;
import GUI_Performance.Dashboard.Dash_CardLayoutPanel;
import GUI_Performance.Dashboard.InsertInfo_Dashboard;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class DashboardPanel extends JPanel {
	private InsertInfo_Dashboard insertInfo;
	private Dash_CardLayoutPanel dashCardLayout;
	public DashboardPanel() {
		setBorder(null);
		insertInfo = new InsertInfo_Dashboard();
		insertInfo.setBorder(new MatteBorder(1,0,0,0,(new Color(148,148,148))));
		insertInfo.setForeground(SystemColor.windowBorder);
		dashCardLayout = new Dash_CardLayoutPanel();
		
		
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		IconFontSwing.register(FontAwesome.getIconFont());
		IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_LEFT, 60.0f, Color.BLACK);
		
		IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_RIGHT, 60.0f, Color.BLACK);
		
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
