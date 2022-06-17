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
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CustomPanelQuality  extends JPanel {
	
	int progressQuality = 78;
	Arc2D.Float arc;

	
	
	public void paint(Graphics g) {
		super.paint(g);
	
		Graphics2D g2=(Graphics2D)g;	
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.translate(this.getWidth()/2, this.getHeight()/2);
		g2.rotate(Math.toRadians(270));
	
 
		arc = new Arc2D.Float(Arc2D.PIE);
		arc.setFrameFromCenter(new Point(0,0), new Point(150,150)); //define arc	    
		arc.setAngleStart(0);//define arc start angle
    	arc.setAngleExtent(progressQuality*3.6);

    	g2.setColor(Color.red);
		g2.draw(arc);//draw arc
		g2.fill(arc);//fill arc

		Ellipse2D circle = new Ellipse2D.Float(0,0,110,110);
		circle.setFrameFromCenter(new Point(0,0), new Point(130,130));
		g2.setColor(Color.WHITE);
		g2.draw(circle);
		g2.fill(circle);
		
		g2.setColor(Color.red);
		g2.rotate(Math.toRadians(90));
		g.setFont(new Font("Verdana",Font.PLAIN,30));
		FontMetrics fm = g2.getFontMetrics();
		Rectangle2D r = fm.getStringBounds(progressQuality+"%", g);
		int x = (0-(int)r.getWidth())/2;
		int y = (0-(int)r.getHeight())/2 + fm.getAscent();
		g2.drawString(progressQuality+"%", x, y);				
	}


}
