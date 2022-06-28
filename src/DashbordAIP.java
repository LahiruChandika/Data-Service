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
	
	public static void changeLaf(final JFrame frame, final String laf) {
        if (laf.equals("Dark")) {
            try {
                UIManager.setLookAndFeel((LookAndFeel)new FlatDarkLaf());
            }
            catch (Exception e) {
                System.err.println("Failed to initialize LaF");
            }
        }
        if (laf.equals("Light")) {
            try {
                UIManager.setLookAndFeel((LookAndFeel)new FlatLightLaf());
            }
            catch (Exception e) {
                System.err.println("Failed to initialize LaF");
            }
        }
        SwingUtilities.updateComponentTreeUI(frame);
    }


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Look and feel
//					UIManager.setLookAndFeel((LookAndFeel)new FlatLightLaf());
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
		
		//Add Navigation panel
//		JPanel panel = new JPanel();
//		frame.getContentPane().add(panel, BorderLayout.WEST);
//		panel.setLayout(new BorderLayout(0, 0));
//		panel.add((Component)navBar);
		
		mainPanel = new JPanel();
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		headerPanel = new JPanel();
		mainPanel.add(headerPanel, BorderLayout.NORTH);
		headerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));

		IconFontSwing.register(FontAwesome.getIconFont());

		//Notification icon
		Icon iconNottification = IconFontSwing.buildIcon((IconCode)FontAwesome.COG, 30.0f, (new Color(148,148,148)));
		Icon iconLog = IconFontSwing.buildIcon((IconCode)FontAwesome.LOCK, 30.0f, (new Color(148,148,148)));
		LabelIcon labelIcon = new LabelIcon(iconNottification);
		SettingPanel st = new SettingPanel();
		headerPanel.add(st);
		st.hide();
		labelIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (st.isVisible()) {
					st.hide();
				}else {
					st.show();
				}
				
				
			}
		});
		headerPanel.add(labelIcon);
		

//		Icon iconLog1 = IconFontSwing.buildIcon((IconCode)FontAwesome.LOCK, 30.0f, (new Color(148,148,148)));
//		comboBox = new DropDownMenu();
//		comboBox.setModel((ComboBoxModel) new LabelIcon("username", iconLog1));
//		headerPanel.add(comboBox);
//		headerPanel.add(new LabelIcon(iconNottification));
		
		//User icon
		Icon iconAcc = IconFontSwing.buildIcon((IconCode)FontAwesome.USER, 30.0f, (new Color(148,148,148)));		
		//add account icon and name
		LabelIcon labelIcon_1 = new LabelIcon("username", iconAcc);
		headerPanel.add(labelIcon_1);
		
		popupMenu = new JPopupMenu();
		addPopup(labelIcon_1, popupMenu);
		
		mntmNewMenuItem = new JMenuItem("New menu item");
		popupMenu.add(mntmNewMenuItem);
		
		//add tabbed pane
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		mainPanel.add(tabbedPane, BorderLayout.CENTER);
		
		//add Directories panel to tabbed pane
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 16));
		tabbedPane.addTab("Directories", null, directoriesPanel, null);
		//add Performance panel to tabbed pane
		tabbedPane.addTab("Performance", null, performancePanel, null);
	
//		switchbutton.addEventSelected(new EventSwitchSelected() {
//            @Override
//            public void onSelected(boolean selected) {
//                if (selected) {
//                	changeLaf(frame, "Dark");
//                } else {
//                	changeLaf(frame, "Light");
//                }
//            }
//        });
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
