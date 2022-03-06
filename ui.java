import javax.swing.*;


public class ui {
	
	private static JFrame fr = new JFrame();
	private static JButton button = new JButton("Click me");
	
	private static void simpleFrameWithButton() {
		//setting up button
		button.setBounds(150,150,100,50);		 
		
		//setting up frame
		fr.setSize(400,400);
		fr.setTitle("Video Game Catalog");
		fr.setLayout(null);	
		
		//add button to frame
		fr.add(button); 
		
		//make frame visible
		fr.setVisible(true);

	}

	public static void main(String[] args) {
	
	simpleFrameWithButton();
		
	}

}
