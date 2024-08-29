package cm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;

public class Rectangle {

	private int fw, fh;
	private Random ran = new Random();
	private int x, y, diameter = 25;
	private int speed = 0;
	private float red, green, blue;
	private boolean up = false, right = false;
	
	public Rectangle(int frameWidth, int frameHeight) {
		fw = frameWidth;
		fh = frameHeight;
		x = ran.nextInt(fw - diameter);
		y = ran.nextInt(fh - diameter);
		speed = ran.nextInt(10);
		up = ran.nextBoolean();
		right = ran.nextBoolean();
		red = ran.nextFloat();
		green = ran.nextFloat();
		blue = ran.nextFloat();
		
	}
	
	public void move() {
		if(right) {
			x = x + speed;
		}
		else {
			x = x - speed;
		}
		
		if(up) {
			y = y - speed;
		}
		else {
			y = y + speed;
		}
		
		if(x < 0) {
			right = true;
		}
		if(x > (fw - diameter)) {
			right = false;
		}
		if(y < 0) {
			up = false;
		}
		if(y > (fh - diameter)) {
			up = true;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(new Color(red, green, blue));
		g.fillOval(x, y, diameter, diameter);
	}
	
}
