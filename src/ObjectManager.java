import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener {
	Rocketship rock;
	ArrayList<Projectile> project = new ArrayList<Projectile>();
	ArrayList<Alien> Aliens = new ArrayList<Alien>();
	Random random = new Random();
	int score = 0;
	
	public int getScore() {
		return score;
	}
	
	public ObjectManager(Rocketship rock) {
		// rock = new Rocketship(80, 80, 10, 10);
		this.rock = rock;
	}

	void addProjectile(Projectile p) {
		project.add(p);

	}

	void addAlien() {
		Aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH), 0, 50, 50));

	}

	void update() {

		if (rock.isActive == false) {

		} else {
			for (int i = 0; i < Aliens.size(); i++) {
				Aliens.get(i).update();

				if (Aliens.get(i).equals(LeagueInvaders.HEIGHT)) {
					Aliens.get(i).isActive = false;
				}
			}
			for (int i = 0; i < project.size(); i++) {
				project.get(i).update();

				if (project.get(i).equals(LeagueInvaders.HEIGHT)) {
					Aliens.get(i).isActive = false;
				}
			}
			checkCollision();
			purgeObjects();
		}

	}

	void draw(Graphics g) {
		rock.draw(g);
		for (int i = 0; i < Aliens.size(); i++) {
			Aliens.get(i).draw(g);
		}
		for (int i = 0; i < project.size(); i++) {
			project.get(i).draw(g);
		}
	}

	void purgeObjects() {
		for (int i = 0; i < Aliens.size(); i++) {
			if (!Aliens.get(i).isActive) {
				Aliens.remove(i);
			}
		}
	}

	void checkCollision() {
		for (int i = 0; i < Aliens.size(); i++) {
			for (int j = 0; j < project.size(); j++) {
				if (project.get(j).collisionBox.intersects(Aliens.get(i).collisionBox)) {
					Aliens.get(i).isActive = false;
					project.get(j).isActive = false;
					score++;
				}
			} score number
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		addAlien();
	}

}