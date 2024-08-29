package cm;

import java.awt.Graphics;

public class splash {
	int x;
	int y;
	boolean isRight;
	
	public splash(int x, int y, boolean isRight) {
		this.x = x;
		this.y = y;
		this.isRight = isRight;
	}
	
	public void paint(Graphics g) {
		if(isRight == true) {
			g.drawLine(x, y, x + 5, y -5);
			x = x + 8;
			y = y - 8;
		}
		else {
			g.drawLine(x, y, x - 5, y - 5);
			x = x - 8;
			y = y - 8;
		}
	}

}
