package Team_Awesome_Greatest_Ever;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PizzaFrame extends JFrame
{
	private final int FRAME_WIDTH, FRAME_HEIGHT;
	private JPanel choicesPanel, topingsPanel;
	private JCheckBox temp1, temp2, temp3;
	
	public PizzaFrame(int width, int height)
	{
		this.FRAME_WIDTH = width;
		this.FRAME_HEIGHT = height;
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setTitle("Make Your Pizza");
		
	}
	
	public void createTopingsPanel()
	{
		
	}
}
