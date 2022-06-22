import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class NavBar extends JPanel {

	public NavBar() {
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JToolBar toolBar = new JToolBar();
		toolBar.setOrientation(1);
		add(toolBar);
		
		//ORELIT logo
		JLabel lblLogo = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
		lblLogo.setIcon(new ImageIcon(img));
		toolBar.add(lblLogo);
		
		JLabel lblNewLabel = new JLabel("Main navigation ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		toolBar.add(lblNewLabel);
	}
}
