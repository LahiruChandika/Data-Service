package GUI;

import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JFrame;

import java.awt.Insets;

public class SettingPanel extends JPanel {
	
	private SwitchButton switchbutton;

	public SettingPanel() {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblThemeChange = new JLabel("Change Theme");
		lblThemeChange.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblThemeChange = new GridBagConstraints();
		gbc_lblThemeChange.insets = new Insets(5, 10, 5, 5);
		gbc_lblThemeChange.gridx = 0;
		gbc_lblThemeChange.gridy = 0;
		add(lblThemeChange, gbc_lblThemeChange);
		
		switchbutton = new SwitchButton();
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.insets = new Insets(5, 0, 5, 0);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 0;
		add(switchbutton, gbc_btnNewButton);
		
		JLabel lblLogout = new JLabel("Log Out");
		lblLogout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblLogout = new GridBagConstraints();
		gbc_lblLogout.anchor = GridBagConstraints.WEST;
		gbc_lblLogout.insets = new Insets(5, 10, 0, 5);
		gbc_lblLogout.gridx = 0;
		gbc_lblLogout.gridy = 1;
		add(lblLogout, gbc_lblLogout);
		
		switchbutton.addEventSelected(new EventSwitchSelected() {
          @Override
          public void onSelected(boolean selected) {
        	  JFrame frame = (JFrame) SwingUtilities.getRoot(switchbutton.getComp());
        	  
        	  if (selected) {
        		  changeLaf(frame, "Light");
        	  } else {
        		  changeLaf(frame, "Dark");
        	  }
          }
      });
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


