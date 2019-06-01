import java.util.ArrayList;

public class ObjectManager {
Rocketship rock;
ArrayList<Projectile> project = new ArrayList<Projectile>();

public ObjectManager(Rocketship rock) {
	rock = new Rocketship(80, 80, 10, 10);
	this.rock = rock;
}

void addProjectile(Projectile p) {
	project.add(p);
}













}
