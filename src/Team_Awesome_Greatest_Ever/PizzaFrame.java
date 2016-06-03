package Team_Awesome_Greatest_Ever;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PizzaFrame extends JFrame
{
	private final int FRAME_WIDTH, FRAME_HEIGHT;
	private JPanel choicesPanel, topingsPanel;
	private JCheckBox pepperoni, sausage, mushrooms;
	private String[] topings;
	
	public PizzaFrame(int width, int height)
	{
		this.FRAME_WIDTH = width;
		this.FRAME_HEIGHT = height;
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Make Your Pizza");
		topings = new String[3];
		
		this.createTopingsPanel();
		choicesPanel = new JPanel(new GridLayout(1, 3));
		choicesPanel.add(topingsPanel);
		
		this.add(choicesPanel);
	}
	
	public void createTopingsPanel()
	{
		topingsPanel = new JPanel(new GridLayout(3,1));
		pepperoni = new JCheckBox("Pepperoni");
		sausage = new JCheckBox("Sausage");
		mushrooms = new JCheckBox("Mushrooms");
		
		topingsPanel.add(pepperoni);
		topingsPanel.add(sausage);
		topingsPanel.add(mushrooms);
	}
	
	public String[] getTopings()
	{
		return topings;
	}
	
	public class checkBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(pepperoni.isSelected())
			{
				topings[0] = "Pepperoni";
			}
			if(sausage.isSelected())
			{
				topings[1] = "Sausage";
			}
			if(mushrooms.isSelected())
			{
				topings[2] = "Mushrooms";
			}
		}
	}
}
