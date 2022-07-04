package GUI_Performance;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

@SuppressWarnings("serial")
public class HistoryPanel extends JPanel {
	
	private JComboBox<?> comboBoxCharts , comboBox;

	public HistoryPanel() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);	
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(10, 2));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 7;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		add(separator, gbc_separator);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setPreferredSize(new Dimension(0, 10));
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.gridwidth = 6;
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 1;
		gbc_separator_3.gridy = 0;
		add(separator_3, gbc_separator_3);
		
		JLabel lblNewLabel_1 = new JLabel("Project");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setPreferredSize(new Dimension(150, 30));
		comboBox.setMaximumRowCount(50);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.WEST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		add(comboBox, gbc_comboBox);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setPreferredSize(new Dimension(10, 2));
		separator_2.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.gridheight = 3;
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 3;
		gbc_separator_2.gridy = 4;
		add(separator_2, gbc_separator_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setPreferredSize(new Dimension(28, 30));
		dateChooser.setPreferredSize(new Dimension(150, 30));
		dateChooser.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dateChooser.setToolTipText("MMM d, yyyy");
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.anchor = GridBagConstraints.WEST;
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.gridx = 5;
		gbc_dateChooser.gridy = 4;
		add(dateChooser, gbc_dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setPreferredSize(new Dimension(150, 30));
		dateChooser_1.getCalendarButton().setPreferredSize(new Dimension(27, 30));
		dateChooser_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dateChooser_1.setToolTipText("MMM d, yyyy");
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.anchor = GridBagConstraints.WEST;
		gbc_dateChooser_1.insets = new Insets(0, 0, 5, 0);
		gbc_dateChooser_1.gridx = 6;
		gbc_dateChooser_1.gridy = 4;
		add(dateChooser_1, gbc_dateChooser_1);
		
		JLabel lblNewLabel = new JLabel("Chart");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 5;
		add(lblNewLabel, gbc_lblNewLabel);
		
		comboBoxCharts = new JComboBox();
		comboBoxCharts.setPreferredSize(new Dimension(150, 30));
		comboBoxCharts.setMaximumRowCount(50);
		comboBoxCharts.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_comboBoxCharts = new GridBagConstraints();
		gbc_comboBoxCharts.anchor = GridBagConstraints.WEST;
		gbc_comboBoxCharts.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxCharts.gridx = 1;
		gbc_comboBoxCharts.gridy = 6;
		add(comboBoxCharts, gbc_comboBoxCharts);
		
		JButton btnApply = new JButton("Apply");
		btnApply.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnApply = new GridBagConstraints();
		gbc_btnApply.anchor = GridBagConstraints.WEST;
		gbc_btnApply.insets = new Insets(0, 0, 5, 5);
		gbc_btnApply.gridx = 5;
		gbc_btnApply.gridy = 6;
		add(btnApply, gbc_btnApply);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(0, 0, 5, 0);
		gbc_btnClear.anchor = GridBagConstraints.WEST;
		gbc_btnClear.gridx = 6;
		gbc_btnClear.gridy = 6;
		add(btnClear, gbc_btnClear);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(0, 5));
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.gridwidth = 6;
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 7;
		add(separator_1, gbc_separator_1);
		
	
	}

}
