package ProgressRing;

import java.awt.Color;

import javax.swing.JProgressBar;
import javax.swing.plaf.ProgressBarUI;

@SuppressWarnings("serial")
public class CircleProgressBar extends JProgressBar {
	private ProgressCircleUI pui;
	
	public CircleProgressBar() {
		pui = new ProgressCircleUI();
		setOpaque(true);
//		setBackground(new Color(220,220,220));
		setForeground(new Color(97,97,97));
		setStringPainted(true);
		setUI(new ProgressCircleUI() {
		});
	}

}
