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
public class CustomPanel extends JPanel {
	public CustomPanel() {
	}
	
	int progress = 275;
	int value = 0;
	Arc2D.Float arc;
	int progress1=0;
	int index = -1;
	int remi = 0;
	
	
	public void paint(Graphics g) {
		super.paint(g);
	
		int c = (progress/100) + 1; //calculate ring count
		
		//Color Array list
		Color[] stColr = {Color.red,Color.green,Color.ORANGE,Color.blue,Color.pink,Color.cyan, Color.yellow};
		
		//create array list to add arcs
		List<String> arcList = new ArrayList<String>();
		for (int i = 1; i <= c; i++) {
			arcList.add(new String("arc" + i));
			index++; // for select colors form color array list			
		}

		Graphics2D g2=(Graphics2D)g;	
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.translate(this.getWidth()/2, this.getHeight()/2);
		g2.rotate(Math.toRadians(90));
	
		progress1 = progress;
		int ii = 0; //for calculate arc sizes.
		
		//iterate array list backward
		ListIterator<String> listIter = arcList.listIterator(arcList.size());
		while (listIter.hasPrevious()) {

		    String prev = listIter.previous(); 
		    arc = new Arc2D.Float(Arc2D.PIE);

		    arc.setFrameFromCenter(new Point(0,0), new Point((getHeight()/2)-ii, (getHeight()/2)-ii)); //define arc
		    ii=ii+15;
		    
		    arc.setAngleStart(0);//define arc start angle
		
		    remi = (progress1%100);//calculate reminder for set arc angle
		    if (remi>0) {
		    	arc.setAngleExtent(remi*3.6);
			}else {
				arc.setAngleExtent(-360);
				progress1 = progress1 - 100;
			}
		    progress1 = progress1-remi;
		    
		    //set color from array list
		    g2.setColor(stColr[index]);
		    index = index -1;
			g2.draw(arc);//draw arc
			g2.fill(arc);//fill arc
		}

		//create middle circle
		Ellipse2D circle = new Ellipse2D.Float(0,0,110,110);
		circle.setFrameFromCenter(new Point(0,0), new Point((getHeight()/2)-ii, (getHeight()/2)-ii));
		g2.setColor(Color.WHITE);
		g2.draw(circle);
		g2.fill(circle);
		
		g2.setColor(Color.red);
		g2.rotate(Math.toRadians(270));
		g.setFont(new Font("Verdana",Font.PLAIN,30));
		FontMetrics fm = g2.getFontMetrics();
		Rectangle2D r = fm.getStringBounds(progress+"%", g);
		int x = (0-(int)r.getWidth())/2;
		int y = (0-(int)r.getHeight())/2 + fm.getAscent();
		g2.drawString(progress+"%", x, y);				
	}


}
