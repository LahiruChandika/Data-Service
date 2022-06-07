import java.awt.EventQueue;
import javax.swing.Icon;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatLightLaf;

import jiconfont.swing.IconFontSwing;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JTabbedPane;
import javax.swing.LookAndFeel;

public class DashbordAIP {

	private JFrame frame;
	private NavBar navBar;
	private JPanel mainPanel;
	private JPanel headerPanel;
	private DirectoriesPanel directoriesPanel;
	private PerformancePanel performancePanel;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Look and feel
					UIManager.setLookAndFeel((LookAndFeel)new FlatLightLaf()); 
					DashbordAIP window = new DashbordAIP();
					window.frame.setMinimumSize(new Dimension(1000, 700));
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DashbordAIP() {
		navBar = new NavBar();
		directoriesPanel = new DirectoriesPanel();
		performancePanel = new PerformancePanel();
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 846, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		//Add Navigation panel
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		panel.add((Component)navBar);
		
		mainPanel = new JPanel();
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		headerPanel = new JPanel();
		mainPanel.add(headerPanel, BorderLayout.NORTH);
		headerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));

		IconFontSwing.register(FontAwesome.getIconFont());
		//mode change icon
        Icon iconMode = IconFontSwing.buildIcon((IconCode)FontAwesome.MOON_O, 45.0f, Color.BLACK);
		JLabel lblMode = new JLabel(iconMode);
		lblMode.setHorizontalAlignment(SwingConstants.RIGHT);
		headerPanel.add(lblMode);
		//Notification icon
		Icon iconNottification = IconFontSwing.buildIcon((IconCode)FontAwesome.BELL, 45.0f, Color.BLACK);
		JLabel lblNotification = new JLabel(iconNottification);
		lblNotification.setHorizontalAlignment(SwingConstants.RIGHT);
		headerPanel.add(lblNotification);
		//User account icon
		Icon iconAcc = IconFontSwing.buildIcon((IconCode)FontAwesome.USER, 45.0f, Color.BLACK);
		JLabel lblAccount = new JLabel(iconAcc);
		lblAccount.setVerticalAlignment(SwingConstants.TOP);
		lblAccount.setHorizontalAlignment(SwingConstants.RIGHT);
		headerPanel.add(lblAccount);
		
		//add tabbed pane
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		mainPanel.add(tabbedPane, BorderLayout.CENTER);
		
		//add Directories panel to tabbed pane
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		tabbedPane.addTab("Directories", null, directoriesPanel, null);
		//add Performance panel to tabbed pane
		tabbedPane.addTab("Performance", null, performancePanel, null);
	
	}
}
