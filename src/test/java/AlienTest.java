import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlienTest {

    private Alien testAlien;
    private Human testHuman;

    @Before
    public void setup() {
        testAlien = new Alien("testAlien", 200);
        testHuman = new Human("testHuman", 150);
    }

    @Test
    public void testAttackHuman() {
        testAlien.setAttackPower(20);
        testAlien.attackEntity(testHuman);
        Assert.assertEquals(130, testHuman.getHealthPoints());
    }

    @Test
    public void testCannotAttackOtherAlien() {
        Alien otherAlien = new Alien("otherAlien", 100);
        testAlien.setAttackPower(20);
        testAlien.attackEntity(otherAlien);
        Assert.assertEquals(100, otherAlien.getHealthPoints());
    }

    @Test
    public void testCannotAttackSelf() {
        testAlien.setAttackPower(10);
        testAlien.attackEntity(testAlien);
        Assert.assertEquals(200, testAlien.getHealthPoints());
    }
}
