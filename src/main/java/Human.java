public class Human extends Entity {

    private int attackPower;

    public Human(String name, int healthPoints) {
        super(name, healthPoints);
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void attackAlien(Alien alien) {
        alien.takeDamage(attackPower);
    }

}
