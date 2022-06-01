import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.RingPlot;
import org.jfree.data.general.PieDataset;

import PerformancePanelPackage.DashboardPanel;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

public class PerformancePanel extends JPanel {
	
	private DashboardPanel dashboardPanel;

	public PerformancePanel() {
		dashboardPanel = new DashboardPanel();
		
		setLayout(new BorderLayout(0, 0));
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(tabbedPane, BorderLayout.CENTER);
		
		IconFontSwing.register(FontAwesome.getIconFont());
		//add DashbboardPanel and Icon
        ImageIcon iconDash = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.TH_LARGE, 30.0f, Color.BLACK);
		tabbedPane.addTab("Dashboard", iconDash, dashboardPanel, null);
		
		//History change icon
		JPanel panelHistory = new JPanel();
		ImageIcon iconHistory = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.HISTORY, 30.0f, Color.BLACK);
		tabbedPane.addTab("History", iconHistory, panelHistory, null);
				
				
		//My Plans change icon
		JPanel panelMyPlans = new JPanel();
		ImageIcon iconPlans = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.LIST, 30.0f, Color.BLACK);
		tabbedPane.addTab("My Plans", iconPlans, panelMyPlans, null);
				
		//My Clips change icon
		JPanel panelMyClips = new JPanel();
		ImageIcon iconClips = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.YOUTUBE_PLAY, 30.0f, Color.BLACK);
		tabbedPane.addTab("My Clips", iconClips, panelMyClips, null);
	
	}
	
}
