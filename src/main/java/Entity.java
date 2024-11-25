public abstract class Entity {

    private final String name;
    private int healthPoints;

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

    public void takeDamage(int attackPower) {
        healthPoints -= attackPower;
    }

}
