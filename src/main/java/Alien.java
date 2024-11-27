public class Alien extends Entity {

    public Alien(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void attackEntity(Entity otherEntity) {
        if (!(otherEntity instanceof Alien)) {
            otherEntity.takeDamage(attackPower);
        }
    }

}
