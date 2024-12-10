import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EnvironmentTest {

    private Environment testEnvironment;

    @Before
    public void setup() {
        testEnvironment = new Environment();
    }

    @Test
    public void testNewEnvironmentHasZeroEntities() {
        Assert.assertEquals(0, testEnvironment.getEntityCount());
    }

    @Test
    public void testAddOneHumanIncreasesEntityCountToOne() {
        testEnvironment.addEntity(new Human("", 0));
        Assert.assertEquals(1, testEnvironment.getEntityCount());
    }

    @Test
    public void testAddOneAlienIncreasesEntityCountToOne() {
        testEnvironment.addEntity(new Alien("", 0));
        Assert.assertEquals(1, testEnvironment.getEntityCount());
    }

    @Test
    public void testAttackAllEntitiesInEnvironment() {
        Human testAttacker = new Human("", 100);
        testAttacker.setAttackPower(10);

        Human targetHuman1 = new Human("", 100);
        Human targetHuman2 = new Human("", 100);
        Alien targetAlien1 = new Alien("", 100);
        Alien targetAlien2 = new Alien("", 100);

        testEnvironment.addEntity(targetHuman1);
        testEnvironment.addEntity(targetHuman2);
        testEnvironment.addEntity(targetAlien1);
        testEnvironment.addEntity(targetAlien2);

        testEnvironment.attacksAllEntities(testAttacker);

        Assert.assertEquals(100, targetHuman1.getHealthPoints());
        Assert.assertEquals(100, targetHuman2.getHealthPoints());
        Assert.assertEquals(90, targetAlien1.getHealthPoints());
        Assert.assertEquals(90, targetAlien2.getHealthPoints());
    }

}
