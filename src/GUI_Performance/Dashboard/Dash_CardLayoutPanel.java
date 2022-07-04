package GUI_Performance.Dashboard;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

@SuppressWarnings("serial")
public class Dash_CardLayoutPanel extends JPanel {
	private JButton btnBack;
	private JButton btnNext;
	private QualityPanel qualityPanel;
	private AchivmentPanel achivmentPanel;
	private WorkTimePanel workTimePanel;
	private JPanel panel_CardLayout;
	public Dash_CardLayoutPanel() {
		qualityPanel = new QualityPanel();
		achivmentPanel = new AchivmentPanel();
		workTimePanel = new WorkTimePanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		panel_CardLayout = new JPanel();
		GridBagConstraints gbc_panel_CardLayout = new GridBagConstraints();
		gbc_panel_CardLayout.insets = new Insets(10, 0, 10, 5);
		gbc_panel_CardLayout.fill = GridBagConstraints.BOTH;
		gbc_panel_CardLayout.gridx = 2;
		gbc_panel_CardLayout.gridy = 1;
		add(panel_CardLayout, gbc_panel_CardLayout);
		
		CardLayout cardLayout = new CardLayout();
		panel_CardLayout.setLayout(cardLayout);
		
		panel_CardLayout.add(achivmentPanel, "name_693980589535600");
		
		panel_CardLayout.add(qualityPanel, "name_694002174168800");
		
//		panel_2 = new JPanel();
		panel_CardLayout.add(workTimePanel, "name_694026369505200");
		
		IconFontSwing.register(FontAwesome.getIconFont());
		//add back icon
        ImageIcon iconBack = (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_LEFT, 60.0f, (new Color(148,148,148)));
		btnBack = new JButton(iconBack);
		btnBack.setMargin(new Insets(0, 0, 0, 0));
		btnBack.setContentAreaFilled(false);
		
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cardLayout.previous(panel_CardLayout);
			}
		});
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.insets = new Insets(10, 10, 10, 5);
		gbc_btnBack.gridx = 1;
		gbc_btnBack.gridy = 1;
		add(btnBack, gbc_btnBack);
		
		//add next icon
		ImageIcon iconNext= (ImageIcon) IconFontSwing.buildIcon((IconCode)FontAwesome.ANGLE_RIGHT, 60.0f, (new Color(148,148,148)));
		
		btnNext = new JButton(iconNext);
		btnNext.setMargin(new Insets(0, 0, 0, 0));
		btnNext.setContentAreaFilled(false);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(panel_CardLayout);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(10, 5, 10, 10);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 1;
		add(btnNext, gbc_btnNewButton);

	}

}
