package cm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.Timer;


public class frame extends JFrame implements ActionListener {
	
	private int DEFAULT_WIDTH = 750;
	private int DEFAULT_HEIGHT = 750;
	private panel Panel = new panel();

	
	private Timer timer = new Timer(20, null);
	
	
	public frame() {
		timer.addActionListener(this);
		initializeFrame();
		
	}
	
	public static void main(String[] args) {
		frame Frame = new frame();
		
		Frame.start();

		
	}
	
	
	public void initializeFrame() {
		this.setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Makin it Rain");
		this.setBackground(Color.BLACK);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
		this.setResizable(true);
		
		this.setContentPane(Panel);
		
		this.setVisible(true);
	}
	
	public void start() {
		timer.start();
	}
	
	public void paint(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.YELLOW);
		Panel.paint(g);
	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	


}
