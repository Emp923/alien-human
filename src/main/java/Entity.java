public abstract class Entity {

    private final String name;
    private int healthPoints;
    protected int attackPower;

    public Entity(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void takeDamage(int attackPower) {
        healthPoints -= attackPower;
        if (healthPoints < 0) {
            healthPoints = 0;
        }
    }

}
