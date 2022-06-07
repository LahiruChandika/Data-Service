package ProgressRing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

public class TargetPanel extends JPanel {

    public TargetPanel(Dimension dimension) {
    	dimension = new Dimension(400, 400);
        this.setPreferredSize(dimension);
        SpringLayout springLayout = new SpringLayout();
        setLayout(springLayout);
        
        JLabel lblPresentage = new JLabel("400%");
        springLayout.putConstraint(SpringLayout.NORTH, lblPresentage, 155, SpringLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.WEST, lblPresentage, 152, SpringLayout.WEST, this);
        springLayout.putConstraint(SpringLayout.SOUTH, lblPresentage, -161, SpringLayout.SOUTH, this);
        springLayout.putConstraint(SpringLayout.EAST, lblPresentage, -146, SpringLayout.EAST, this);
        lblPresentage.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblPresentage.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblPresentage);
    }//end constructor

    public void paintComponent(Graphics g) {

        Color blue = new Color(0, 100, 0);
        Color yellow = new Color(100, 0, 0);

        super.paintComponent(g);
        int dimension = this.getPreferredSize().width;
        int partition = 75;

        drawCircle(g, Color.WHITE, Color.BLACK, dimension);
    }//end draw circle
    
    private void drawCircle(Graphics g, Color blue, Color yellow, int dimension) {

        g.setColor(Color.WHITE);
        final int yCenter = (getHeight() - (dimension)) / 2;
        final int xCenter = (getWidth() - (dimension)) / 2;
        g.fillOval(xCenter, yCenter, dimension, dimension);
        g.setColor(Color.RED);
        g.setPaintMode();
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(20));
        g.drawOval(xCenter, yCenter, dimension, dimension);

        dimension -= 40;
        g.setColor(Color.GREEN);
        g.drawOval((getWidth() - (dimension)) / 2, (getHeight() - (dimension)) / 2, dimension, dimension);
        
        dimension -= 40;
        g.setColor(Color.BLUE);
        g.drawOval((getWidth() - (dimension)) / 2, (getHeight() - (dimension)) / 2, dimension, dimension);
        
        dimension -= 40;
        g.setColor(Color.YELLOW);
        g.drawOval((getWidth() - (dimension)) / 2, (getHeight() - (dimension)) / 2, dimension, dimension);

    }//end drawCircle
}