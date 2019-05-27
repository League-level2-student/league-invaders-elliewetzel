import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Font titleFont;
    Font enter;
    Font over;
    Font space;
    Font over2;
    Font over3;
    Timer frameDraw;
    Rocketship rocket = new Rocketship(250, 700, 50, 50);
    
    void updateMenuState() {   }
    void updateGameState() {   }
    void updateEndState()  {  }
    
    void drawMenuState(Graphics g) {  
    	g.setColor(Color.BLUE);
    	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
    	g.setFont(titleFont);
    	g.setColor(Color.YELLOW);
    	g.drawString("LEAGUE INVADERS", 20, 200);
    	g.setFont(enter);
    	g.setColor(Color.YELLOW);
    	g.drawString("Press ENTER to start", 110, 400);
    	g.setFont(space);
    	g.setColor(Color.YELLOW);
    	g.drawString("Press SPACE for instructions", 80, 600);
    }
    void drawGameState(Graphics g) { 
    	g.setColor(Color.BLACK);
    	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
    	rocket.draw(g);
    }
    void drawEndState(Graphics g)  {
    	g.setColor(Color.RED);
    	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
    	g.setFont(over);
    	g.setColor(Color.YELLOW);
    	g.drawString("GAME OVER", 100, 200);
    	g.setFont(over2);
    	g.drawString("You killed enemies", 140, 400);
    	g.setFont(over3);
    	g.drawString("Press ENTER to restart", 110, 600);
    	//g.drawString(iterator, x, y);
    	
    }

    public GamePanel() {
    	titleFont = new Font("Arial", Font.PLAIN, 48);
    	enter = new Font("Arial", Font.PLAIN, 24);
    	over = new Font("Arial", Font.PLAIN, 48);
    	space = new Font("Arial", Font.PLAIN, 24);
    	over2 = new Font("Arial", Font.PLAIN, 24);
    	over3 = new Font("Arial", Font.PLAIN, 26);
    	frameDraw = new Timer(1000/60, this);
    	frameDraw.start();
    }
    
@Override
public void paintComponent(Graphics g) {
	if(currentState == MENU){
	    drawMenuState(g);
	}else if(currentState == GAME){
	    drawGameState(g);
	}else if(currentState == END){
	    drawEndState(g);
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(currentState == MENU){
	    updateMenuState();
	}else if(currentState == GAME){
	    updateGameState();
	}else if(currentState == END){
	    updateEndState();
	}
	//System.out.println("action");
	repaint();
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	
	// TODO Auto-generated method stub
	if(e.getKeyCode()==KeyEvent.VK_ENTER) {
		if(currentState == END) {
			currentState = MENU;
		} else {
			currentState++;
		}
	}

	
	if (e.getKeyCode()==KeyEvent.VK_UP) {
	    System.out.println("UP");
	    rocket.up();
	}
	else if (e.getKeyCode()==KeyEvent.VK_DOWN) {
	    System.out.println("DOWN");
	    rocket.down();
	}
	else if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
	    System.out.println("RIGHT");
	    rocket.right();
	}
	else if (e.getKeyCode()==KeyEvent.VK_LEFT) {
	    System.out.println("LEFT");
	    rocket.left();
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}


}