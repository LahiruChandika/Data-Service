package GUI_Performance.My_Plans;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class MyPlans_TabbedPane extends JPanel {
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private MyPlans_Achivement achivement;
	private MyPlane_QualityPanel quality;
	
	public MyPlans_TabbedPane() {
		achivement = new MyPlans_Achivement();
		quality = new MyPlane_QualityPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.insets = new Insets(10, 10, 0, 10);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 1;
		add(tabbedPane, gbc_tabbedPane);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		panel = new JPanel();
		tabbedPane.addTab("Achievement", null, achivement, null);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		tabbedPane.addTab("Quality", null, quality, null);

	}

}

