import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 20;
		// TODO Auto-generated constructor stub
	}

	public void up() {
		y-=speed;
		if(y < 0) {
		    y = 1;
		  }
	}
	public void down() {
		y+=speed;
		if (y > 790){
		y = 750;
 }	
	}
	public void right() {
		x+=speed;
		if(x > 490) {
		x = 450; 
  }	
	}
	public void left() {
		x-=speed;
		if(x<0){
		    x = 1; 
		  }
	}
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
	}
}

