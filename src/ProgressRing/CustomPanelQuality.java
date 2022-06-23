package ProgressRing;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CustomPanelQuality  extends JPanel {
	public CustomPanelQuality() {
	}
	
	int progressQuality = 78;
	Arc2D.Float arc;
	
//	@Override
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);	
//	}
	public void paint(Graphics g) {
		super.paint(g);
	
		Graphics2D g2=(Graphics2D)g;	
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.translate(getWidth()/2, getHeight()/2);
		g2.rotate(Math.toRadians(270));
 
		arc = new Arc2D.Float(Arc2D.PIE);
		arc.setFrameFromCenter(new Point(0,0), new Point(getHeight()/2, getHeight()/2)); //define arc	    
		arc.setAngleStart(0);//define arc start angle
    	arc.setAngleExtent(progressQuality*3.6);

    	g2.setColor((new Color(95,160,255)));
		g2.draw(arc);//draw arc
		g2.fill(arc);//fill arc

		Ellipse2D circle = new Ellipse2D.Float(0,0,110,110);
		circle.setFrameFromCenter(new Point(0,0), new Point((getHeight()/2)-15, (getHeight()/2)-15));
		g2.setColor(Color.WHITE);
		g2.draw(circle);
		g2.fill(circle);
		
		g2.setColor((new Color(95,160,255)));
		g2.rotate(Math.toRadians(90));
		g.setFont(new Font("Verdana",Font.BOLD,25));
		FontMetrics fm = g2.getFontMetrics();
		Rectangle2D r = fm.getStringBounds(progressQuality+"%", g);
		int x = (0-(int)r.getWidth())/2;
		int y = (0-(int)r.getHeight())/2 + fm.getAscent();
		g2.drawString(progressQuality+"%", x, y);				
	}

}
