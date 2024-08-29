package cm;

import java.awt.*;

import javax.swing.*;

public class MainFunction {
	
	private static final int WIDTH = 600;
	private static final int HEIGHT = 400;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("MainFunction");
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH,HEIGHT));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(new Display());
		frame.setVisible(true);
	}

}
