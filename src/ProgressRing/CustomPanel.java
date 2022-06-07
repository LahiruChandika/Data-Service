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
public class CustomPanel extends JPanel {
	
	int progress = 0;
	int progress1 = 0;
	int value = 0;
	public ProgressBarInterface pbr;
	
	public void UpdateProgress(int progress_value) {
		progress = progress_value;
		if (progress==100) {
			pbr.OnProgressComplete();
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.translate(this.getWidth()/2, this.getHeight()/2);
		g2.rotate(Math.toRadians(270));
		Arc2D.Float arc = new Arc2D.Float(Arc2D.PIE);
		Arc2D.Float arc2 = new Arc2D.Float(Arc2D.PIE);//arc2
		Arc2D.Float arc3 = new Arc2D.Float(Arc2D.PIE);//arc3
		Arc2D.Float arc4 = new Arc2D.Float(Arc2D.PIE);//arc4
		
		Ellipse2D circle = new Ellipse2D.Float(0,0,110,110);
		
		arc4.setFrameFromCenter(new Point(0,0), new Point(150,150));//arc4
		arc3.setFrameFromCenter(new Point(0,0), new Point(140,140));//arc3
		arc2.setFrameFromCenter(new Point(0,0), new Point(130,130));//arc2
		arc.setFrameFromCenter(new Point(0,0), new Point(120,120));
		
		circle.setFrameFromCenter(new Point(0,0), new Point(110,110));
		
		arc.setAngleStart(1);
		arc2.setAngleStart(1);
		arc3.setAngleStart(1);
		arc4.setAngleStart(1);
		
		
		
		if (progress<=100) {
			arc.setAngleExtent(-progress*3.6);//360/100=3.6		
		}else if(progress<=200) {	
			arc.setAngleExtent(-360);
			arc2.setAngleExtent((-progress+100)*3.6);//360/100=3.6//arc2
		}else if(progress<=300) {	
			arc.setAngleExtent(-360);
			arc2.setAngleExtent(-360);
			arc3.setAngleExtent((-progress+200)*3.6);//360/100=3.6//arc3
		}else {
			arc.setAngleExtent(-360);
			arc2.setAngleExtent(-360);
			arc3.setAngleExtent(-360);
			arc4.setAngleExtent((-progress+300)*3.6);//360/100=3.6//arc4
		}
		
		g2.setColor(Color.YELLOW);//arc4
		g2.draw(arc4);//arc4
		g2.fill(arc4);//arc4
		
		g2.setColor(Color.GREEN);//arc3
		g2.draw(arc3);//arc3
		g2.fill(arc3);//arc3
		
		g2.setColor(Color.BLUE);//arc2
		g2.draw(arc2);//arc2
		g2.fill(arc2);//arc2
		
		g2.setColor(Color.red);
		g2.draw(arc);
		g2.fill(arc);
		
		g2.setColor(Color.WHITE);
		g2.draw(circle);
		g2.fill(circle);
		
		g2.setColor(Color.red);
		g2.rotate(Math.toRadians(90));
		g.setFont(new Font("Verdana",Font.PLAIN,20));
		FontMetrics fm = g2.getFontMetrics();
		Rectangle2D r = fm.getStringBounds(progress+"%", g);
		int x = (0-(int)r.getWidth())/2;
		int y = (0-(int)r.getHeight())/2 + fm.getAscent();
		g2.drawString(progress+"%", x, y);

	}
	
	public interface ProgressBarInterface{
    	public void OnProgressComplete();
    }
}
