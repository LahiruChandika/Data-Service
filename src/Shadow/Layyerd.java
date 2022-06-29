package Shadow;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import GUI.LabelIcon;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import java.awt.Dimension;
import java.awt.Color;

public class Layyerd {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layyerd window = new Layyerd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Layyerd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 564, 439);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel footer = new JPanel();
		footer.setPreferredSize(new Dimension(10, 50));
		frame.getContentPane().add(footer, BorderLayout.SOUTH);
		
		JPanel mainPanel = new JPanel();
		frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(12, 13, 522, 316);
		mainPanel.add(panel);
		panel.setLayout(null);
		
		JPanel settingPanel = new JPanel();
		settingPanel.setBackground(Color.ORANGE);
		settingPanel.setBounds(355, 68, 139, 81);
		panel.add(settingPanel);
		settingPanel.hide();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 240, 240));
		panel_1.setBounds(410, 13, 82, 54);
		panel.add(panel_1);
		
		
		IconFontSwing.register(FontAwesome.getIconFont());
		
		//Notification icon
		Icon iconNottification = IconFontSwing.buildIcon((IconCode)FontAwesome.COG, 45.0f, (new Color(148,148,148)));
		LabelIcon labelIcon = new LabelIcon(iconNottification);
		labelIcon.setBounds(278, 13, 83, 49);
		
		labelIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (settingPanel.isVisible()) {
					settingPanel.hide();
				}else {
					settingPanel.show();
				}
			
			}
		});
		
		panel_1.add(labelIcon);
		
		
		
	}

}


