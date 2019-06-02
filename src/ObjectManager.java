import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Rocketship rock;
ArrayList<Projectile> project = new ArrayList<Projectile>();
ArrayList<Alien> Aliens = new ArrayList<Alien>();
Random random = new Random();

public ObjectManager(Rocketship rock) {
	rock = new Rocketship(80, 80, 10, 10);
	//this.rock = rock;	

}
void addProjectile(Projectile p) {
	project.add(p);
}
void addAlien() {
	Aliens.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));

}
void update() {
	for(int i = 0; i < Aliens.size(); i++) {
		Aliens.get(i).update();
		
			if(Aliens.get(i).equals(LeagueInvaders.HEIGHT)) {	
			isActive = false;	
		}
	}
	for(int i = 0; i < project.size(); i++) {
		project.get(i).update();
		
		if(project.get(i).equals(LeagueInvaders.HEIGHT))  {
			isActive = false;
		}
	}
}
void draw(Graphics g) {
	rock.draw(g);
	for(int i = 0; i < Aliens.size(); i++) {
		Aliens.get(i).draw(g);
	}
	for(int i = 0; i < project.size(); i++) {
		project.get(i).draw(g);
	}
}

void purgeObjects() {
	//for(int i = 0; i < Aliens.size(); i++) {
	if(Aliens.get(i).equals(isActive = false)) {
		Aliens.remove(i); wrong, check end of step 7
	}
		//}


}







}