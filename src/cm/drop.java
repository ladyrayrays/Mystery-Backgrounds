package cm;

import java.awt.Graphics;

public class drop {
	protected int velocity,x,y,length = 4;
	
	public drop(int x, int y, int v) {
		this.velocity = v;
		this.x = x;
		this.y = y;
		//this.length = length;
	}
	
	public void paint(Graphics g) {
		g.drawLine(x, y, x, y + length);
		y = y + length + velocity;
	}

}
