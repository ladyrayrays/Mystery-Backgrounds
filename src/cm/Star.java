package cm;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

public class Star {

    Color color;

    public Star() {
    	int xPoints[] = {9, 15, 0, 18, 3};
        int yPoints[] = {0, 18, 6, 6, 18};
        this.color = new Color((int) ((Math.random() * 255)), (int) (Math.random() * 255), (int) (Math.random() * 255));
    }

}