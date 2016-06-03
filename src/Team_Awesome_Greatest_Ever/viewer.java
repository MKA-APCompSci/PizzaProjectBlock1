package Team_Awesome_Greatest_Ever;

import javax.swing.JFrame;

public class viewer {
	public static void main(String[] args) {
		JFrame frame = new PizzaFrame(900, 300); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		
		frame.setVisible(true);
	}

}
