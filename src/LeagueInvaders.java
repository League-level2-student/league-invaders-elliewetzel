import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	final static int WIDTH = 500;
	final static int HEIGHT = 800;
	GamePanel panel;
	
	
	
public static void main(String[] args) {
	LeagueInvaders league = new LeagueInvaders();
	league.setup();
}

public LeagueInvaders(){
	frame = new JFrame();
	frame.setSize(500, 800);
	panel = new GamePanel();
}

void setup() {
	frame.add(panel);
	frame.setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(panel);

}

private void setDefaultCloseOperation(int exitOnClose) {
	// TODO Auto-generated method stub
	
}


}
