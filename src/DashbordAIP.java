import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import GUI.EventSwitchSelected;
import GUI.LabelIcon;
import GUI.SettingPanel;
import GUI.SwitchButton;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JLayeredPane;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class DashbordAIP {

	private JFrame frame;
//	private NavBar navBar;
	private JPanel mainPanel;
	private JPanel headerPanel;
	private DirectoriesPanel directoriesPanel;
	private PerformancePanel performancePanel;
	private SwitchButton switchbutton;
	private JPopupMenu popupMenu;
	private JMenuItem mntmNewMenuItem;
	private JPanel footer;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Look and feel
					UIManager.setLookAndFeel((LookAndFeel)new FlatDarkLaf());
					DashbordAIP window = new DashbordAIP();
					window.frame.setMinimumSize(new Dimension(1200, 700));
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DashbordAIP() {
		directoriesPanel = new DirectoriesPanel();
		performancePanel = new PerformancePanel();
		
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 846, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		mainPanel = new JPanel();
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		headerPanel = new JPanel();
		mainPanel.add(headerPanel, BorderLayout.NORTH);
			
		headerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));

		IconFontSwing.register(FontAwesome.getIconFont());

		//Notification icon
		Icon iconNottification = IconFontSwing.buildIcon((IconCode)FontAwesome.COG, 30.0f, (new Color(148,148,148)));
		LabelIcon labelIcon = new LabelIcon(iconNottification);
		GridBagLayout gridBagLayout = (GridBagLayout) labelIcon.getLayout();
		gridBagLayout.rowWeights = new double[]{1.0};
		gridBagLayout.columnWeights = new double[]{1.0};
		
		//setting popup panel
//		SettingPanel st = new SettingPanel();
//		headerPanel.add(st);
//		st.hide();
//		labelIcon.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent arg0) {
//				if (st.isVisible()) {
//					st.hide();
//					frame.repaint();
//				}else {
//					st.show();
//					frame.repaint();
//				}
//			}
//		});
		
		headerPanel.add(labelIcon);
		
		//User icon
		Icon iconAcc = IconFontSwing.buildIcon((IconCode)FontAwesome.USER, 30.0f, (new Color(148,148,148)));		
		//add account icon and name
		LabelIcon labelIcon_1 = new LabelIcon("username", iconAcc);
		headerPanel.add(labelIcon_1);
		
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
