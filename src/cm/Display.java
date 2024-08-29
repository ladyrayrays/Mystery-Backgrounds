package cm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Display extends JPanel {
	
	private int width;
	private int height;

	
	public Display() {
		setLayout(null);
		width = 100;
		height = 100;
		JButton button = new JButton("Expand");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				width = 200;
				height = 200;
				repaint();
			}
		});
		button.setBounds(400, 100, 120, 30);
		add(button);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d;
		g2d = (Graphics2D)g.create();
		setBackground(Color.BLACK);
		g2d.setColor(Color.YELLOW);
		int xPnts[] = {42,52,72,52,60,40,15,28,9,32,42};
		int yPnts[] = {38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38};
		g2d.drawPolygon(xPnts,yPnts,xPnts.length);
		int xPnts2[] = {42,52,72,52,60,40,26,32,12,32,42};
		int yPnts2[] = {38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38};
		g2d.drawPolygon(xPnts2,yPnts2,xPnts2.length);
	}

}
