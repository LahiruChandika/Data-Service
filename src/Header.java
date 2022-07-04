

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import GUI_Utills.EventSwitchSelected;
import GUI_Utills.LabelIcon;
import GUI_Utills.SwitchButton;
import jiconfont.IconCode;
import jiconfont.icons.font_awesome.FontAwesome;
import jiconfont.swing.IconFontSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Header extends JPanel {

	private JPanel headerPanel;
	private SwitchButton switchbutton;
	private JButton btnNewButton;
	
	public Header() {
		setLayout(new BorderLayout(0, 0));
		
		headerPanel = new JPanel();
		add(headerPanel, BorderLayout.NORTH);
			
		headerPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 5));

		IconFontSwing.register(FontAwesome.getIconFont());

		//Notification icon
		Icon iconNottification = IconFontSwing.buildIcon((IconCode)FontAwesome.COG, 30.0f, (new Color(148,148,148)));	
		Icon iconSignOut= IconFontSwing.buildIcon((IconCode)FontAwesome.SIGN_OUT, 30.0f, (new Color(148,148,148)));
		JPopupMenu popUp = new JPopupMenu();
		
		popUp.setSize(150, 400);
		switchbutton = new SwitchButton();
		popUp.add(new LabelIcon("Change Theme", switchbutton));
		popUp.add(new LabelIcon("Log Out" ,iconSignOut));
		
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
		
		btnNewButton = new JButton(iconNottification);
		btnNewButton.setMaximumSize(new Dimension(40, 40));
		btnNewButton.setMinimumSize(new Dimension(40, 40));
		btnNewButton.setPreferredSize(new Dimension(40, 40));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				popUp.show(btnNewButton,0,btnNewButton.getHeight());
			}
		});
		headerPanel.add(btnNewButton);
		
		
		//User icon
		Icon iconAcc = IconFontSwing.buildIcon((IconCode)FontAwesome.USER, 30.0f, (new Color(148,148,148)));		
		//add account icon and name
		LabelIcon labelIcon_1 = new LabelIcon("username", iconAcc);
		headerPanel.add(labelIcon_1);

		
		
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
