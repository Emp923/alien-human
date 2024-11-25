import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HumanTest {

    private Human testHuman;
    private Alien testAlien;

    @Before
    public void setup() {
        testHuman = new Human("testHuman", 200);
        testAlien = new Alien("testAlien", 100);
    }

    @Test
    public void testAttackAlien() {
        testHuman.setAttackPower(20);
        testHuman.attackAlien(testAlien);
        Assert.assertEquals(80, testAlien.getHealthPoints());
    }

}
