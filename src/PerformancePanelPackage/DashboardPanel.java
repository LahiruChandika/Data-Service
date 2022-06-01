package PerformancePanelPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class DashboardPanel extends JPanel {
	private JTextField textFieldTM;
	private JTextField textFieldTarget;
	private JTextField textFieldBA;
	private JTextField textFieldType;
	private JTextField textFieldQC;
	private JTextField textFieldProject;
	private AchivmentPanel achivmentPanel;

	public DashboardPanel() {
		
		achivmentPanel = new AchivmentPanel();
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, -20, 0, -15, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		//Add Achivement Chart panel
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 3;
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		add(achivmentPanel, gbc_panel);
		
		JLabel lbProjectInfo = new JLabel(" Project Info");
		lbProjectInfo.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lbProjectInfo = new GridBagConstraints();
		gbc_lbProjectInfo.anchor = GridBagConstraints.WEST;
		gbc_lbProjectInfo.insets = new Insets(0, 0, 5, 5);
		gbc_lbProjectInfo.gridx = 1;
		gbc_lbProjectInfo.gridy = 3;
		add(lbProjectInfo, gbc_lbProjectInfo);
		
		JLabel lblAlocaatedAdmins = new JLabel("Alocated Admins");
		lblAlocaatedAdmins.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblAlocaatedAdmins = new GridBagConstraints();
		gbc_lblAlocaatedAdmins.anchor = GridBagConstraints.WEST;
		gbc_lblAlocaatedAdmins.insets = new Insets(0, 0, 5, 5);
		gbc_lblAlocaatedAdmins.gridx = 3;
		gbc_lblAlocaatedAdmins.gridy = 3;
		add(lblAlocaatedAdmins, gbc_lblAlocaatedAdmins);
		
		JLabel lblTotalDayCunt = new JLabel("24");
		lblTotalDayCunt.setFont(new Font("Tahoma", Font.BOLD, 24));
		GridBagConstraints gbc_lblTotalDayCunt = new GridBagConstraints();
		gbc_lblTotalDayCunt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTotalDayCunt.insets = new Insets(0, 0, 5, 0);
		gbc_lblTotalDayCunt.gridx = 5;
		gbc_lblTotalDayCunt.gridy = 3;
		add(lblTotalDayCunt, gbc_lblTotalDayCunt);
		
		JLabel lblProject = new JLabel("Project");
		lblProject.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblProject = new GridBagConstraints();
		gbc_lblProject.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblProject.insets = new Insets(0, 0, 5, 5);
		gbc_lblProject.gridx = 1;
		gbc_lblProject.gridy = 4;
		add(lblProject, gbc_lblProject);
		
		JLabel lblQC = new JLabel("QC");
		lblQC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblQC = new GridBagConstraints();
		gbc_lblQC.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblQC.insets = new Insets(0, 0, 5, 5);
		gbc_lblQC.gridx = 3;
		gbc_lblQC.gridy = 4;
		add(lblQC, gbc_lblQC);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridheight = 10;
		gbc_separator_1.insets = new Insets(0, 0, 0, 5);
		gbc_separator_1.gridx = 4;
		gbc_separator_1.gridy = 4;
		add(separator_1, gbc_separator_1);
		
		JLabel lblTotalDays = new JLabel("Total Days");
		lblTotalDays.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblTotalDays = new GridBagConstraints();
		gbc_lblTotalDays.anchor = GridBagConstraints.WEST;
		gbc_lblTotalDays.insets = new Insets(0, 0, 5, 0);
		gbc_lblTotalDays.gridx = 5;
		gbc_lblTotalDays.gridy = 4;
		add(lblTotalDays, gbc_lblTotalDays);
		
		textFieldProject = new JTextField();
		GridBagConstraints gbc_textFieldProject = new GridBagConstraints();
		gbc_textFieldProject.anchor = GridBagConstraints.WEST;
		gbc_textFieldProject.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldProject.gridx = 1;
		gbc_textFieldProject.gridy = 5;
		add(textFieldProject, gbc_textFieldProject);
		textFieldProject.setColumns(15);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 9;
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 5;
		add(separator, gbc_separator);
		
		textFieldQC = new JTextField();
		GridBagConstraints gbc_textFieldQC = new GridBagConstraints();
		gbc_textFieldQC.anchor = GridBagConstraints.WEST;
		gbc_textFieldQC.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldQC.gridx = 3;
		gbc_textFieldQC.gridy = 5;
		add(textFieldQC, gbc_textFieldQC);
		textFieldQC.setColumns(15);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 0);
		gbc_separator_2.gridx = 5;
		gbc_separator_2.gridy = 6;
		add(separator_2, gbc_separator_2);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblType = new GridBagConstraints();
		gbc_lblType.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblType.insets = new Insets(0, 0, 5, 5);
		gbc_lblType.gridx = 1;
		gbc_lblType.gridy = 7;
		add(lblType, gbc_lblType);
		
		JLabel lblBA = new JLabel("BA");
		lblBA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblBA = new GridBagConstraints();
		gbc_lblBA.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblBA.insets = new Insets(0, 0, 5, 5);
		gbc_lblBA.gridx = 3;
		gbc_lblBA.gridy = 7;
		add(lblBA, gbc_lblBA);
		
		JLabel lbRemainingDayCunt = new JLabel("15");
		lbRemainingDayCunt.setForeground(Color.RED);
		lbRemainingDayCunt.setFont(new Font("Tahoma", Font.BOLD, 24));
		GridBagConstraints gbc_lbRemainingDayCunt = new GridBagConstraints();
		gbc_lbRemainingDayCunt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lbRemainingDayCunt.insets = new Insets(0, 0, 5, 0);
		gbc_lbRemainingDayCunt.gridx = 5;
		gbc_lbRemainingDayCunt.gridy = 7;
		add(lbRemainingDayCunt, gbc_lbRemainingDayCunt);
		
		textFieldType = new JTextField();
		GridBagConstraints gbc_textFieldType = new GridBagConstraints();
		gbc_textFieldType.anchor = GridBagConstraints.WEST;
		gbc_textFieldType.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldType.gridx = 1;
		gbc_textFieldType.gridy = 8;
		add(textFieldType, gbc_textFieldType);
		textFieldType.setColumns(15);
		
		textFieldBA = new JTextField();
		GridBagConstraints gbc_textFieldBA = new GridBagConstraints();
		gbc_textFieldBA.anchor = GridBagConstraints.WEST;
		gbc_textFieldBA.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldBA.gridx = 3;
		gbc_textFieldBA.gridy = 8;
		add(textFieldBA, gbc_textFieldBA);
		textFieldBA.setColumns(15);
		
		JLabel lblRemainingDays = new JLabel("Remaining Days");
		lblRemainingDays.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblRemainingDays = new GridBagConstraints();
		gbc_lblRemainingDays.anchor = GridBagConstraints.WEST;
		gbc_lblRemainingDays.insets = new Insets(0, 0, 5, 0);
		gbc_lblRemainingDays.gridx = 5;
		gbc_lblRemainingDays.gridy = 8;
		add(lblRemainingDays, gbc_lblRemainingDays);
		
		JSeparator separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 5, 0);
		gbc_separator_3.gridx = 5;
		gbc_separator_3.gridy = 9;
		add(separator_3, gbc_separator_3);
		
		JLabel lblTarget = new JLabel("Target");
		lblTarget.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTarget = new GridBagConstraints();
		gbc_lblTarget.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTarget.insets = new Insets(0, 0, 5, 5);
		gbc_lblTarget.gridx = 1;
		gbc_lblTarget.gridy = 10;
		add(lblTarget, gbc_lblTarget);
		
		JLabel lblTm = new JLabel("TM");
		lblTm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTm.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblTm = new GridBagConstraints();
		gbc_lblTm.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTm.insets = new Insets(0, 0, 5, 5);
		gbc_lblTm.gridx = 3;
		gbc_lblTm.gridy = 10;
		add(lblTm, gbc_lblTm);
		
		JLabel lblDayCunt = new JLabel("5");
		lblDayCunt.setFont(new Font("Tahoma", Font.BOLD, 24));
		GridBagConstraints gbc_lblDayCunt = new GridBagConstraints();
		gbc_lblDayCunt.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDayCunt.insets = new Insets(0, 0, 5, 0);
		gbc_lblDayCunt.gridx = 5;
		gbc_lblDayCunt.gridy = 10;
		add(lblDayCunt, gbc_lblDayCunt);
		
		textFieldTarget = new JTextField();
		GridBagConstraints gbc_textFieldTarget = new GridBagConstraints();
		gbc_textFieldTarget.anchor = GridBagConstraints.WEST;
		gbc_textFieldTarget.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldTarget.gridx = 1;
		gbc_textFieldTarget.gridy = 11;
		add(textFieldTarget, gbc_textFieldTarget);
		textFieldTarget.setColumns(15);
		
		textFieldTM = new JTextField();
		GridBagConstraints gbc_textFieldTM = new GridBagConstraints();
		gbc_textFieldTM.anchor = GridBagConstraints.WEST;
		gbc_textFieldTM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldTM.gridx = 3;
		gbc_textFieldTM.gridy = 11;
		add(textFieldTM, gbc_textFieldTM);
		textFieldTM.setColumns(15);
		
		JLabel lblExtraDays = new JLabel("Extra Days");
		lblExtraDays.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblExtraDays = new GridBagConstraints();
		gbc_lblExtraDays.insets = new Insets(0, 0, 5, 0);
		gbc_lblExtraDays.anchor = GridBagConstraints.WEST;
		gbc_lblExtraDays.gridx = 5;
		gbc_lblExtraDays.gridy = 11;
		add(lblExtraDays, gbc_lblExtraDays);
		
		JSeparator separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 3;
		gbc_separator_4.gridy = 12;
		add(separator_4, gbc_separator_4);

	}


}
