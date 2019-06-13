import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject {
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	


	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 20;
		// TODO Auto-generated constructor stub
		if (needImage) {
		    loadImage ("rocket.png");
		}
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
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}
	}
	public Projectile getProjectile() {
        return new Projectile(x+width/2, y, 10, 10);
} 
	
}

