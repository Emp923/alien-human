public class Alien extends Entity {

    public Alien(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void attackHuman(Human human) {
        human.takeDamage(attackPower);
    }

}
