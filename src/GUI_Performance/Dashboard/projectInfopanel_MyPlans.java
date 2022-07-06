package GUI_Performance.Dashboard;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class projectInfopanel_MyPlans extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public projectInfopanel_MyPlans() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		
		JLabel lblProjectInfo = new JLabel("Project Info");
		lblProjectInfo.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_lblProjectInfo = new GridBagConstraints();
		gbc_lblProjectInfo.anchor = GridBagConstraints.WEST;
		gbc_lblProjectInfo.insets = new Insets(0, 0, 5, 5);
		gbc_lblProjectInfo.gridx = 1;
		gbc_lblProjectInfo.gridy = 1;
		add(lblProjectInfo, gbc_lblProjectInfo);
		
		JLabel lblProject = new JLabel("Project");
		lblProject.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblProject = new GridBagConstraints();
		gbc_lblProject.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblProject.insets = new Insets(0, 0, 5, 5);
		gbc_lblProject.gridx = 1;
		gbc_lblProject.gridy = 3;
		add(lblProject, gbc_lblProject);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridheight = 10;
		gbc_separator_1.gridx = 2;
		gbc_separator_1.gridy = 3;
		add(separator_1, gbc_separator_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblTarget = new JLabel("Target");
		lblTarget.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblTarget = new GridBagConstraints();
		gbc_lblTarget.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTarget.insets = new Insets(0, 0, 5, 5);
		gbc_lblTarget.gridx = 1;
		gbc_lblTarget.gridy = 6;
		add(lblTarget, gbc_lblTarget);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.WEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 7;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMyCapacity = new JLabel("My Capacity");
		lblMyCapacity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblMyCapacity = new GridBagConstraints();
		gbc_lblMyCapacity.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMyCapacity.insets = new Insets(0, 0, 5, 5);
		gbc_lblMyCapacity.gridx = 1;
		gbc_lblMyCapacity.gridy = 9;
		add(lblMyCapacity, gbc_lblMyCapacity);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.WEST;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 10;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 0, 5);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 12;
		add(separator, gbc_separator);

	}

}
