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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JButton btnNewButton;
	
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
		frame.setBounds(100, 100, 1010, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		mainPanel = new JPanel();
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		//header panel
		headerPanel = new JPanel();
		mainPanel.add(headerPanel, BorderLayout.NORTH);
			
		headerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));

		IconFontSwing.register(FontAwesome.getIconFont());

		//Notification icon
		Icon iconNottification = IconFontSwing.buildIcon((IconCode)FontAwesome.COG, 30.0f, (new Color(148,148,148)));	
		Icon iconSignOut= IconFontSwing.buildIcon((IconCode)FontAwesome.SIGN_OUT, 30.0f, (new Color(148,148,148)));
		JPopupMenu popUp = new JPopupMenu();
		popUp.setSize(150, 400);
		switchbutton = new SwitchButton();
		popUp.add(new LabelIcon("Change Theme", switchbutton));
		popUp.add(new LabelIcon("Log Out" ,iconSignOut));
		
		switchbutton.addEventSelected(new EventSwitchSelected() {
            @Override
            public void onSelected(boolean selected) {
                if (selected) {
                	changeLaf(frame, "Light");
                } else {
                	changeLaf(frame, "Dark");
                }
            }
        });
		
		btnNewButton = new JButton(iconNottification);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				popUp.show(btnNewButton,0,btnNewButton.getHeight());
			}
		});
		headerPanel.add(btnNewButton);
		
		
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

}
