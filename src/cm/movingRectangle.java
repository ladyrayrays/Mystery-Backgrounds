package cm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class movingRectangle extends JPanel implements ActionListener {
	
	Timer timer = new Timer(5,this);
	int x = (int)(Math.random() * 1900 + 1), velx = 1;
	int y = (int)(Math.random() * 999 + 1), vely = 1;
	public JButton dvd;
	public JButton rain;
	public JButton bouncingBalls;
	public JButton exit;
	public static JFrame jf;
	
	
	public movingRectangle() {
		setBorder(new EmptyBorder(200, 200, 200, 200));
        setLayout(new GridBagLayout());
        //JPanel panel = new JPanel();
        

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        //gbc.anchor = GridBagConstraints.NORTH;
        gbc.ipadx = 500;
        gbc.ipadx = 40;

        add(new JLabel("<html><h1><strong><i><font size= 80>Mystery Backgrounds</font></i></strong></h1><hr></html>"), gbc);
        
        gbc.insets = new Insets(10,0,0,0);
        dvd = new JButton("DVD");
       // gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 4;
        dvd.addActionListener(this);
        add(dvd,gbc);
        
        rain = new JButton("Rain");
        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 3;
        rain.addActionListener(this);
        add(rain,gbc);
        
       
        bouncingBalls = new JButton("Bouncing Balls");
        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 2;
        bouncingBalls.addActionListener(this);
        add(bouncingBalls,gbc);
        
        exit = new JButton("Exit");
        gbc.weightx = 0.5;
        gbc.gridx = 0;
        gbc.gridy = 5;
        exit.addActionListener(this);
        add(exit,gbc);

        
        
        
        /*
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JPanel buttons = new JPanel(new GridBagLayout());;
        buttons.setOpaque( false );
        buttons.add(new JButton("DVD"), gbc);
        gbc.insets = new Insets(10,0,0,0);
        buttons.add(new JButton("Bouncing Balls"), gbc);
        buttons.add(new JButton("Rain"), gbc);


        
        gbc.weighty = 3;
        add(buttons, gbc);
        */
   
        

	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		  for (int i = 0; i < 3000; i++) {
	            draw(g);
	            timer.start();
	           
	      }
	}
	
	public void draw(Graphics g) {
        Color c = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        g.setColor(c);
        g.fillRect((int) (Math.random() * 1900), (int) (Math.random() * 1200), (int) (Math.random() * 40), (int) (Math.random() * 40));
        //timer.start();
    }
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == dvd) {
			jf.setEnabled(false);
			DVD.main(null);
		}
		if(e.getSource() == rain) {
			jf.setEnabled(false);
			frame.main(null);
		}
		if(e.getSource() == bouncingBalls) {
			jf.setEnabled(false);
			BallAnimation4.main(null);
		}
		if(e.getSource() == exit) {
			System.exit(1);
		}
		
		
		
		if(x < 0 || x > 1900)
			velx = -velx;
		
		if(y < 0 || y > 1200)
			vely = -vely;
		
		
		y = y + vely;
		x = x + velx;
		repaint();

		
	}
	
	public static void main(String[] args) {
		movingRectangle move = new movingRectangle();
		jf = new JFrame();
		jf.setLayout( new BorderLayout() );
		jf.setTitle("Rectangles of doom");
		//jf.setSize(1000,1000);
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		jf.setUndecorated(true); //makes it so its really full screen
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.add(move);

	}
	

}
