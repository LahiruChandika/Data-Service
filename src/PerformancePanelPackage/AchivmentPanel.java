package PerformancePanelPackage;

import javax.swing.JPanel;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JSeparator;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;

import ProgressRing.CustomPanel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AchivmentPanel extends JPanel implements CustomPanel.ProgressBarInterface {
	
private AchivmentDataPanel dataPanel;
	
	private CustomPanel cp;
	private JButton bt_run;

	
	public AchivmentPanel() {
		
		dataPanel = new AchivmentDataPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JSeparator separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.gridwidth = 3;
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 2;
		gbc_separator_4.gridy = 0;
		add(separator_4, gbc_separator_4);
		
		JLabel lblNewLabel = new JLabel("Achivement (100%)");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JSeparator separator_5 = new JSeparator();
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.gridwidth = 3;
		gbc_separator_5.insets = new Insets(0, 0, 5, 5);
		gbc_separator_5.gridx = 2;
		gbc_separator_5.gridy = 2;
		add(separator_5, gbc_separator_5);
		
		bt_run = new JButton("Start");
		bt_run.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Thread(new Runnable() {
					@Override
					public void run() {
						for (int num = 0; num <= 400; num++) {
							try {
								cp.UpdateProgress(num);
								cp.repaint();
								Thread.sleep(50);
							} catch (Exception e) {
							}
						}
					}
				}).start();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		add(bt_run, gbc_btnNewButton);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 4;
		add(separator_3, gbc_separator_3);
		
		cp = new CustomPanel(); 
		
		//Add Circle bar Progressbar
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 2;
		gbc_panel_1.gridy = 4;
		//		probar.setValue(50);
		cp.setVisible(true);
		add(cp, gbc_panel_1);
				
		cp.pbr=this;
		
		//add data panel
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.gridx = 4;
		gbc_panel.gridy = 4;
		add(dataPanel, gbc_panel);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.gridheight = 4;
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 5;
		gbc_separator_2.gridy = 1;
		add(separator_2, gbc_separator_2);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridwidth = 4;
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 5;
		add(separator_1, gbc_separator_1);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridx = 6;
		gbc_separator.gridy = 6;
		add(separator, gbc_separator);

	}
	
	@Override
	public void OnProgressComplete() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				bt_run.setVisible(false);
			}
		}).start();
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}

}
