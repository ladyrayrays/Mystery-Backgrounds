package cm;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class panel extends JPanel {
	
	private int DEFAULT_WIDTH = 750;
	private int DEFAULT_HEIGHT = 750;
	
	private ArrayList<drop> drops = new ArrayList<drop>();
	
	public panel() {
		createPanel();
		createDrops();
	}
	
	public void createPanel() {
		this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		this.setBackground(Color.BLACK);
	}
	
	private void createDrops() {
		for(int i = 0; i < (this.getWidth() + this.getHeight()) / 2; i++) {
			int randomX = (int) (Math.random()*(this.getWidth()));
			int randomY = (int) (Math.random()*300);
			int randomV = (int) (Math.random()*10);
			drops.add(new drop(randomX,randomY,randomV));
		}
	}
	
	private void changeDropsRandom(int i) {
		int randomX = (int) (Math.random()*(this.getWidth()));
		int randomY = (int) (Math.random()*200);
		int randomV = (int) (Math.random()*10);
		drops.set(i,new drop(randomX,randomY,randomV));
}
	@Override
	public void paint(Graphics g) {
		if(drops.size() < (this.getHeight() + this.getWidth()) / 2) {
			drops.clear();
			createDrops();
		}
		else if(drops.size() > (this.getHeight() + this.getWidth()) / 2) {
			drops.clear();
			createDrops();
		}
		
		for(int i = 0; i < drops.size(); i++) {
			drops.get(i).paint(g);
			
			if(drops.get(i).y >= this.getHeight() - 15) {
				splash splashLeft = new splash(drops.get(i).x , drops.get(i).velocity, false);
				splash splashRight = new splash(drops.get(i).x, drops.get(i).y, true);
				splashLeft.paint(g);
				splashRight.paint(g);
			}
			
			if(drops.get(i).y >= this.getHeight() || drops.get(i).x >= this.getWidth()) {
				changeDropsRandom(i);
			}
		}
	}

}
