public class Human extends Entity {

    public Human(String name, int healthPoints) {
        super(name, healthPoints);
    }

    @Override
    public void attackEntity(Entity otherEntity) {
        if (!(otherEntity instanceof Human)) {
            otherEntity.takeDamage(attackPower);
        }
    }

}
