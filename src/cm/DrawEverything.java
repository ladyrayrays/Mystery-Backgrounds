package cm;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class DrawEverything extends JFrame implements Runnable {
	
	private int frameWidth = 700, frameHeight = 500;
	private Thread thread;
	private Rectangle rectangle[] = new Rectangle[50];
	
	public DrawEverything() {
		setBounds(100, 100, frameWidth, frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		for(int i = 0; i < rectangle.length; i++) {
			rectangle[i] = new Rectangle(frameWidth, frameHeight);
		}
		
		thread = new Thread(this);
		thread.start();
	}
	
	public void paint(Graphics g) {
		
		g.setColor(Color.yellow);
		g.fillRect(0, 0, frameWidth, frameHeight);
		
		for(int i = 0; i < rectangle.length; i++) {
			rectangle[i].draw(g);
		}
	}
	
	public void run() {
		
		while(true) {
			for(int i =0; i < rectangle.length; i++) {
				rectangle[i].move();
			}
			
			repaint();
		}
	}
}


