public class Human extends Entity {

    public Human(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void attackAlien(Alien alien) {
        alien.takeDamage(attackPower);
    }

}
