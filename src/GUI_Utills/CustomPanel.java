package GUI_Utills;

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
	
	int progress = 258;
	int value = 0;
	Arc2D.Float arc;
	int progress1=0;
	int index = -1;
	int remi = 0;
	int ringCount =0; 
	
	public void paint(Graphics g) {
		super.paint(g);
		
		//calculate ring count
		if ((progress%100)==0) {
			ringCount = (progress/100);
		} else {
			ringCount = (progress/100) + 1; 
		};
			
		//Color Array list
		Color[] stColr = {(new Color(95,160,255)),(new Color(38,110,115)),(new Color(204,170,102)),(new Color(75,75,195)),Color.blue,Color.pink,Color.cyan};
			
		//create array list to add arcs
		List<String> arcList = new ArrayList<String>();
		for (int i = 1; i <= ringCount; i++) {
			arcList.add(new String("arc" + i));
			index++; // for select colors form color array list			
		}

		Graphics2D g2=(Graphics2D)g;	
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.translate(this.getWidth()/2, this.getHeight()/2);
		g2.rotate(Math.toRadians(270));
	
		progress1 = progress;
		int ringRadius = 0; //for calculate arc sizes.
		
		//iterate array list backward
		ListIterator<String> listIter = arcList.listIterator(arcList.size());
		while (listIter.hasPrevious()) {

		    @SuppressWarnings("unused")
			String prev = listIter.previous(); 
		    arc = new Arc2D.Float(Arc2D.PIE);

		    arc.setFrameFromCenter(new Point(0,0), new Point((getHeight()/2)-ringRadius, (getHeight()/2)-ringRadius)); //define arc
		    ringRadius=ringRadius+15;
		    
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
		circle.setFrameFromCenter(new Point(0,0), new Point((getHeight()/2)-ringRadius, (getHeight()/2)-ringRadius));
		g2.setColor(Color.WHITE);
		g2.draw(circle);
		g2.fill(circle);
		
		g2.setColor((new Color(95,160,255)));
		g2.rotate(Math.toRadians(90));
		g.setFont(new Font("Verdana",Font.BOLD,25));
		FontMetrics fm = g2.getFontMetrics();
		Rectangle2D r = fm.getStringBounds(progress+"%", g);
		int x = (0-(int)r.getWidth())/2;
		int y = (0-(int)r.getHeight())/2 + fm.getAscent();
		g2.drawString(progress+"%", x, y);				
	}


}
