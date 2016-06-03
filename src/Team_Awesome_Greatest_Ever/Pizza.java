

package Team_Awesome_Greatest_Ever;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Pizza 
{
	private int x, y, diameter;
	private String[] topings;
	
	public Pizza(int x, int y, int diameter, String[] topings)
	{
		this.x = x;
		this.y = y;
		this.diameter = diameter;
		this.topings = topings;
	}
	
	public void draw(Graphics2D g2)
	{
		Ellipse2D.Double dough = new Ellipse2D.Double(x, y, diameter, diameter);
		Ellipse2D.Double sauce = new Ellipse2D.Double(x + (int) diameter * .05, y + (int) diameter * .5, (int) diameter * .95, 
													  (int) diameter * .95);
		Ellipse2D.Double cheese = new Ellipse2D.Double(x + (int) diameter * .1, y + (int) diameter * .1, 
													   (int) diameter * .9, (int) diameter * .9);
		g2.setColor(Color.BLACK);
		g2.fill(dough);
		g2.setColor(Color.RED);
		g2.fill(sauce);
		g2.setColor(Color.YELLOW);
		g2.fill(cheese);
		
		for(String a : topings)
		{
			if(a.equals("Temp 1"))
			{
				Ellipse2D.Double temp1 = new Ellipse2D.Double(x, y, (int) diameter * 0.30, (int) diameter * 0.30);
				g2.setColor(Color.BLACK);
				g2.fill(temp1);
			}
			else if(a.equals("Temp 2"))
			{
				Ellipse2D.Double temp2 = new Ellipse2D.Double(x + 50, y + 50, (int) diameter * 0.30, (int) diameter * 0.30);
				g2.setColor(Color.BLACK);
				g2.fill(temp2);
			}
			else if(a.equals("Temp 3"))
			{
				Ellipse2D.Double temp3 = new Ellipse2D.Double(x + 100, y + 100, (int) diameter * 0.30, (int) diameter * 0.30);
				g2.setColor(Color.BLACK);
				g2.fill(temp3);
			}
		}
	}
}