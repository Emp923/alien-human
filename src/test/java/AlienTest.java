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
        testAlien.attackHuman(testHuman);
        Assert.assertEquals(130, testHuman.getHealthPoints());
    }
}
