import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EntityTest {

    private Entity testAlien;
    private Entity testHuman;

    @Before
    public void setup() {
        testAlien = new Alien("test alien", 100);
        testHuman = new Human("test human", 150);
    }

    @Test
    public void testEntityConstruction() {
        Assert.assertEquals("test alien", testAlien.getName());
        Assert.assertEquals("test human", testHuman.getName());

        Assert.assertEquals(100, testAlien.getHealthPoints());
        Assert.assertEquals(150, testHuman.getHealthPoints());
    }

    @Test
    public void testTakeDamage() {
        testAlien.takeDamage(20);
        testHuman.takeDamage(20);

        Assert.assertEquals(80, testAlien.getHealthPoints());
        Assert.assertEquals(130, testHuman.getHealthPoints());
    }

    @Test
    public void testHealthPointsNeverGoBelowZero() {
        testAlien.takeDamage(101);
        testHuman.takeDamage(151);

        Assert.assertEquals(0, testAlien.getHealthPoints());
        Assert.assertEquals(0, testHuman.getHealthPoints());
    }

}
