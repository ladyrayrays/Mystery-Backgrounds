package cm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DVD extends JPanel implements ActionListener {
	
	Timer timer = new Timer(5,this);
	int x = 1, velx = 1;
	int y = 1, vely = 1;
	ImageIcon picture;
	public static JFrame jf;
	public JButton backButton;
	
	
	public DVD() {
		
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        backButton = new JButton("Back");
        panel.setOpaque(false);
        backButton.setOpaque(false);
        backButton.addActionListener(this);
        panel.add(backButton);
        add(panel,BorderLayout.SOUTH);

	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		//picture = new ImageIcon(".//res//images//dvd2.png");
		//System.out.println(getClass().getResource(".//res//images//dvd2.png"));
		picture = new ImageIcon(getClass().getClassLoader().getResource("dvd2.png"));
		picture.paintIcon(this, g, x, y);
		setBackground(Color.BLACK);
		//Graphics2D g2 = (Graphics2D) g;
		//Ellipse2D rectangle = new Ellipse2D.Double(x,y,40,40);
		//g2.fill(rectangle);
		timer.start();
		  

		
		//timer.restart();
	}
	
	
	//determines when 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backButton) {
			jf.setEnabled(false);
			movingRectangle.main(null);
		}
		if(x < 0 || x > 1800)
			velx = -velx;
		
		if(y < 0 || y > 1000)
			vely = -vely;
		
		
		y = y + vely;
		x = x + velx;
		repaint();

		
	}
	
	public static void main(String[] args) {
		DVD move = new DVD();
		jf = new JFrame();
		jf.setTitle("DVD");
		jf.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		jf.setUndecorated(true);
		jf.setVisible(true);
		//jf.setBackground(Color.BLACK);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.add(move);
		
	}
	

}
