package GUI_Performance.History;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import org.jfree.chart.ChartPanel;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

@SuppressWarnings("serial")
public class HistoryPanel extends JPanel {
	
	private Graph graph;

	public HistoryPanel() throws JsonSyntaxException, JsonIOException, IOException {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);	
		
		JSeparator separator = new JSeparator();
		separator.setPreferredSize(new Dimension(10, 2));
		separator.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 2;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 0;
		add(separator, gbc_separator);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setMinimumSize(new Dimension(150, 30));
		dateChooser_1.setPreferredSize(new Dimension(200, 30));
		dateChooser_1.getCalendarButton().setPreferredSize(new Dimension(27, 30));
		dateChooser_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dateChooser_1.setToolTipText("MMM d, yyyy");
		GridBagConstraints gbc_dateChooser_1 = new GridBagConstraints();
		gbc_dateChooser_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser_1.insets = new Insets(10, 10, 5, 5);
		gbc_dateChooser_1.gridx = 3;
		gbc_dateChooser_1.gridy = 1;
		add(dateChooser_1, gbc_dateChooser_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setMinimumSize(new Dimension(150, 30));
		dateChooser.getCalendarButton().setPreferredSize(new Dimension(28, 30));
		dateChooser.setPreferredSize(new Dimension(200, 30));
		dateChooser.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		dateChooser.setToolTipText("MMM d, yyyy");
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.fill = GridBagConstraints.HORIZONTAL;
		gbc_dateChooser.insets = new Insets(10, 10, 5, 5);
		gbc_dateChooser.gridx = 1;
		gbc_dateChooser.gridy = 1;
		add(dateChooser, gbc_dateChooser);
		
		JButton btnApply = new JButton("Apply");
		btnApply.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnApply = new GridBagConstraints();
		gbc_btnApply.anchor = GridBagConstraints.WEST;
		gbc_btnApply.insets = new Insets(10, 10, 5, 5);
		gbc_btnApply.gridx = 5;
		gbc_btnApply.gridy = 1;
		add(btnApply, gbc_btnApply);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnClear = new GridBagConstraints();
		gbc_btnClear.insets = new Insets(10, 10, 5, 5);
		gbc_btnClear.anchor = GridBagConstraints.WEST;
		gbc_btnClear.gridx = 7;
		gbc_btnClear.gridy = 1;
		add(btnClear, gbc_btnClear);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(5, 10, 15, 15);
		gbc_panel.gridwidth = 8;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 2;
		add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		graph = new Graph();
		panel.add(graph, BorderLayout.CENTER);
		
		panel.addComponentListener(new ComponentListener() {
	    	@Override
			public void componentResized(ComponentEvent e) {
	    	panel.repaint();
	    	ChartPanel cp = (ChartPanel)graph.getComponents()[0];
	    	cp.setPreferredSize(new java.awt.Dimension(graph.getWidth(), graph.getHeight()));
	    	cp.setSize(new java.awt.Dimension(graph.getWidth(), graph.getHeight()));
//	    	frame.invalidate();
	    	panel.validate();
//	    	frame.repaint();
	    	}

			@Override
			public void componentHidden(ComponentEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void componentMoved(ComponentEvent e) {
				// TODO Auto-generated method stub				
			}

			@Override
			public void componentShown(ComponentEvent e) {
				// TODO Auto-generated method stub				
			}
	    });	
		
	
	}

}
