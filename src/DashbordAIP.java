import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import GUI_Performance.PerformancePanel;

public class DashbordAIP {

	private JFrame frame;
//	private NavBar navBar;
	private JPanel mainPanel;
	private Header headerPanel;
	private DirectoriesPanel directoriesPanel;
	private PerformancePanel performancePanel;
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
		headerPanel = new Header();
		
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
		mainPanel.add(headerPanel, BorderLayout.NORTH);
			
		
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
