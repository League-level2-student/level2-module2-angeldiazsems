package _06_overloading;

import java.awt.Color;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Overloading is when we have multiple methods with the SAME name, but DIFFERENT parameters.
 * This can mean a different number of parameters, or the parameter types can differ, or both!
 * An overloaded method can also have a different return type, in addition to changing the parameters.
 * 
 * GOAL: Create your own custom pop-up messages
 */
public class LeagueOptionPane {
	
	public static void showMessageDialog(String message) {
		// 1. Open example.png and make a GUI that looks like that
		//    The message parameter is what we want to show on our pop-up
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JLabel label = new JLabel(message);
		panel.add(label);
		label.setIcon(loadImage("league.png"));
		frame.setTitle("message");
		frame.setSize(250,116);
		
		
		// 2. Uncomment the line of code below. It sets the location of our frame to the center of the screen
		frame.setLocationRelativeTo(null);
	}
	
	// 3. Call this method in the Runner class
	
void showMessageDialogTWO(String message, String title) {
	String input = message;
	String input2 = title;
	JFrame frame2 = new JFrame();
	frame2.setVisible(true);
	JPanel panel2 = new JPanel();
	frame2.add(panel2);
	JLabel label2 = new JLabel(message);
	panel2.add(label2);
	frame2.setTitle(title);
	label2.setIcon(loadImage("league.png"));
	frame2.setSize(250,116);
	
}
	// 4. Create another showMessageDialog() method that lets us also choose the Message and Title 
	//    2 String parameters (one for the message and one for the title)
	void showMessageDialogTHREE(String message, String title, String fileName) {
		String input2 = message;
		String input3 = title;
		String input4 = fileName;
		String input5 = fileName;
		JFrame frame3 = new JFrame();
		frame3.setVisible(true);
		JPanel panel3 = new JPanel();
		frame3.add(panel3);
		JLabel label3 = new JLabel(message);
		panel3.add(label3);
		frame3.setTitle(title);
		label3.setIcon(loadImage(fileName));
		frame3.setSize(250,116);
	}
	// 5. Call this method in the Runner class
	
	
	// 6. Create another showMessageDialog() method that lets us choose the Message, Title, and Image
	//    3 String parameters (one for the message, one for the title, and one for the fileName)
	
	// 7. Call this method in the Runner class
	
	// CHALLENGE: 
		//	1. Create another showMessageDialog() method that lets us choose the Message, Title, Image, and Background Color
		//     3 String parameters (one for the message, one for the title, and one for the fileName)
		//	   1 Color parameter for the backgroundColor
void showMessageDialogFOUR(String message, String title, String fileName, Color backgroundColor) {
	
	
	
	
}
		//	2. Change the return type of the 3rd showMessageDialog() method(the one right above) to JPanel
		//	   Make sure to return your panel at the end of that method
		//	
		//	3. Call the showMessageDialog() method you just modified in this method
		//	   Set the method equal to a JPanel
		//	
		//	4. Set the background of your panel to the backgroundColor parameter
		//
		//	5. Call this method in the Runner class
		//
		// WHY DID WE DO THIS? - because we were able to overload this method by calling one of the other methods inside of it
	
	
	public static ImageIcon loadImage(String fileName) {
		try {
			return new ImageIcon(ImageIO.read(new LeagueOptionPane().getClass().getResourceAsStream(fileName)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
