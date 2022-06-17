import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import PerformancePanelPackage.DashboardPanel;
import PerformancePanelPackage.HistoryPanel;
import PerformancePanelPackage.MyPlans;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;
import javax.swing.JSeparator;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;

@SuppressWarnings("serial")
public class PerformancePanel extends JPanel {
	
	private DashboardPanel dashboardPanel;
	private MyPlans myPlans;
	private HistoryPanel historyPanel;

	public PerformancePanel() {
		dashboardPanel = new DashboardPanel();
		historyPanel = new HistoryPanel();
		myPlans = new MyPlans();
		
		GridBagLayout gridBagLayout = (GridBagLayout) dashboardPanel.getLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, -5};
		
		setLayout(new BorderLayout(0, 0));
		
		UIManager.put("TabbedPane.selected", Color.red);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(tabbedPane, BorderLayout.CENTER);
		
		IconFontSwing.register(FontAwesome.getIconFont());
		//add DashbboardPanel and Icon
        ImageIcon iconDash = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.TH_LARGE, 30.0f, Color.BLACK);
		tabbedPane.addTab("Dashboard  ", iconDash, dashboardPanel, null);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 10;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 3;
		dashboardPanel.add(separator, gbc_separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.gridheight = 10;
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 6;
		gbc_separator_2.gridy = 3;
		dashboardPanel.add(separator_2, gbc_separator_2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridheight = 10;
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.gridx = 7;
		gbc_separator_1.gridy = 3;
		dashboardPanel.add(separator_1, gbc_separator_1);
		
		//History change icon
//		JPanel panelHistory = new JPanel();
		ImageIcon iconHistory = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.HISTORY, 30.0f, Color.BLACK);
		tabbedPane.addTab("History  ", iconHistory, historyPanel, null);
				
				
		//My Plans change icon
		ImageIcon iconPlans = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.LIST, 30.0f, Color.BLACK);
		tabbedPane.addTab("My Plans  ", iconPlans, myPlans, null);
				
		//My Clips change icon
		JPanel panelMyClips = new JPanel();
		ImageIcon iconClips = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.YOUTUBE_PLAY, 30.0f, Color.BLACK);
		tabbedPane.addTab("My Clips  ", iconClips, panelMyClips, null);	
	}	
}
