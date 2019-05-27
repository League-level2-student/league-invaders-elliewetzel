import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
		// TODO Auto-generated constructor stub
	}

	public void up() {
		y-=speed;
	}
	public void down() {
		y+=speed;
	}
	public void right() {
		x+=speed;
	}
	public void left() {
		x-=speed;
	}
	
	
	void draw(Graphics g) {
		g.setColor(Color.BLUE);
		 g.fillRect(x, y, width, height);
		//g.fillRect(200, 780, 100, 100);
	}

	
	
	
	
}




/*if() {
    
	  if(x<0) {
	    x = 1;
	  }
	  else if(x > 500){
	   x = 499; 
	  }
	  else if(y < 0) {
	    y = 1;
	  }
	  else if (y > 800){
	   y = 799;
	  }*/