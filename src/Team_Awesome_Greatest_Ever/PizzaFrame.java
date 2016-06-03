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
	private JCheckBox temp1, temp2, temp3;
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
		temp1 = new JCheckBox("Temp 1");
		temp2 = new JCheckBox("Temp 2");
		temp3 = new JCheckBox("Temp 3");
		
		topingsPanel.add(temp1);
		topingsPanel.add(temp2);
		topingsPanel.add(temp3);
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
			if(temp1.isSelected())
			{
				topings[0] = "Temp 1";
			}
			if(temp2.isSelected())
			{
				topings[1] = "Temp 2";
			}
			if(temp3.isSelected())
			{
				topings[2] = "Temp 3";
			}
		}
	}
}
